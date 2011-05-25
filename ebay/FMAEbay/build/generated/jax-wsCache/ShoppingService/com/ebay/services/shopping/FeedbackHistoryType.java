
package com.ebay.services.shopping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				Specifies all feedback summary information (except Score). Contains
 * 				objects that each convey feedback counts for
 * 				positive, negative, neutral, and total feedback counts - for various
 * 				time periods each. Also conveys counts of bid retractions for the
 * 				predefined time periods.
 * 			
 * 
 * <p>Java class for FeedbackHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidRetractionFeedbackPeriods" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NegativeFeedbackPeriods" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NeutralFeedbackPeriods" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PositiveFeedbackPeriods" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalFeedbackPeriods" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UniqueNegativeFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UniquePositiveFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AverageRatingDetails" type="{urn:ebay:apis:eBLBaseComponents}AverageRatingDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NeutralCommentCountFromSuspendedUsers" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UniqueNeutralFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "FeedbackHistoryType", propOrder = {
    "bidRetractionFeedbackPeriods",
    "negativeFeedbackPeriods",
    "neutralFeedbackPeriods",
    "positiveFeedbackPeriods",
    "totalFeedbackPeriods",
    "uniqueNegativeFeedbackCount",
    "uniquePositiveFeedbackCount",
    "averageRatingDetails",
    "neutralCommentCountFromSuspendedUsers",
    "uniqueNeutralFeedbackCount",
    "any"
})
public class FeedbackHistoryType {

    @XmlElement(name = "BidRetractionFeedbackPeriods")
    protected List<FeedbackPeriodType> bidRetractionFeedbackPeriods;
    @XmlElement(name = "NegativeFeedbackPeriods")
    protected List<FeedbackPeriodType> negativeFeedbackPeriods;
    @XmlElement(name = "NeutralFeedbackPeriods")
    protected List<FeedbackPeriodType> neutralFeedbackPeriods;
    @XmlElement(name = "PositiveFeedbackPeriods")
    protected List<FeedbackPeriodType> positiveFeedbackPeriods;
    @XmlElement(name = "TotalFeedbackPeriods")
    protected List<FeedbackPeriodType> totalFeedbackPeriods;
    @XmlElement(name = "UniqueNegativeFeedbackCount")
    protected Long uniqueNegativeFeedbackCount;
    @XmlElement(name = "UniquePositiveFeedbackCount")
    protected Long uniquePositiveFeedbackCount;
    @XmlElement(name = "AverageRatingDetails")
    protected List<AverageRatingDetailsType> averageRatingDetails;
    @XmlElement(name = "NeutralCommentCountFromSuspendedUsers")
    protected Long neutralCommentCountFromSuspendedUsers;
    @XmlElement(name = "UniqueNeutralFeedbackCount")
    protected Long uniqueNeutralFeedbackCount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the bidRetractionFeedbackPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidRetractionFeedbackPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidRetractionFeedbackPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedbackPeriodType }
     * 
     * 
     */
    public List<FeedbackPeriodType> getBidRetractionFeedbackPeriods() {
        if (bidRetractionFeedbackPeriods == null) {
            bidRetractionFeedbackPeriods = new ArrayList<FeedbackPeriodType>();
        }
        return this.bidRetractionFeedbackPeriods;
    }

    /**
     * Gets the value of the negativeFeedbackPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negativeFeedbackPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegativeFeedbackPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedbackPeriodType }
     * 
     * 
     */
    public List<FeedbackPeriodType> getNegativeFeedbackPeriods() {
        if (negativeFeedbackPeriods == null) {
            negativeFeedbackPeriods = new ArrayList<FeedbackPeriodType>();
        }
        return this.negativeFeedbackPeriods;
    }

    /**
     * Gets the value of the neutralFeedbackPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neutralFeedbackPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeutralFeedbackPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedbackPeriodType }
     * 
     * 
     */
    public List<FeedbackPeriodType> getNeutralFeedbackPeriods() {
        if (neutralFeedbackPeriods == null) {
            neutralFeedbackPeriods = new ArrayList<FeedbackPeriodType>();
        }
        return this.neutralFeedbackPeriods;
    }

    /**
     * Gets the value of the positiveFeedbackPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positiveFeedbackPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositiveFeedbackPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedbackPeriodType }
     * 
     * 
     */
    public List<FeedbackPeriodType> getPositiveFeedbackPeriods() {
        if (positiveFeedbackPeriods == null) {
            positiveFeedbackPeriods = new ArrayList<FeedbackPeriodType>();
        }
        return this.positiveFeedbackPeriods;
    }

    /**
     * Gets the value of the totalFeedbackPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalFeedbackPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalFeedbackPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedbackPeriodType }
     * 
     * 
     */
    public List<FeedbackPeriodType> getTotalFeedbackPeriods() {
        if (totalFeedbackPeriods == null) {
            totalFeedbackPeriods = new ArrayList<FeedbackPeriodType>();
        }
        return this.totalFeedbackPeriods;
    }

    /**
     * Gets the value of the uniqueNegativeFeedbackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqueNegativeFeedbackCount() {
        return uniqueNegativeFeedbackCount;
    }

    /**
     * Sets the value of the uniqueNegativeFeedbackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqueNegativeFeedbackCount(Long value) {
        this.uniqueNegativeFeedbackCount = value;
    }

    /**
     * Gets the value of the uniquePositiveFeedbackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniquePositiveFeedbackCount() {
        return uniquePositiveFeedbackCount;
    }

    /**
     * Sets the value of the uniquePositiveFeedbackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniquePositiveFeedbackCount(Long value) {
        this.uniquePositiveFeedbackCount = value;
    }

    /**
     * Gets the value of the averageRatingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the averageRatingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAverageRatingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AverageRatingDetailsType }
     * 
     * 
     */
    public List<AverageRatingDetailsType> getAverageRatingDetails() {
        if (averageRatingDetails == null) {
            averageRatingDetails = new ArrayList<AverageRatingDetailsType>();
        }
        return this.averageRatingDetails;
    }

    /**
     * Gets the value of the neutralCommentCountFromSuspendedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNeutralCommentCountFromSuspendedUsers() {
        return neutralCommentCountFromSuspendedUsers;
    }

    /**
     * Sets the value of the neutralCommentCountFromSuspendedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNeutralCommentCountFromSuspendedUsers(Long value) {
        this.neutralCommentCountFromSuspendedUsers = value;
    }

    /**
     * Gets the value of the uniqueNeutralFeedbackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqueNeutralFeedbackCount() {
        return uniqueNeutralFeedbackCount;
    }

    /**
     * Sets the value of the uniqueNeutralFeedbackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqueNeutralFeedbackCount(Long value) {
        this.uniqueNeutralFeedbackCount = value;
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
     * {@link Object }
     * {@link Element }
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
