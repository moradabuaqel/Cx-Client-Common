
package com.checkmarx.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Schedule" type="{http://Checkmarx.com/v7}ScheduleType"/&gt;
 *         &lt;element name="ScheduledDays" type="{http://Checkmarx.com/v7}ArrayOfDayOfWeek" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://Checkmarx.com/v7}CxDateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartSchedulingPeriod" type="{http://Checkmarx.com/v7}CxDateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndSchedulingPeriod" type="{http://Checkmarx.com/v7}CxDateTime" minOccurs="0"/&gt;
 *         &lt;element name="SchedulingFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleSettings", propOrder = {
    "schedule",
    "scheduledDays",
    "time",
    "startSchedulingPeriod",
    "endSchedulingPeriod",
    "schedulingFrequency"
})
public class ScheduleSettings {

    @XmlElement(name = "Schedule", required = true)
    @XmlSchemaType(name = "string")
    protected ScheduleType schedule;
    @XmlElement(name = "ScheduledDays")
    protected ArrayOfDayOfWeek scheduledDays;
    @XmlElement(name = "Time")
    protected CxDateTime time;
    @XmlElement(name = "StartSchedulingPeriod")
    protected CxDateTime startSchedulingPeriod;
    @XmlElement(name = "EndSchedulingPeriod")
    protected CxDateTime endSchedulingPeriod;
    @XmlElement(name = "SchedulingFrequency")
    protected int schedulingFrequency;

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setSchedule(ScheduleType value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the scheduledDays property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDayOfWeek }
     *     
     */
    public ArrayOfDayOfWeek getScheduledDays() {
        return scheduledDays;
    }

    /**
     * Sets the value of the scheduledDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDayOfWeek }
     *     
     */
    public void setScheduledDays(ArrayOfDayOfWeek value) {
        this.scheduledDays = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link CxDateTime }
     *     
     */
    public CxDateTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDateTime }
     *     
     */
    public void setTime(CxDateTime value) {
        this.time = value;
    }

    /**
     * Gets the value of the startSchedulingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CxDateTime }
     *     
     */
    public CxDateTime getStartSchedulingPeriod() {
        return startSchedulingPeriod;
    }

    /**
     * Sets the value of the startSchedulingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDateTime }
     *     
     */
    public void setStartSchedulingPeriod(CxDateTime value) {
        this.startSchedulingPeriod = value;
    }

    /**
     * Gets the value of the endSchedulingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CxDateTime }
     *     
     */
    public CxDateTime getEndSchedulingPeriod() {
        return endSchedulingPeriod;
    }

    /**
     * Sets the value of the endSchedulingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDateTime }
     *     
     */
    public void setEndSchedulingPeriod(CxDateTime value) {
        this.endSchedulingPeriod = value;
    }

    /**
     * Gets the value of the schedulingFrequency property.
     * 
     */
    public int getSchedulingFrequency() {
        return schedulingFrequency;
    }

    /**
     * Sets the value of the schedulingFrequency property.
     * 
     */
    public void setSchedulingFrequency(int value) {
        this.schedulingFrequency = value;
    }

}
