package com.ebay.services.finding;

import com.ebay.services.client.ClientConfig;
import com.ebay.services.client.FindingServiceClientFactory;
import java.util.ArrayList;
import java.util.List;

public class SimpleFindingClient {
    private final static int maxResults = 2000;
    private final static int pageSize = 100;
    
    public static List<SearchItem> keywordSearch(String keywords, SortOrderType sortOrder) { 
        List<SearchItem> results = new ArrayList<SearchItem>();
        try {
            if (sortOrder == null)
                sortOrder = SortOrderType.BEST_MATCH;
            
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
                request.setSortOrder(SortOrderType.BEST_MATCH);                
                
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
                        
                if (result.getSearchResult().getItem() != null)
                    results.addAll(result.getSearchResult().getItem());                    
            }
            while ((count == pageSize) &&
                   (results.size() < maxResults));
        } 
        catch (Exception ex) {
            // handle exception if any 
            ex.printStackTrace();
        }
        //System.out.println("Found " + ids.size() + " items.");
        return results;
    }    
}
