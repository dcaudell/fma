
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ECNTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ECNTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Island"/>
 *     &lt;enumeration value="INET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECNTypes")
@XmlEnum
public enum ECNTypes {

    @XmlEnumValue("Island")
    ISLAND("Island"),
    INET("INET");
    private final String value;

    ECNTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECNTypes fromValue(String v) {
        for (ECNTypes c: ECNTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
