
package com.ebay.services.shopping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Response to GetUserProfile request.
 * 			
 * 
 * <p>Java class for GetUserProfileResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserProfileResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="User" type="{urn:ebay:apis:eBLBaseComponents}SimpleUserType" minOccurs="0"/>
 *         &lt;element name="FeedbackHistory" type="{urn:ebay:apis:eBLBaseComponents}FeedbackHistoryType" minOccurs="0"/>
 *         &lt;element name="FeedbackDetails" type="{urn:ebay:apis:eBLBaseComponents}FeedbackDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserProfileResponseType", propOrder = {
    "user",
    "feedbackHistory",
    "feedbackDetails"
})
public class GetUserProfileResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "User")
    protected SimpleUserType user;
    @XmlElement(name = "FeedbackHistory")
    protected FeedbackHistoryType feedbackHistory;
    @XmlElement(name = "FeedbackDetails")
    protected List<FeedbackDetailType> feedbackDetails;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleUserType }
     *     
     */
    public SimpleUserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleUserType }
     *     
     */
    public void setUser(SimpleUserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the feedbackHistory property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackHistoryType }
     *     
     */
    public FeedbackHistoryType getFeedbackHistory() {
        return feedbackHistory;
    }

    /**
     * Sets the value of the feedbackHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackHistoryType }
     *     
     */
    public void setFeedbackHistory(FeedbackHistoryType value) {
        this.feedbackHistory = value;
    }

    /**
     * Gets the value of the feedbackDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedbackDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedbackDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedbackDetailType }
     * 
     * 
     */
    public List<FeedbackDetailType> getFeedbackDetails() {
        if (feedbackDetails == null) {
            feedbackDetails = new ArrayList<FeedbackDetailType>();
        }
        return this.feedbackDetails;
    }

}
