
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoricalPeriods.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HistoricalPeriods">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PreviousDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HistoricalPeriods")
@XmlEnum
public enum HistoricalPeriods {

    @XmlEnumValue("PreviousDay")
    PREVIOUS_DAY("PreviousDay");
    private final String value;

    HistoricalPeriods(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HistoricalPeriods fromValue(String v) {
        for (HistoricalPeriods c: HistoricalPeriods.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
