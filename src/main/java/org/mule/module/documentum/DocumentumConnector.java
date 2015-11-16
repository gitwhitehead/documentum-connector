/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */
/**
 * This file was automatically generated by the Mule Development Kit
 */

package org.mule.module.documentum;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.ReconnectOn;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;

import com.emc.documentum.fs.datamodel.core.CheckoutInfo;
import com.emc.documentum.fs.datamodel.core.ObjectIdentity;
import com.emc.documentum.fs.datamodel.core.VersionInfo;
import com.emc.documentum.fs.datamodel.core.VersionStrategy;
import com.emc.documentum.fs.datamodel.core.acl.Acl;
import com.emc.documentum.fs.datamodel.core.acl.AclEntry;
import com.emc.documentum.fs.datamodel.core.acl.AclIdentity;
import com.emc.documentum.fs.datamodel.core.acl.AclPackage;
import com.emc.documentum.fs.datamodel.core.acl.AclType;
import com.emc.documentum.fs.datamodel.core.acl.AclVisibility;
import com.emc.documentum.fs.datamodel.core.content.ContentTransferMode;
import com.emc.documentum.fs.datamodel.core.query.QueryResult;
import com.emc.documentum.fs.services.core.SerializableException;
import com.emc.documentum.fs.services.core.acl.CoreServiceException_Exception;
import com.emc.documentum.fs.services.core.acl.ServiceException;

/**
 * Documentum Cloud Connector. The Documentum Connector will allow to use the DFS SOAP API. Almost every operation that can be done via the API can be done thru this connector.
 * 
 * @author MuleSoft, Inc.
 */
@Connector(name = "documentum", schemaVersion = "1.0", friendlyName = "Documentum", minMuleVersion = "3.6")
@ReconnectOn(exceptions = DocumentumConnectorException.class)
public class DocumentumConnector {

    @org.mule.api.annotations.Config
    private Config config;

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    /**
     * Create Document
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:create-document}
     *
     * @param filePath
     *            path to an existing file in the local system.
     * @param folderPath
     *            path to an existing folder in the content server.
     * @param transferMode
     *            the transfer mode.
     * @return the ObjectIdentity.
     * @throws SerializableException .
     * @throws IOException .
     */
    @Processor
    public ObjectIdentity createDocument(String filePath, String folderPath, @Default("MTOM") ContentTransferMode transferMode) throws IOException, SerializableException {
        return getConfig().getObjectClient().createObject("dm_document", filePath, null, folderPath, transferMode);
    }

    /**
     * Create Folder
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:create-folder}
     *
     * @param folderName
     *            of the folder to create.
     * @param folderPath
     *            path to an existing folder in the content server.
     * @return the ObjectIdentity.
     * @throws SerializableException .
     * @throws IOException .
     */
    @Processor
    public ObjectIdentity createFolder(String folderName, String folderPath) throws IOException, SerializableException {
        return getConfig().getObjectClient().createObject("dm_folder", null, folderName, folderPath, null);
    }

    /**
     * Create Path
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:create-path}
     *
     * @param folderPath
     *            path to create in the content server.
     * @return the ObjectIdentity.
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity createPath(String folderPath) throws SerializableException {
        return getConfig().getObjectClient().createPath(folderPath);
    }

    /**
     * Get Object
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:create-document}
     *
     * @param objectIdentity
     *            the ObjectIdentity of the object to download.
     * @param outputPath
     *            download path plus the fileName.
     * @param transferMode
     *            the transfer mode.
     * @return the File.
     * @throws SerializableException .
     * @throws IOException .
     */
    @Processor
    public File getObject(@Default("#[payload]") ObjectIdentity objectIdentity, String outputPath, ContentTransferMode transferMode) throws SerializableException, IOException {
        return getConfig().getObjectClient().getObject(objectIdentity, outputPath, transferMode);
    }

