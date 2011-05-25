
package com.ebay.services.shopping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HalfItemConditionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HalfItemConditionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BrandNew"/>
 *     &lt;enumeration value="LikeNew"/>
 *     &lt;enumeration value="VeryGood"/>
 *     &lt;enumeration value="Good"/>
 *     &lt;enumeration value="Acceptable"/>
 *     &lt;enumeration value="Used"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HalfItemConditionCodeType")
@XmlEnum
public enum HalfItemConditionCodeType {


    /**
     * 
     * 						New, unread, unused and in perfect condition.
     * 					
     * 
     */
    @XmlEnumValue("BrandNew")
    BRAND_NEW("BrandNew"),

    /**
     * 
     * 						Item still in original packaging, no wear and tear, all 
     * 						facets of the product are intact.  (Could easily be mistaken 
     * 						for brand new.)
     * 					
     * 
     */
    @XmlEnumValue("LikeNew")
    LIKE_NEW("LikeNew"),

    /**
     * 
     * 						Doesn't look brand new but has no easily noticeable damage 
     * 						and very minimal wear and tear.  (You would give it to a 
     * 						good friend as a gift)
     * 					
     * 
     */
    @XmlEnumValue("VeryGood")
    VERY_GOOD("VeryGood"),

    /**
     * 
     * 						Very minimal damage to the item and still includes all accessories 
     * 						such as dust jackets, liner notes, and cases.
     * 						(You would use it yourself, but wouldn't necessarily give it as a gift)
     * 					
     * 
     */
    @XmlEnumValue("Good")
    GOOD("Good"),

    /**
     * 
     * 						Some damage to the item but integrity still intact.  May be missing an
     * 						accessory. (Item beaten up a bit but it works)
     * 					
     * 
     */
    @XmlEnumValue("Acceptable")
    ACCEPTABLE("Acceptable"),

    /**
     * 
     * 						Some damage to the item and visibly used.
     * 					
     * 
     */
    @XmlEnumValue("Used")
    USED("Used"),

    /**
     * 
     * 						(out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    HalfItemConditionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HalfItemConditionCodeType fromValue(String v) {
        for (HalfItemConditionCodeType c: HalfItemConditionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
