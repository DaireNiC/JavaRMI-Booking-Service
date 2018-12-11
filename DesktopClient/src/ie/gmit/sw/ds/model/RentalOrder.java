//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.07 at 08:43:43 PM GMT 
//


package ie.gmit.sw.ds.model;

import java.io.Serializable;
import java.sql.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for RentalOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RentalOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pickUpDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dropOffDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="vehicle" type="{http://sw.gmit.ie/ds/}Vehicle"/>
 *         &lt;element name="customer" type="{http://sw.gmit.ie/ds/}Customer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="rental_SID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orderDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentalOrder", namespace = "http://sw.gmit.ie/ds/model", propOrder = {
    "pickUpDate",
    "dropOffDate",
    "vehicle",
    "customer"
})
public class RentalOrder implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9205739367972244715L;
	@XmlElement(namespace = "http://sw.gmit.ie/ds/model", required = true)
    @XmlSchemaType(name = "date")
    protected Date pickUpDate;
    @XmlElement(namespace = "http://sw.gmit.ie/ds/model", required = true)
    @XmlSchemaType(name = "date")
    protected Date dropOffDate;
    @XmlElement(namespace = "http://sw.gmit.ie/ds/model", required = true)
    protected Vehicle vehicle;
    @XmlElement(namespace = "http://sw.gmit.ie/ds/model", required = true)
    protected Customer customer;
    @XmlAttribute(name = "rental_SID", required = true)
    protected String rentalSID;
    @XmlAttribute(name = "orderDate", required = true)
    @XmlSchemaType(name = "date")
    protected Date orderDate;

    /**
     * Gets the value of the pickUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    
 
    public Date getPickUpDate() {
        return pickUpDate;
    }
    public RentalOrder() {}

    public RentalOrder(Date pickUpDate, Date dropOffDate, Vehicle vehicle,
			Customer customer, String rentalSID, Date orderDate) {
		super();
		this.pickUpDate = pickUpDate;
		this.dropOffDate = dropOffDate;
		this.vehicle = vehicle;
		this.customer = customer;
		this.rentalSID = rentalSID;
		this.orderDate = orderDate;
	}

	/**
     * Sets the value of the pickUpDate property.
     * 
     * @param date
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDate(Date date) {
        this.pickUpDate = date;
    }

    /**
     * Gets the value of the dropOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDropOffDate() {
        return dropOffDate;
    }

    /**
     * Sets the value of the dropOffDate property.
     * 
     * @param date
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDropOffDate(Date date) {
        this.dropOffDate = date;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the rentalSID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalSID() {
        return rentalSID;
    }

    /**
     * Sets the value of the rentalSID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalSID(String value) {
        this.rentalSID = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param date
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(Date date) {
        this.orderDate = date;
    }

}
