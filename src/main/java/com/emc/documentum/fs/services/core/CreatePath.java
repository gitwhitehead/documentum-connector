/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.services.core;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.emc.documentum.fs.datamodel.core.ObjectPath;


/**
 * <p>Java class for createPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectPath" type="{http://core.datamodel.fs.documentum.emc.com/}ObjectPath" minOccurs="0"/>
 *         &lt;element name="repositoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPath", propOrder = {
    "objectPath",
    "repositoryName"
})
@XmlRootElement(name = "createPath")
public class CreatePath
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ObjectPath objectPath;
    protected String repositoryName;

    /**
     * Gets the value of the objectPath property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectPath }
     *     
     */
    public ObjectPath getObjectPath() {
        return objectPath;
    }

    /**
     * Sets the value of the objectPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectPath }
     *     
     */
    public void setObjectPath(ObjectPath value) {
        this.objectPath = value;
    }

    /**
     * Gets the value of the repositoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * Sets the value of the repositoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryName(String value) {
        this.repositoryName = value;
    }

}
