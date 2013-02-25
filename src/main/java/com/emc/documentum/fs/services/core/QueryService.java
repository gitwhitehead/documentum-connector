/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package com.emc.documentum.fs.services.core;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-02-25T12:24:29.815-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "QueryService", 
                  wsdlLocation = "classpath:wsdl/QueryService.wsdl",
                  targetNamespace = "http://core.services.fs.documentum.emc.com/") 
public class QueryService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://core.services.fs.documentum.emc.com/", "QueryService");
    public final static QName QueryServicePort = new QName("http://core.services.fs.documentum.emc.com/", "QueryServicePort");
    static {
        URL url = QueryService.class.getClassLoader().getResource("wsdl/QueryService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(QueryService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/QueryService.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public QueryService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QueryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QueryService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns QueryServicePort
     */
    @WebEndpoint(name = "QueryServicePort")
    public QueryServicePort getQueryServicePort() {
        return super.getPort(QueryServicePort, QueryServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QueryServicePort
     */
    @WebEndpoint(name = "QueryServicePort")
    public QueryServicePort getQueryServicePort(WebServiceFeature... features) {
        return super.getPort(QueryServicePort, QueryServicePort.class, features);
    }

}
