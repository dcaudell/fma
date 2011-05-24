package com.xtrafe.server.ejb;

import com.ebay.services.client.ShoppingServiceClientFactory;
import com.ebay.services.shopping.GetSingleItemRequestType;
import com.ebay.services.shopping.GetSingleItemResponseType;
import com.ebay.services.shopping.ShoppingInterface;
import com.ebay.services.shopping.SimpleItemType;
import com.xtrafe.fma.shared.SharedEbayItem;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class EBayShoppingQueryProxy {   
    
    public SharedEbayItem findById(String id) {
        SharedEbayItem item = new SharedEbayItem();
        try {            
            ShoppingInterface serviceClient = ShoppingServiceClientFactory.getServiceClient();
            GetSingleItemRequestType request = new GetSingleItemRequestType();
            request.setItemID(id);            
            GetSingleItemResponseType response = serviceClient.getSingleItem(request);
            SimpleItemType ebayItem = response.getItem();
            if (ebayItem != null) {
                item.setTitle(ebayItem.getTitle());
                item.setBidCount(ebayItem.getBidCount());
                item.setDescription(ebayItem.getDescription());
                
                if ((ebayItem.getPictureURL() != null) &&
                     (ebayItem.getPictureURL().size() > 0))
                    item.setPictureURL(ebayItem.getPictureURL().get(0));
                               
                if (ebayItem.getEndTime() != null)
                    item.setEndTime(ebayItem.getEndTime().toString());                                                
                
                if (item.getCurrentPrice() != null)
                    item.setCurrentPrice(ebayItem.getCurrentPrice().toString());
                else if (ebayItem.getMinimumToBid() != null)
                    item.setCurrentPrice(ebayItem.getMinimumToBid().toString());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }
}
