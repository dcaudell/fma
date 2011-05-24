
package com.ebay.services.shopping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Flat"/>
 *     &lt;enumeration value="Calculated"/>
 *     &lt;enumeration value="Freight"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="FlatDomesticCalculatedInternational"/>
 *     &lt;enumeration value="CalculatedDomesticFlatInternational"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingTypeCodeType")
@XmlEnum
public enum ShippingTypeCodeType {


    /**
     * 
     * 						The flat rate shipping model: the seller establishes the cost of shipping and cost of
     * 						shipping insurance, regardless of what any buyer-selected shipping service
     * 						might charge the seller.
     * 					
     * 
     */
    @XmlEnumValue("Flat")
    FLAT("Flat"),

    /**
     * 
     * 						The calculated shipping model: the posted cost of shipping is based on the
     * 						seller-offered and buyer-selected shipping service, where the shipping costs
     * 						are calculated by eBay and the shipping carrier based on the buyer's address,
     * 						and any packaging/handling costs established by the seller are automatically
     * 						rolled into the total.
     * 					
     * 
     */
    @XmlEnumValue("Calculated")
    CALCULATED("Calculated"),

    /**
     * 
     * 						The freight shipping model: the cost of shipping is determined by a third
     * 						party, FreightQuote.com, based on the item location (zip code). Currently,
     * 						Freight can only be specified on input via eBay Web site, not via API.
     * 					
     * 
     */
    @XmlEnumValue("Freight")
    FREIGHT("Freight"),

    /**
     * 
     * 						Free is used when the seller is declaring that shipping is free for the buyer.
     * 						Since Free cannot be selected via API, the seller has two options for
     * 						signifying that shipping is free when listing an item:
     * 						<br>
     * 						- omit shipping details, mention in the item description that shipping is
     * 						free, and set ShippingTermsInDescription to true
     * 						<br>
     * 						- select an arbitrary shipping service and set its shipping cost to 0, mention
     * 						in the item description that shipping is free, and set
     * 						ShippingTermsInDescription to true
     * 						<br>
     * 						The latter is a better way to communicate "free shipping" because eBay picks
     * 						up the "0" cost and can more accurately identify shipping costs in search
     * 						results.
     * 					
     * 
     */
    @XmlEnumValue("Free")
    FREE("Free"),

    /**
     * 
     * 						The seller did not specify the shipping type.
     * 					
     * 
     */
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),

    /**
     * 
     * 						The seller specified one or more flat domestic shipping services
     * 						and one or more calculated international shipping services.
     * 					
     * 
     */
    @XmlEnumValue("FlatDomesticCalculatedInternational")
    FLAT_DOMESTIC_CALCULATED_INTERNATIONAL("FlatDomesticCalculatedInternational"),

    /**
     * 
     * 						The seller specified one or more calculated domestic shipping services
     * 						and one or more flat international shipping services.
     * 					
     * 
     */
    @XmlEnumValue("CalculatedDomesticFlatInternational")
    CALCULATED_DOMESTIC_FLAT_INTERNATIONAL("CalculatedDomesticFlatInternational"),

    /**
     * 
     * 						Placeholder value. See
     * 						<a href="types/simpleTypes.html#token">token</a>.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingTypeCodeType fromValue(String v) {
        for (ShippingTypeCodeType c: ShippingTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
