
package com.ebay.services.shopping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReviewSortCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReviewSortCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CreationTime"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReviewSortCodeType")
@XmlEnum
public enum ReviewSortCodeType {


    /**
     * 
     * 						Sorts reviews by creation time, in ascending or descending order.
     * 					
     * 
     */
    @XmlEnumValue("CreationTime")
    CREATION_TIME("CreationTime"),

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

    ReviewSortCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReviewSortCodeType fromValue(String v) {
        for (ReviewSortCodeType c: ReviewSortCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
