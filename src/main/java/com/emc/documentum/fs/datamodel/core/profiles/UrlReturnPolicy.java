/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core.profiles;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrlReturnPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UrlReturnPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALWAYS"/>
 *     &lt;enumeration value="ONLY"/>
 *     &lt;enumeration value="PREFER"/>
 *     &lt;enumeration value="NEVER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UrlReturnPolicy")
@XmlEnum
public enum UrlReturnPolicy {

    ALWAYS,
    ONLY,
    PREFER,
    NEVER;

    public String value() {
        return name();
    }

    public static UrlReturnPolicy fromValue(String v) {
        return valueOf(v);
    }

}
