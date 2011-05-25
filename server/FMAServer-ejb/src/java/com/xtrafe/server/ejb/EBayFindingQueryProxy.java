/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtrafe.server.ejb;

import com.ebay.services.finding.SearchItem;
import com.ebay.services.finding.SimpleFindingClient;
import com.ebay.services.finding.SortOrderType;
import com.xtrafe.fma.shared.SharedEbayIdList;
import com.xtrafe.fma.shared.SharedEbayIdSortType;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class EBayFindingQueryProxy {    
    
    public SharedEbayIdList keywordSearch(String keywords, SharedEbayIdSortType sortOrder) {
        SharedEbayIdList ids = new SharedEbayIdList();
        SortOrderType ebaySortOrder;
        
        if ((sortOrder == null) ||
            (sortOrder.equals(SharedEbayIdSortType.NONE)))
            ebaySortOrder = SortOrderType.PRICE_PLUS_SHIPPING_HIGHEST;
        else
            ebaySortOrder =SortOrderType.valueOf(sortOrder.name());    
        
        List<SearchItem> results = SimpleFindingClient.keywordSearch(keywords, ebaySortOrder);
        if (results != null)
            for (SearchItem searchItem : results)
                ids.add(searchItem.getItemId());
                
        System.out.println("Found " + ids.size() + " items.");
        return ids;
    }
}
