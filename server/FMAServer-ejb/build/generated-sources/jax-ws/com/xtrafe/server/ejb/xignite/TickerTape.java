
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TickerTape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TickerTape">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Tape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TickerTape", propOrder = {
    "tape"
})
public class TickerTape
    extends Common
{

    @XmlElement(name = "Tape")
    protected String tape;

    /**
     * Gets the value of the tape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTape() {
        return tape;
    }

    /**
     * Sets the value of the tape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTape(String value) {
        this.tape = value;
    }

}
