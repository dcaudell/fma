
package com.ebay.services.shopping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				These are request errors (as opposed to system errors) that occur due to problems
 * 				with business-level data (e.g., an invalid combination of arguments) that
 * 				the application passed in.
 * 			
 * 
 * <p>Java class for ErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShortMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="UserDisplayHint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SeverityCode" type="{urn:ebay:apis:eBLBaseComponents}SeverityCodeType" minOccurs="0"/>
 *         &lt;element name="ErrorParameters" type="{urn:ebay:apis:eBLBaseComponents}ErrorParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ErrorClassification" type="{urn:ebay:apis:eBLBaseComponents}ErrorClassificationCodeType" minOccurs="0"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", propOrder = {
    "shortMessage",
    "longMessage",
    "errorCode",
    "userDisplayHint",
    "severityCode",
    "errorParameters",
    "errorClassification",
    "any"
})
public class ErrorType {

    @XmlElement(name = "ShortMessage")
    protected String shortMessage;
    @XmlElement(name = "LongMessage")
    protected String longMessage;
    @XmlElement(name = "ErrorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String errorCode;
    @XmlElement(name = "UserDisplayHint")
    protected Boolean userDisplayHint;
    @XmlElement(name = "SeverityCode")
    protected SeverityCodeType severityCode;
    @XmlElement(name = "ErrorParameters")
    protected List<ErrorParameterType> errorParameters;
    @XmlElement(name = "ErrorClassification")
    protected ErrorClassificationCodeType errorClassification;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the shortMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortMessage() {
        return shortMessage;
    }

    /**
     * Sets the value of the shortMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortMessage(String value) {
        this.shortMessage = value;
    }

    /**
     * Gets the value of the longMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongMessage() {
        return longMessage;
    }

    /**
     * Sets the value of the longMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongMessage(String value) {
        this.longMessage = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the userDisplayHint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserDisplayHint() {
        return userDisplayHint;
    }

    /**
     * Sets the value of the userDisplayHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserDisplayHint(Boolean value) {
        this.userDisplayHint = value;
    }

    /**
     * Gets the value of the severityCode property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityCodeType }
     *     
     */
    public SeverityCodeType getSeverityCode() {
        return severityCode;
    }

    /**
     * Sets the value of the severityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityCodeType }
     *     
     */
    public void setSeverityCode(SeverityCodeType value) {
        this.severityCode = value;
    }

    /**
     * Gets the value of the errorParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorParameterType }
     * 
     * 
     */
    public List<ErrorParameterType> getErrorParameters() {
        if (errorParameters == null) {
            errorParameters = new ArrayList<ErrorParameterType>();
        }
        return this.errorParameters;
    }

    /**
     * Gets the value of the errorClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorClassificationCodeType }
     *     
     */
    public ErrorClassificationCodeType getErrorClassification() {
        return errorClassification;
    }

    /**
     * Sets the value of the errorClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorClassificationCodeType }
     *     
     */
    public void setErrorClassification(ErrorClassificationCodeType value) {
        this.errorClassification = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
