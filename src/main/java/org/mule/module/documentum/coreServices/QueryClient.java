/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */

package org.mule.module.documentum.coreServices;

import com.emc.documentum.fs.datamodel.core.query.QueryExecution;
import com.emc.documentum.fs.datamodel.core.query.QueryResult;
import com.emc.documentum.fs.services.core.SerializableException;

public interface QueryClient {

    public QueryResult query(String dqlStatement, QueryExecution queryExecution) throws SerializableException;
    
}