/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emc.documentum.fs.datamodel.core package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emc.documentum.fs.datamodel.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VersionInfo }
     * 
     */
    public VersionInfo createVersionInfo() {
        return new VersionInfo();
    }

    /**
     * Create an instance of {@link ObjectKey }
     * 
     */
    public ObjectKey createObjectKey() {
        return new ObjectKey();
    }

    /**
     * Create an instance of {@link RichText }
     * 
     */
    public RichText createRichText() {
        return new RichText();
    }

    /**
     * Create an instance of {@link CheckoutInfo }
     * 
     */
    public CheckoutInfo createCheckoutInfo() {
        return new CheckoutInfo();
    }

    /**
     * Create an instance of {@link ObjectId }
     * 
     */
    public ObjectId createObjectId() {
        return new ObjectId();
    }

    /**
     * Create an instance of {@link Permission }
     * 
     */
    public Permission createPermission() {
        return new Permission();
    }

    /**
     * Create an instance of {@link ObjectPath }
     * 
     */
    public ObjectPath createObjectPath() {
        return new ObjectPath();
    }

    /**
     * Create an instance of {@link Aspect }
     * 
     */
    public Aspect createAspect() {
        return new Aspect();
    }

    /**
     * Create an instance of {@link DataObject }
     * 
     */
    public DataObject createDataObject() {
        return new DataObject();
    }

    /**
     * Create an instance of {@link Qualification }
     * 
     */
    public Qualification createQualification() {
        return new Qualification();
    }

    /**
     * Create an instance of {@link ObjectRelationship }
     * 
     */
    public ObjectRelationship createObjectRelationship() {
        return new ObjectRelationship();
    }

    /**
     * Create an instance of {@link DataPackage }
     * 
     */
    public DataPackage createDataPackage() {
        return new DataPackage();
    }

    /**
     * Create an instance of {@link ReferenceRelationship }
     * 
     */
    public ReferenceRelationship createReferenceRelationship() {
        return new ReferenceRelationship();
    }

    /**
     * Create an instance of {@link OperationOptions }
     * 
     */
    public OperationOptions createOperationOptions() {
        return new OperationOptions();
    }

    /**
     * Create an instance of {@link CompositeObjectId }
     * 
     */
    public CompositeObjectId createCompositeObjectId() {
        return new CompositeObjectId();
    }

    /**
     * Create an instance of {@link ObjectIdentitySet }
     * 
     */
    public ObjectIdentitySet createObjectIdentitySet() {
        return new ObjectIdentitySet();
    }

    /**
     * Create an instance of {@link ObjectIdentity }
     * 
     */
    public ObjectIdentity createObjectIdentity() {
        return new ObjectIdentity();
    }

}