    /**
     * Update Document
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:update-document}
     *
     * @param objectIdentity
     *            the ObjectIdentity of the object to update.
     * @param newContentFilePath
     *            the path to file with the new content.
     * @param transferMode
     *            the transfer mode.
     * @param newProperties
     *            a map with the new properties.
     * @param oldParentFolder
     *            the old parent folder ObjectIdentity.
     * @param newParentFolder
     *            the new parent folder ObjectIdentity.
     * @return the ObjectIdentity.
     * @throws IOException .
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity updateDocument(@Default("#[payload]") ObjectIdentity objectIdentity, @Optional String newContentFilePath,
            @Default("MTOM") ContentTransferMode transferMode, @Optional Map<String, String> newProperties, @Optional ObjectIdentity oldParentFolder,
            @Optional ObjectIdentity newParentFolder) throws SerializableException, IOException {
        return getConfig().getObjectClient().updateObject(objectIdentity, "dm_document", newContentFilePath, newProperties, oldParentFolder, newParentFolder, transferMode);
    }

    /**
     * Update Folder
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:update-folder}
     *
     * @param objectIdentity
     *            the ObjectIdentity of the object to update.
     * @param newProperties
     *            a map with the new properties.
     * @param oldParentFolder
     *            the old parent folder ObjectIdentity.
     * @param newParentFolder
     *            the new parent folder ObjectIdentity.
     * @return the ObjectIdentity.
     * @throws IOException .
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity updateFolder(@Default("#[payload]") ObjectIdentity objectIdentity, @Optional Map<String, String> newProperties, @Optional ObjectIdentity oldParentFolder,
            @Optional ObjectIdentity newParentFolder) throws SerializableException, IOException {
        return getConfig().getObjectClient().updateObject(objectIdentity, "dm_folder", null, newProperties, oldParentFolder, newParentFolder, null);
    }

    /**
     * Delete Object
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:delete-object}
     *
     * @param objectIdentity
     *            the ObjectIdentity of the object to delete.
     * @return ObjectIdentity if the deletion was successful.
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity deleteObject(@Default("#[payload]") ObjectIdentity objectIdentity) throws SerializableException {
        return getConfig().getObjectClient().deleteObject(objectIdentity);
    }

    /**
     * Copy Object
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:copy-object}
     *
     * @param objectIdentity
     *            identify the object to copy.
     * @param folderIdentity
     *            identify the folder to copy to.
     * @return the ObjectIdentity.
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity copyObject(@Default("#[payload]") ObjectIdentity objectIdentity, ObjectIdentity folderIdentity) throws SerializableException {
        return getConfig().getObjectClient().copyObject(objectIdentity, folderIdentity);
    }

    /**
     * Move Object
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:move-object}
     *
     * @param objectIdentity
     *            identify the object to move.
     * @param toFolderIdentity
     *            identify the folder to move from.
     * @param fromFolderIdentity
     *            identify the folder to move to.
     * @return the ObjectIdentity.
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity moveObject(@Default("#[payload]") ObjectIdentity objectIdentity, ObjectIdentity toFolderIdentity, ObjectIdentity fromFolderIdentity)
            throws SerializableException {
        return getConfig().getObjectClient().moveObject(objectIdentity, toFolderIdentity, fromFolderIdentity);
    }

    /**
     * Get checkout info
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:get-checkout-info}
     *
     * @param objIdentity
     *            identify the object to get the checkout info.
     * @return the CheckoutInfo.
     * @throws SerializableException .
     */
    @Processor
    public CheckoutInfo getCheckoutInfo(@Default("#[payload]") ObjectIdentity objIdentity) throws SerializableException {
        return getConfig().getVersionControlClient().getCheckoutInfo(objIdentity);
    }

    /**
     * Checkout
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:checkout}
     *
     * @param objIdentity
     *            identify the object to checkout.
     * @return the ObjectIdentity.
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity checkout(@Default("#[payload]") ObjectIdentity objIdentity) throws SerializableException {
        return getConfig().getVersionControlClient().checkout(objIdentity);
    }

    /**
     * Checkin
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:checkin}
     *
     * @param objIdentity
     *            identify the object to checkin.
     * @param newContentPath
     *            the path to the file with the new content.
     * @param versionStrategy
     *            the strategy to do the checkin.
     * @param labels
     *            the labels of this checkin.
     * @param isRetainLock
     *            specifies whether the object is to remain checked out and locked by the user after the new version is saved.
     * @param transferMode
     *            the transfer mode.
     * @return the ObjectIdentity.
     * @throws IOException .
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity checkin(@Default("#[payload]") ObjectIdentity objIdentity, String newContentPath, @Default("NEXT_MINOR") VersionStrategy versionStrategy,
            List<String> labels, @Default("false") boolean isRetainLock, @Default("MTOM") ContentTransferMode transferMode) throws SerializableException, IOException {
        return getConfig().getVersionControlClient().checkin(objIdentity, newContentPath, versionStrategy, labels, isRetainLock, transferMode);
    }

    /**
     * Cancel Checkout
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:cancel-checkout}
     *
     * @param objIdentity
     *            identify the object to cancel the checkout.
     * @return ObjectIdentity if the cancellation was successful.
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity cancelCheckout(@Default("#[payload]") ObjectIdentity objIdentity) throws SerializableException {
        return getConfig().getVersionControlClient().cancelCheckout(objIdentity);
    }

    /**
     * Delete Version
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:delete-version}
     *
     * @param objIdentity
     *            identify the object to delete.
     * @return ObjectIdentity if the deletion was successful.
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity deleteVersion(@Default("#[payload]") ObjectIdentity objIdentity) throws SerializableException {
        return getConfig().getVersionControlClient().deleteVersion(objIdentity);
    }

    /**
     * Delete All Versions
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:create-document}
     *
     * @param objIdentity
     *            identify the object to delete.
     * @return ObjectIdentity if the deletion was successful.
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity deleteAllVersions(@Default("#[payload]") ObjectIdentity objIdentity) throws SerializableException {
        return getConfig().getVersionControlClient().deleteAllVersions(objIdentity);
    }

    /**
     * Get Current
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:get-current}
     *
     * @param objIdentity
     *            identify the object to get the current version.
     * @return the ObjectIdentity.
     * @throws SerializableException .
     */
    @Processor
    public ObjectIdentity getCurrent(@Default("#[payload]") ObjectIdentity objIdentity) throws SerializableException {
        return getConfig().getVersionControlClient().getCurrent(objIdentity);
    }

