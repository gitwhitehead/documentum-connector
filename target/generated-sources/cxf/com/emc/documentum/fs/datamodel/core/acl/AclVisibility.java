
package com.emc.documentum.fs.datamodel.core.acl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AclVisibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AclVisibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIVATE"/>
 *     &lt;enumeration value="PUBLIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AclVisibility")
@XmlEnum
public enum AclVisibility {

    PRIVATE,
    PUBLIC;

    public String value() {
        return name();
    }

    public static AclVisibility fromValue(String v) {
        return valueOf(v);
    }

}