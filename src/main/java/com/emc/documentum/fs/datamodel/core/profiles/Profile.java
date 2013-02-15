/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.profiles;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile")
@XmlSeeAlso({
    ClusteringProfile.class,
    LifecycleExecutionProfile.class,
    SchemaProfile.class,
    SearchProfile.class,
    ContentTransferProfile.class,
    CheckoutProfile.class,
    PropertyProfile.class,
    VdmRetrieveProfile.class,
    CopyProfile.class,
    ContentProfile.class,
    PermissionProfile.class,
    RelationshipProfile.class,
    DeleteProfile.class,
    VdmUpdateProfile.class,
    CheckinProfile.class,
    MoveProfile.class,
    RichTextProfile.class
})
public abstract class Profile
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
