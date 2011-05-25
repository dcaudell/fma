package com.xtrafe.server.ejb;

import com.ebay.services.client.ShoppingServiceClientFactory;
import com.ebay.services.shopping.GetSingleItemRequestType;
import com.ebay.services.shopping.GetSingleItemResponseType;
import com.ebay.services.shopping.ShoppingInterface;
import com.ebay.services.shopping.SimpleItemType;;
import com.xtrafe.fma.shared.SharedEbayItem;
import com.xtrafe.server.log.Log;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class EBayShoppingQueryProxy {   
    
    private ShoppingInterface serviceClient;
    
    @PostConstruct
    public void postConstruct() {
        serviceClient = ShoppingServiceClientFactory.getServiceClient();
    }
    
    public SharedEbayItem findById(String id) {
        SharedEbayItem item = new SharedEbayItem();
        try {
            long start = System.currentTimeMillis();
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
                                
                if (ebayItem.getViewItemURLForNaturalSearch() != null)
                    item.setItemURL(ebayItem.getViewItemURLForNaturalSearch());
                
                if (ebayItem.getCurrentPrice() != null)
                    item.setCurrentPrice(String.valueOf(ebayItem.getCurrentPrice().getValue()));
                else if (ebayItem.getMinimumToBid() != null)
                    item.setCurrentPrice(String.valueOf(ebayItem.getMinimumToBid().getValue()));
                else if (ebayItem.getConvertedCurrentPrice() != null)
                    item.setCurrentPrice(String.valueOf(ebayItem.getConvertedCurrentPrice().getValue()));
                else if (ebayItem.getBuyItNowPrice() != null)
                    item.setCurrentPrice(String.valueOf(ebayItem.getBuyItNowPrice().getValue()));
                Log.out("Item query took " + String.valueOf(System.currentTimeMillis() - start) + "ms");
            }           
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }
    
    public String findInfoStringById(String id) {
        StringBuffer buffer = new StringBuffer();
        try {
            long start = System.currentTimeMillis();
            GetSingleItemRequestType request = new GetSingleItemRequestType();
            request.setItemID(id);            
            GetSingleItemResponseType response = serviceClient.getSingleItem(request);                                   //
            
            SimpleItemType ebayItem = response.getItem();
            if (ebayItem != null) {
                
                
                //TITLE|BIDCOUNT|DESC|ENDTIME|URL|PRICE
                
                buffer.append(ebayItem.getTitle());
                buffer.append("|");
                buffer.append(ebayItem.getBidCount());
                buffer.append("|");
                buffer.append(ebayItem.getDescription());
                buffer.append("|");                
                if (ebayItem.getEndTime() != null)
                    buffer.append(ebayItem.getEndTime().toString());
                else
                    buffer.append("null");
                                          
                buffer.append("|");
                if (ebayItem.getViewItemURLForNaturalSearch() != null)
                    buffer.append(ebayItem.getViewItemURLForNaturalSearch());
                else
                    buffer.append("null");
                buffer.append("|");
                
                if (ebayItem.getCurrentPrice() != null)
                    buffer.append(ebayItem.getCurrentPrice().getValue());
                else if (ebayItem.getMinimumToBid() != null)
                    buffer.append(String.valueOf(ebayItem.getMinimumToBid().getValue()));
                else if (ebayItem.getConvertedCurrentPrice() != null)
                    buffer.append(String.valueOf(ebayItem.getConvertedCurrentPrice().getValue()));
                else if (ebayItem.getBuyItNowPrice() != null)
                    buffer.append(String.valueOf(ebayItem.getBuyItNowPrice().getValue()));
                else
                    buffer.append("null");
                Log.out("Item query took " + String.valueOf(System.currentTimeMillis() - start) + "ms");
            }           
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
