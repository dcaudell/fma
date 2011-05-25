
package com.ebay.services.shopping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductIDCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductIDCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ISBN"/>
 *     &lt;enumeration value="EAN"/>
 *     &lt;enumeration value="UPC"/>
 *     &lt;enumeration value="MPN"/>
 *     &lt;enumeration value="Keywords"/>
 *     &lt;enumeration value="CatalogItem"/>
 *     &lt;enumeration value="Reference"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductIDCodeType")
@XmlEnum
public enum ProductIDCodeType {


    /**
     * 
     * 						ISBN-10 or ISBN-13 value for books. (The string length of ProductID
     * 						indicates whether the ID is 10 or 13 characters.)
     * 						If you know a book's ISBN, you can use this instead of the
     * 						eBay CatalogItem or Reference ID to search for that book.
     * 						Max length of corresponding value: 13
     * 					
     * 
     */
    ISBN("ISBN"),

    /**
     * 
     * 						EAN value for books. (This is used more commonly in
     * 						European countries.)
     * 						If you know a book's EAN, you can use this instead of the
     * 						eBay CatalogItem or Reference ID to search for that book.
     * 						Max length of corresponding value: 13
     * 					
     * 
     */
    EAN("EAN"),

    /**
     * 
     * 						UPC value for products in Music (e.g., CDs), DVDs & Movies,
     * 						and Video Games categories (or domains).
     * 						If you know a product's UPC, you can use this instead of the
     * 						eBay CatalogItem or Reference ID to search for that product.
     * 						Max length of corresponding value: 12
     * 					
     * 
     */
    UPC("UPC"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    MPN("MPN"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Keywords")
    KEYWORDS("Keywords"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CatalogItem")
    CATALOG_ITEM("CatalogItem"),

    /**
     * 
     * 						The global reference ID for an eBay catalog product.
     * 						A reference ID is a fixed reference to a product
     * 						(regardless of version). 
     * 						One reference ID can be associated with multiple CatalogItem IDs.
     * 						To determine valid reference IDs for products to use as input to FindProducts, first call
     * 						FindProducts with QueryKeywords (or ProductID).
     * 						Each product in the response includes a reference ID.<br>
     * 						<br>
     * 						As of mid-2008, some sites (such as eBay US, Germany, Austria, and Switzerland) are 
     * 						updating, replacing, deleting, or merging some products (as a result of migrating from one
     * 						catalog data provider to another). 
     * 						If you specify one of these products in a request, the call may return the product with a warning, 
     * 						or it may return an error if the product has been deleted.
     * 					
     * 
     */
    @XmlEnumValue("Reference")
    REFERENCE("Reference"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ProductIDCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductIDCodeType fromValue(String v) {
        for (ProductIDCodeType c: ProductIDCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
