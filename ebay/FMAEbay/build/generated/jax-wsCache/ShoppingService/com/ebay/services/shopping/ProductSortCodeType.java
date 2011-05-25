
package com.ebay.services.shopping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSortCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductSortCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Popularity"/>
 *     &lt;enumeration value="Rating"/>
 *     &lt;enumeration value="ReviewCount"/>
 *     &lt;enumeration value="ItemCount"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductSortCodeType")
@XmlEnum
public enum ProductSortCodeType {


    /**
     * 
     * 						Sort by product popularity (as determined by eBay).
     * 						(This is the default sort order.)
     * 					
     * 
     */
    @XmlEnumValue("Popularity")
    POPULARITY("Popularity"),

    /**
     * 
     * 						Sort by average rating.
     * 					
     * 
     */
    @XmlEnumValue("Rating")
    RATING("Rating"),

    /**
     * 
     * 						Sort by the number of reviews on eBay.
     * 					
     * 
     */
    @XmlEnumValue("ReviewCount")
    REVIEW_COUNT("ReviewCount"),

    /**
     * 
     * 						Sort by the number of active items listed with this product.
     * 					
     * 
     */
    @XmlEnumValue("ItemCount")
    ITEM_COUNT("ItemCount"),

    /**
     * 
     * 						Sort by the product title.
     * 					
     * 
     */
    @XmlEnumValue("Title")
    TITLE("Title"),

    /**
     * 
     * 						Reserved for values that are not available in the version of the schema
     * 						you are using. If eBay adds a new value to this code type as of a
     * 						newer version, we return CustomCode instead when you specify a
     * 						lower request version.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ProductSortCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductSortCodeType fromValue(String v) {
        for (ProductSortCodeType c: ProductSortCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
