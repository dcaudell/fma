/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtrafe.fma.shared;

public class SharedEbayItem 
    extends SharedObjBase
{
    String itemURL;
    String pictureURL;
    String title;
    String endTime;
    int bidCount;
    String currentPrice;
    String description;
    
    public static SharedEbayItem fromString(String info){
        if (info == null)
            return null;
        SharedEbayItem newItem = new SharedEbayItem();
        //TITLE|BIDCOUNT|DESC|ENDTIME|URL|PRICE
        String[] strings = info.split("|");
        newItem.title = strings[0];
        try {
            newItem.bidCount = Integer.valueOf(strings[1]);
        }
        catch(NumberFormatException e) {
            //do nothing.
        }
        newItem.description = strings[2];
        newItem.endTime = strings[3];
        newItem.itemURL = strings[4];
        newItem.currentPrice = strings[5];
        return newItem;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }

    public int getBidCount() {
        return bidCount;
    }

    public void setBidCount(int bidCount) {
        this.bidCount = bidCount;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getItemURL() {
        return itemURL;        
    }
    
    public void setItemURL(String itemURL){
        this.itemURL = itemURL;
    }
    
    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }       
}
