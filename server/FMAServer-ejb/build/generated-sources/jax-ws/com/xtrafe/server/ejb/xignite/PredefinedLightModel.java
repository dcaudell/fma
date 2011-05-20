
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredefinedLightModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PredefinedLightModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="SoftTopLeft"/>
 *     &lt;enumeration value="SoftFrontal"/>
 *     &lt;enumeration value="SoftTopRight"/>
 *     &lt;enumeration value="ShinyTopLeft"/>
 *     &lt;enumeration value="ShinyFrontal"/>
 *     &lt;enumeration value="ShinyTopRight"/>
 *     &lt;enumeration value="MetallicLustre"/>
 *     &lt;enumeration value="NorthernLights"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PredefinedLightModel")
@XmlEnum
public enum PredefinedLightModel {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SoftTopLeft")
    SOFT_TOP_LEFT("SoftTopLeft"),
    @XmlEnumValue("SoftFrontal")
    SOFT_FRONTAL("SoftFrontal"),
    @XmlEnumValue("SoftTopRight")
    SOFT_TOP_RIGHT("SoftTopRight"),
    @XmlEnumValue("ShinyTopLeft")
    SHINY_TOP_LEFT("ShinyTopLeft"),
    @XmlEnumValue("ShinyFrontal")
    SHINY_FRONTAL("ShinyFrontal"),
    @XmlEnumValue("ShinyTopRight")
    SHINY_TOP_RIGHT("ShinyTopRight"),
    @XmlEnumValue("MetallicLustre")
    METALLIC_LUSTRE("MetallicLustre"),
    @XmlEnumValue("NorthernLights")
    NORTHERN_LIGHTS("NorthernLights");
    private final String value;

    PredefinedLightModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredefinedLightModel fromValue(String v) {
        for (PredefinedLightModel c: PredefinedLightModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
