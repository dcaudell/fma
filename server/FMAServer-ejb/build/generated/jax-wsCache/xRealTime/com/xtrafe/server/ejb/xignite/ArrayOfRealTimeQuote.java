
package com.xtrafe.server.ejb.xignite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRealTimeQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRealTimeQuote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RealTimeQuote" type="{http://www.xignite.com/services/}RealTimeQuote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRealTimeQuote", propOrder = {
    "realTimeQuote"
})
public class ArrayOfRealTimeQuote {

    @XmlElement(name = "RealTimeQuote", nillable = true)
    protected List<RealTimeQuote> realTimeQuote;

    /**
     * Gets the value of the realTimeQuote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realTimeQuote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealTimeQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealTimeQuote }
     * 
     * 
     */
    public List<RealTimeQuote> getRealTimeQuote() {
        if (realTimeQuote == null) {
            realTimeQuote = new ArrayList<RealTimeQuote>();
        }
        return this.realTimeQuote;
    }

}
