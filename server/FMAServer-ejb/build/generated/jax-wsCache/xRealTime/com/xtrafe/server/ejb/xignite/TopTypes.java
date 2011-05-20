
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TopTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Movers"/>
 *     &lt;enumeration value="Gainers"/>
 *     &lt;enumeration value="Losers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TopTypes")
@XmlEnum
public enum TopTypes {

    @XmlEnumValue("Movers")
    MOVERS("Movers"),
    @XmlEnumValue("Gainers")
    GAINERS("Gainers"),
    @XmlEnumValue("Losers")
    LOSERS("Losers");
    private final String value;

    TopTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TopTypes fromValue(String v) {
        for (TopTypes c: TopTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
