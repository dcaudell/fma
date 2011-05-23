
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Top complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Top">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}TopTypes"/>
 *         &lt;element name="Quotes" type="{http://www.xignite.com/services/}ArrayOfRealTimeQuote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Top", propOrder = {
    "type",
    "quotes"
})
public class Top
    extends Common
{

    @XmlElement(name = "Type", required = true)
    protected TopTypes type;
    @XmlElement(name = "Quotes")
    protected ArrayOfRealTimeQuote quotes;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TopTypes }
     *     
     */
    public TopTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopTypes }
     *     
     */
    public void setType(TopTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the quotes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRealTimeQuote }
     *     
     */
    public ArrayOfRealTimeQuote getQuotes() {
        return quotes;
    }

    /**
     * Sets the value of the quotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRealTimeQuote }
     *     
     */
    public void setQuotes(ArrayOfRealTimeQuote value) {
        this.quotes = value;
    }

}
