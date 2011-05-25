package com.ebay.services.shopping;

import com.ebay.services.client.ShoppingServiceClientFactory;

public class SimpleShoppingClient {
    
    public static SimpleItemType getItemById(String id) {
        ShoppingInterface serviceClient = ShoppingServiceClientFactory.getServiceClient();
        GetSingleItemRequestType request = new GetSingleItemRequestType();
        request.setItemID(id);            
        GetSingleItemResponseType response = serviceClient.getSingleItem(request);
        return response.getItem();
    }        
}
