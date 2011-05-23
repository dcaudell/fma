
package com.xtrafe.server.ejb.xignite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExtendedRealTimeQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExtendedRealTimeQuote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtendedRealTimeQuote" type="{http://www.xignite.com/services/}ExtendedRealTimeQuote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtendedRealTimeQuote", propOrder = {
    "extendedRealTimeQuote"
})
public class ArrayOfExtendedRealTimeQuote {

    @XmlElement(name = "ExtendedRealTimeQuote", nillable = true)
    protected List<ExtendedRealTimeQuote> extendedRealTimeQuote;

    /**
     * Gets the value of the extendedRealTimeQuote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedRealTimeQuote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedRealTimeQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedRealTimeQuote }
     * 
     * 
     */
    public List<ExtendedRealTimeQuote> getExtendedRealTimeQuote() {
        if (extendedRealTimeQuote == null) {
            extendedRealTimeQuote = new ArrayList<ExtendedRealTimeQuote>();
        }
        return this.extendedRealTimeQuote;
    }

}
