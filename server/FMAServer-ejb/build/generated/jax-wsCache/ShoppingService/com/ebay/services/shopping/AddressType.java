
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
 * 			Contains the data for one user address. This is the base type for a
 * 			number of user addresses, including seller payment address, buyer
 * 			shipping address and buyer and seller registration address.
 * 		
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneCountryPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneAreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneLocalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2CountryPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2LocalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalAddressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalStateAndCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AddressType", propOrder = {
    "name",
    "street",
    "street1",
    "street2",
    "cityName",
    "county",
    "stateOrProvince",
    "countryName",
    "phone",
    "phoneCountryPrefix",
    "phoneAreaOrCityCode",
    "phoneLocalNumber",
    "phone2CountryPrefix",
    "phone2AreaOrCityCode",
    "phone2LocalNumber",
    "postalCode",
    "addressID",
    "externalAddressID",
    "internationalName",
    "internationalStateAndCity",
    "internationalStreet",
    "companyName",
    "firstName",
    "lastName",
    "any"
})
public class AddressType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "Street1")
    protected String street1;
    @XmlElement(name = "Street2")
    protected String street2;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "StateOrProvince")
    protected String stateOrProvince;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "PhoneCountryPrefix")
    protected String phoneCountryPrefix;
    @XmlElement(name = "PhoneAreaOrCityCode")
    protected String phoneAreaOrCityCode;
    @XmlElement(name = "PhoneLocalNumber")
    protected String phoneLocalNumber;
    @XmlElement(name = "Phone2CountryPrefix")
    protected String phone2CountryPrefix;
    @XmlElement(name = "Phone2AreaOrCityCode")
    protected String phone2AreaOrCityCode;
    @XmlElement(name = "Phone2LocalNumber")
    protected String phone2LocalNumber;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "AddressID")
    protected String addressID;
    @XmlElement(name = "ExternalAddressID")
    protected String externalAddressID;
    @XmlElement(name = "InternationalName")
    protected String internationalName;
    @XmlElement(name = "InternationalStateAndCity")
    protected String internationalStateAndCity;
    @XmlElement(name = "InternationalStreet")
    protected String internationalStreet;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the street1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Sets the value of the street1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Gets the value of the street2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Sets the value of the street2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneCountryPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCountryPrefix() {
        return phoneCountryPrefix;
    }

    /**
     * Sets the value of the phoneCountryPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCountryPrefix(String value) {
        this.phoneCountryPrefix = value;
    }

    /**
     * Gets the value of the phoneAreaOrCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneAreaOrCityCode() {
        return phoneAreaOrCityCode;
    }

    /**
     * Sets the value of the phoneAreaOrCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneAreaOrCityCode(String value) {
        this.phoneAreaOrCityCode = value;
    }

    /**
     * Gets the value of the phoneLocalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneLocalNumber() {
        return phoneLocalNumber;
    }

    /**
     * Sets the value of the phoneLocalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneLocalNumber(String value) {
        this.phoneLocalNumber = value;
    }

    /**
     * Gets the value of the phone2CountryPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2CountryPrefix() {
        return phone2CountryPrefix;
    }

    /**
     * Sets the value of the phone2CountryPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2CountryPrefix(String value) {
        this.phone2CountryPrefix = value;
    }

    /**
     * Gets the value of the phone2AreaOrCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2AreaOrCityCode() {
        return phone2AreaOrCityCode;
    }

    /**
     * Sets the value of the phone2AreaOrCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2AreaOrCityCode(String value) {
        this.phone2AreaOrCityCode = value;
    }

    /**
     * Gets the value of the phone2LocalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2LocalNumber() {
        return phone2LocalNumber;
    }

    /**
     * Sets the value of the phone2LocalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2LocalNumber(String value) {
        this.phone2LocalNumber = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the addressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * Sets the value of the addressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressID(String value) {
        this.addressID = value;
    }

    /**
     * Gets the value of the externalAddressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAddressID() {
        return externalAddressID;
    }

    /**
     * Sets the value of the externalAddressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAddressID(String value) {
        this.externalAddressID = value;
    }

    /**
     * Gets the value of the internationalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalName() {
        return internationalName;
    }

    /**
     * Sets the value of the internationalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalName(String value) {
        this.internationalName = value;
    }

    /**
     * Gets the value of the internationalStateAndCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalStateAndCity() {
        return internationalStateAndCity;
    }

    /**
     * Sets the value of the internationalStateAndCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalStateAndCity(String value) {
        this.internationalStateAndCity = value;
    }

    /**
     * Gets the value of the internationalStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalStreet() {
        return internationalStreet;
    }

    /**
     * Sets the value of the internationalStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalStreet(String value) {
        this.internationalStreet = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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
