/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package com.emc.documentum.fs.rt.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-02-25T12:24:31.410-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "ContextRegistryService", 
                  wsdlLocation = "classpath:wsdl/ContextRegistryService.wsdl",
                  targetNamespace = "http://services.rt.fs.documentum.emc.com/") 
public class ContextRegistryService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.rt.fs.documentum.emc.com/", "ContextRegistryService");
    public final static QName ContextRegistryServicePort = new QName("http://services.rt.fs.documentum.emc.com/", "ContextRegistryServicePort");
    static {
        URL url = ContextRegistryService.class.getClassLoader().getResource("wsdl/ContextRegistryService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ContextRegistryService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/ContextRegistryService.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public ContextRegistryService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ContextRegistryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ContextRegistryService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ContextRegistryServicePort
     */
    @WebEndpoint(name = "ContextRegistryServicePort")
    public ContextRegistryServicePort getContextRegistryServicePort() {
        return super.getPort(ContextRegistryServicePort, ContextRegistryServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContextRegistryServicePort
     */
    @WebEndpoint(name = "ContextRegistryServicePort")
    public ContextRegistryServicePort getContextRegistryServicePort(WebServiceFeature... features) {
        return super.getPort(ContextRegistryServicePort, ContextRegistryServicePort.class, features);
    }

}
