
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Same"/>
 *     &lt;enumeration value="Up"/>
 *     &lt;enumeration value="Down"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionTypes")
@XmlEnum
public enum DirectionTypes {

    @XmlEnumValue("Same")
    SAME("Same"),
    @XmlEnumValue("Up")
    UP("Up"),
    @XmlEnumValue("Down")
    DOWN("Down");
    private final String value;

    DirectionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionTypes fromValue(String v) {
        for (DirectionTypes c: DirectionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
