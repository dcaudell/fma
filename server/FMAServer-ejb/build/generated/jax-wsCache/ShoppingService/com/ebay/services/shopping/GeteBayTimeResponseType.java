
package com.ebay.services.shopping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The Timestamp field indicates the official eBay system time in GMT.
 * 				The value returned represents the date and time when eBay processed the request.
 * 				The value is in the ISO 8601 date-time format (YYYY-MM-DDTHH:MM:SS.SSSZ). 
 * 			
 * 
 * <p>Java class for GeteBayTimeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeteBayTimeResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeteBayTimeResponseType")
public class GeteBayTimeResponseType
    extends AbstractResponseType
{


}
