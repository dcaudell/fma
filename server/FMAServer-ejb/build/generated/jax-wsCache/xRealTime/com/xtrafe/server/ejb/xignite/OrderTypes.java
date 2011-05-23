
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Buy"/>
 *     &lt;enumeration value="Sell"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderTypes")
@XmlEnum
public enum OrderTypes {

    @XmlEnumValue("Buy")
    BUY("Buy"),
    @XmlEnumValue("Sell")
    SELL("Sell"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    OrderTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderTypes fromValue(String v) {
        for (OrderTypes c: OrderTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
