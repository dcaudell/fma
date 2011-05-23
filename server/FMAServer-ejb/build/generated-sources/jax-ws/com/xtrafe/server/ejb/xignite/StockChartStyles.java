
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockChartStyles.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StockChartStyles">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Line"/>
 *     &lt;enumeration value="Candle"/>
 *     &lt;enumeration value="Stick"/>
 *     &lt;enumeration value="Area"/>
 *     &lt;enumeration value="Percentage"/>
 *     &lt;enumeration value="LinePercentage"/>
 *     &lt;enumeration value="CandlePercentage"/>
 *     &lt;enumeration value="StickPercentage"/>
 *     &lt;enumeration value="AreaPercentage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StockChartStyles")
@XmlEnum
public enum StockChartStyles {

    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("Candle")
    CANDLE("Candle"),
    @XmlEnumValue("Stick")
    STICK("Stick"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("Percentage")
    PERCENTAGE("Percentage"),
    @XmlEnumValue("LinePercentage")
    LINE_PERCENTAGE("LinePercentage"),
    @XmlEnumValue("CandlePercentage")
    CANDLE_PERCENTAGE("CandlePercentage"),
    @XmlEnumValue("StickPercentage")
    STICK_PERCENTAGE("StickPercentage"),
    @XmlEnumValue("AreaPercentage")
    AREA_PERCENTAGE("AreaPercentage");
    private final String value;

    StockChartStyles(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StockChartStyles fromValue(String v) {
        for (StockChartStyles c: StockChartStyles.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
