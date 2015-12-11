
package com.emc.documentum.fs.datamodel.core.acl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emc.documentum.fs.datamodel.core.acl package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emc.documentum.fs.datamodel.core.acl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AclEntry }
     * 
     */
    public AclEntry createAclEntry() {
        return new AclEntry();
    }

    /**
     * Create an instance of {@link AclIdentity }
     * 
     */
    public AclIdentity createAclIdentity() {
        return new AclIdentity();
    }

    /**
     * Create an instance of {@link Acl }
     * 
     */
    public Acl createAcl() {
        return new Acl();
    }

    /**
     * Create an instance of {@link AclPackage }
     * 
     */
    public AclPackage createAclPackage() {
        return new AclPackage();
    }

}