/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package com.emc.documentum.fs.rt.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-02-25T12:24:31.403-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://services.rt.fs.documentum.emc.com/", name = "ContextRegistryServicePort")
@XmlSeeAlso({com.emc.documentum.fs.datamodel.core.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.profiles.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.content.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.properties.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.query.ObjectFactory.class, ObjectFactory.class, com.emc.documentum.fs.datamodel.core.context.ObjectFactory.class, org.w3._2001.xmlschema.ObjectFactory.class})
public interface ContextRegistryServicePort {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "lookup", targetNamespace = "http://services.rt.fs.documentum.emc.com/", className = "com.emc.documentum.fs.rt.services.Lookup")
    @WebMethod
    @ResponseWrapper(localName = "lookupResponse", targetNamespace = "http://services.rt.fs.documentum.emc.com/", className = "com.emc.documentum.fs.rt.services.LookupResponse")
    public com.emc.documentum.fs.datamodel.core.context.ServiceContext lookup(
        @WebParam(name = "token", targetNamespace = "")
        java.lang.String token
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://services.rt.fs.documentum.emc.com/", className = "com.emc.documentum.fs.rt.services.Register")
    @WebMethod
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://services.rt.fs.documentum.emc.com/", className = "com.emc.documentum.fs.rt.services.RegisterResponse")
    public java.lang.String register(
        @WebParam(name = "context", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.context.ServiceContext context,
        @WebParam(name = "host", targetNamespace = "")
        java.lang.String host
    );

    @RequestWrapper(localName = "unregister", targetNamespace = "http://services.rt.fs.documentum.emc.com/", className = "com.emc.documentum.fs.rt.services.Unregister")
    @WebMethod
    @ResponseWrapper(localName = "unregisterResponse", targetNamespace = "http://services.rt.fs.documentum.emc.com/", className = "com.emc.documentum.fs.rt.services.UnregisterResponse")
    public void unregister(
        @WebParam(name = "token", targetNamespace = "")
        java.lang.String token
    );
}