    /**
     * Get Version Info
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:get-version-info}
     *
     * @param objIdentity
     *            identify the object to get the version info.
     * @return the VersionInfo.
     * @throws SerializableException .
     */
    @Processor
    public VersionInfo getVersionInfo(@Default("#[payload]") ObjectIdentity objIdentity) throws SerializableException {
        return getConfig().getVersionControlClient().getVersionInfo(objIdentity);
    }

    /**
     * Query
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:query}
     *
     * @param dqlStatement
     *            a DQL query.
     * @return the QueryResult.
     * @throws SerializableException .
     */
    @Processor
    public QueryResult query(String dqlStatement) throws SerializableException {
        return getConfig().getQueryClient().query(dqlStatement);
    }

    /**
     * Create Acl
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:create-acl}
     *
     * @param aclName
     *            the name of the acl.
     * @param aclDescription
     *            the description of the acl.
     * @param aclEntries
     *            the entries of the acl.
     * @param aclVisibility
     *            the visibility of the acl.
     * @param aclType
     *            the type of the acl.
     * @return the Acl.
     * @throws CoreServiceException_Exception .
     * @throws ServiceException .
     */
    @Processor
    public Acl createAcl(String aclName, String aclDescription, List<AclEntry> aclEntries, AclVisibility aclVisibility, AclType aclType) throws ServiceException,
            CoreServiceException_Exception {
        return getConfig().getAccessControlClient().createAcl(aclName, aclDescription, aclEntries, aclVisibility, aclType);
    }

    /**
     * Get Acl
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:get-acl}
     *
     * @param aclNames
     *            the names of the acls.
     * @return the AclPackage.
     * @throws CoreServiceException_Exception .
     * @throws ServiceException .
     */
    @Processor
    public AclPackage getAcl(List<String> aclNames) throws ServiceException, CoreServiceException_Exception {
        return getConfig().getAccessControlClient().getAcl(aclNames);
    }

    /**
     * Update Acl
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:update-acl}
     *
     * @param aclName
     *            the name of the acl.
     * @param aclDescription
     *            the description of the acl.
     * @param aclEntries
     *            the entries of the acl.
     * @param aclVisibility
     *            the visibility of the acl.
     * @param aclType
     *            the type of the acl.
     * @return the Acl.
     * @throws CoreServiceException_Exception .
     * @throws ServiceException .
     */
    @Processor
    public Acl updateAcl(String aclName, String aclDescription, List<AclEntry> aclEntries, AclVisibility aclVisibility, AclType aclType) throws ServiceException,
            CoreServiceException_Exception {
        return getConfig().getAccessControlClient().updateAcl(aclName, aclDescription, aclEntries, aclVisibility, aclType);
    }

    /**
     * Delete Acl
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:delete-acl}
     *
     * @param aclNames
     *            the names of the acls.
     * @return a list with names of the deleted acls.
     * @throws CoreServiceException_Exception .
     * @throws ServiceException .
     */
    @Processor
    public List<String> deleteAcl(List<String> aclNames) throws ServiceException, CoreServiceException_Exception {
        return getConfig().getAccessControlClient().deleteAcl(aclNames);
    }

    /**
     * Apply Acl
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:apply-acl}
     *
     * @param objectIdentity
     *            the object identity to receive the Acl.
     * @param aclIdentity
     *            the acl identity to apply to the object identity.
     * @return the ObjectIdentity.
     * @throws SerializableException .
     * @throws ServiceException .
     */
    @Processor
    public ObjectIdentity applyAcl(ObjectIdentity objectIdentity, AclIdentity aclIdentity) throws ServiceException, SerializableException {
        return getConfig().getObjectClient().applyAcl(objectIdentity, aclIdentity);
    }

    /**
     * Get Acls
     *
     * {@sample.xml ../../../doc/documentum.xml.sample documentum:get-acls}
     *
     * @return the AclPackage.
     * @throws CoreServiceException_Exception .
     * @throws SerializableException .
     * @throws ServiceException .
     */
    @Processor
    public AclPackage getAcls() throws ServiceException, SerializableException, CoreServiceException_Exception {
        return getConfig().getAccessControlClient().getAcls(getConfig().getQueryClient());
    }

}