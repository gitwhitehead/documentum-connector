/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


package com.emc.documentum.fs.datamodel.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CacheStrategyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CacheStrategyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT_CACHE_STRATEGY"/>
 *     &lt;enumeration value="BASIC_FILE_CACHE_STRATEGY"/>
 *     &lt;enumeration value="BASIC_MEMORY_CACHE_STRATEGY"/>
 *     &lt;enumeration value="NO_CACHE_STRATEGY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CacheStrategyType")
@XmlEnum
public enum CacheStrategyType {

    DEFAULT_CACHE_STRATEGY,
    BASIC_FILE_CACHE_STRATEGY,
    BASIC_MEMORY_CACHE_STRATEGY,
    NO_CACHE_STRATEGY;

    public String value() {
        return name();
    }

    public static CacheStrategyType fromValue(String v) {
        return valueOf(v);
    }

}
