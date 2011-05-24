/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtrafe.server.ejb;

import com.ebay.services.client.ClientConfig;
import com.ebay.services.client.FindingServiceClientFactory;
import com.ebay.services.finding.AckValue;
import com.ebay.services.finding.FindItemsByKeywordsRequest;
import com.ebay.services.finding.FindItemsByKeywordsResponse;
import com.ebay.services.finding.FindingServicePortType;
import com.ebay.services.finding.PaginationInput;
import com.ebay.services.finding.SearchItem;
import com.ebay.services.finding.SearchResult;
import com.ebay.services.finding.SortOrderType;
import com.xtrafe.fma.shared.SharedEbayIdList;
import com.xtrafe.fma.shared.SharedEbayIdSortType;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class EBayFindingQueryProxy {

    private final static int maxResults = 2000;
    private final static int pageSize = 100;
    
    public SharedEbayIdList keywordSearch(String keywords, SharedEbayIdSortType sortType) {
        SharedEbayIdList ids = new SharedEbayIdList();
        try {
            if (sortType == null)
                sortType = SharedEbayIdSortType.NONE;
            
            // initialize service end-point configuration            
            ClientConfig config = new ClientConfig();            
            config.setApplicationId("none23e13-1250-4872-bc47-d533c3b25e0");

            //create a service client 
            FindingServicePortType serviceClient = FindingServiceClientFactory.getServiceClient(config);                       
            
            //call service 
            int i = 1;
            int count;
            FindItemsByKeywordsResponse result;
            do {
                count = 0;
                
                FindItemsByKeywordsRequest request = new FindItemsByKeywordsRequest();

                request.setKeywords(keywords);
                if (sortType.equals(SharedEbayIdSortType.NONE))
                    request.setSortOrder(SortOrderType.BEST_MATCH);
                else
                    request.setSortOrder(SortOrderType.valueOf(sortType.name()));                                
                
                PaginationInput pi = new PaginationInput();
                pi.setEntriesPerPage(pageSize);
                pi.setPageNumber(i++);
                request.setPaginationInput(pi);
                
                result = serviceClient.findItemsByKeywords(request);
                                                                
                if (AckValue.fromValue(result.getAck().value()).equals(AckValue.FAILURE))
                    count = 0;
                else if (result.getSearchResult() == null)
                    count = 0;
                else
                    count = result.getSearchResult().getCount();                                
                
                SearchResult foo;
                if (count > 0)
                    for (SearchItem item : result.getSearchResult().getItem()){
                        ids.add(item.getItemId());
                        System.out.println("Id = " + item.getItemId());
                        System.out.println("ProdID = " + item.getProductId());
                    }
            }
            while ((count == pageSize) &&
                   (ids.size() < maxResults));
        } 
        catch (Exception ex) {
            // handle exception if any 
            ex.printStackTrace();
        }
        System.out.println("Found " + ids.size() + " items.");
        return ids;
    }
}
