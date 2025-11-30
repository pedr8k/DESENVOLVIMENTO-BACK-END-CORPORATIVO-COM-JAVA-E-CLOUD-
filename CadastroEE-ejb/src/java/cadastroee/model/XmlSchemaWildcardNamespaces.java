/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "xml_schema_wildcard_namespaces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XmlSchemaWildcardNamespaces.findAll", query = "SELECT x FROM XmlSchemaWildcardNamespaces x"),
    @NamedQuery(name = "XmlSchemaWildcardNamespaces.findByXmlComponentId", query = "SELECT x FROM XmlSchemaWildcardNamespaces x WHERE x.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "XmlSchemaWildcardNamespaces.findByNamespace", query = "SELECT x FROM XmlSchemaWildcardNamespaces x WHERE x.namespace = :namespace")})
public class XmlSchemaWildcardNamespaces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_component_id")
    private int xmlComponentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "namespace")
    private String namespace;

    public XmlSchemaWildcardNamespaces() {
    }

    public int getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(int xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
}
