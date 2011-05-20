
package com.xtrafe.server.ejb.xignite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTicks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTicks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ticks" type="{http://www.xignite.com/services/}Ticks" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTicks", propOrder = {
    "ticks"
})
public class ArrayOfTicks {

    @XmlElement(name = "Ticks", nillable = true)
    protected List<Ticks> ticks;

    /**
     * Gets the value of the ticks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ticks }
     * 
     * 
     */
    public List<Ticks> getTicks() {
        if (ticks == null) {
            ticks = new ArrayList<Ticks>();
        }
        return this.ticks;
    }

}
