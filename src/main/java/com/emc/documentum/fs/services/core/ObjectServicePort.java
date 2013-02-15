/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package com.emc.documentum.fs.services.core;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-02-15T15:30:32.789-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://core.services.fs.documentum.emc.com/", name = "ObjectServicePort")
@XmlSeeAlso({com.emc.documentum.fs.datamodel.core.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.profiles.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.content.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.properties.ObjectFactory.class, com.emc.documentum.fs.rt.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.query.ObjectFactory.class, ObjectFactory.class, org.w3._2001.xmlschema.ObjectFactory.class})
public interface ObjectServicePort {

    @RequestWrapper(localName = "delete", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.Delete")
    @WebMethod
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.DeleteResponse")
    public void delete(
        @WebParam(name = "objectsToDelete", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet objectsToDelete,
        @WebParam(name = "options", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.OperationOptions options
    ) throws SerializableException;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "get", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.Get")
    @WebMethod
    @ResponseWrapper(localName = "getResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.GetResponse")
    public com.emc.documentum.fs.datamodel.core.DataPackage get(
        @WebParam(name = "forObjects", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet forObjects,
        @WebParam(name = "options", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.OperationOptions options
    ) throws SerializableException;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "validate", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.Validate")
    @WebMethod
    @ResponseWrapper(localName = "validateResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.ValidateResponse")
    public com.emc.documentum.fs.datamodel.core.ValidationInfoSet validate(
        @WebParam(name = "dataPackage", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.DataPackage dataPackage
    ) throws SerializableException;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "move", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.Move")
    @WebMethod
    @ResponseWrapper(localName = "moveResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.MoveResponse")
    public com.emc.documentum.fs.datamodel.core.DataPackage move(
        @WebParam(name = "fromObjects", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet fromObjects,
        @WebParam(name = "sourceLocation", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectLocation sourceLocation,
        @WebParam(name = "targetLocation", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectLocation targetLocation,
        @WebParam(name = "modifyObjects", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.DataPackage modifyObjects,
        @WebParam(name = "options", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.OperationOptions options
    ) throws SerializableException;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "createPath", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.CreatePath")
    @WebMethod
    @ResponseWrapper(localName = "createPathResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.CreatePathResponse")
    public com.emc.documentum.fs.datamodel.core.ObjectIdentity createPath(
        @WebParam(name = "objectPath", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectPath objectPath,
        @WebParam(name = "repositoryName", targetNamespace = "")
        java.lang.String repositoryName
    ) throws SerializableException;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "create", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.Create")
    @WebMethod
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.CreateResponse")
    public com.emc.documentum.fs.datamodel.core.DataPackage create(
        @WebParam(name = "dataPackage", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.DataPackage dataPackage,
        @WebParam(name = "options", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.OperationOptions options
    ) throws SerializableException;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getObjectContentUrls", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.GetObjectContentUrls")
    @WebMethod
    @ResponseWrapper(localName = "getObjectContentUrlsResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.GetObjectContentUrlsResponse")
    public java.util.List<com.emc.documentum.fs.datamodel.core.ObjectContentSet> getObjectContentUrls(
        @WebParam(name = "forObjects", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet forObjects
    ) throws SerializableException;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.Update")
    @WebMethod
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.UpdateResponse")
    public com.emc.documentum.fs.datamodel.core.DataPackage update(
        @WebParam(name = "dataPackage", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.DataPackage dataPackage,
        @WebParam(name = "options", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.OperationOptions options
    ) throws SerializableException;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "copy", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.Copy")
    @WebMethod
    @ResponseWrapper(localName = "copyResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.CopyResponse")
    public com.emc.documentum.fs.datamodel.core.DataPackage copy(
        @WebParam(name = "fromObjects", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet fromObjects,
        @WebParam(name = "targetLocation", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectLocation targetLocation,
        @WebParam(name = "modifyObjects", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.DataPackage modifyObjects,
        @WebParam(name = "options", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.OperationOptions options
    ) throws SerializableException;
}
