
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentifierTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentifierTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Symbol"/>
 *     &lt;enumeration value="CIK"/>
 *     &lt;enumeration value="CUSIP"/>
 *     &lt;enumeration value="ISIN"/>
 *     &lt;enumeration value="Valoren"/>
 *     &lt;enumeration value="SEDOL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentifierTypes")
@XmlEnum
public enum IdentifierTypes {

    @XmlEnumValue("Symbol")
    SYMBOL("Symbol"),
    CIK("CIK"),
    CUSIP("CUSIP"),
    ISIN("ISIN"),
    @XmlEnumValue("Valoren")
    VALOREN("Valoren"),
    SEDOL("SEDOL");
    private final String value;

    IdentifierTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentifierTypes fromValue(String v) {
        for (IdentifierTypes c: IdentifierTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
