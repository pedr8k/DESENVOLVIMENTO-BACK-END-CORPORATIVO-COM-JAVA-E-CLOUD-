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
@Table(name = "xml_schema_facets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "XmlSchemaFacets.findAll", query = "SELECT x FROM XmlSchemaFacets x"),
    @NamedQuery(name = "XmlSchemaFacets.findByXmlComponentId", query = "SELECT x FROM XmlSchemaFacets x WHERE x.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "XmlSchemaFacets.findByFacetId", query = "SELECT x FROM XmlSchemaFacets x WHERE x.facetId = :facetId"),
    @NamedQuery(name = "XmlSchemaFacets.findByKind", query = "SELECT x FROM XmlSchemaFacets x WHERE x.kind = :kind"),
    @NamedQuery(name = "XmlSchemaFacets.findByKindDesc", query = "SELECT x FROM XmlSchemaFacets x WHERE x.kindDesc = :kindDesc"),
    @NamedQuery(name = "XmlSchemaFacets.findByIsFixed", query = "SELECT x FROM XmlSchemaFacets x WHERE x.isFixed = :isFixed"),
    @NamedQuery(name = "XmlSchemaFacets.findByValue", query = "SELECT x FROM XmlSchemaFacets x WHERE x.value = :value")})
public class XmlSchemaFacets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xml_component_id")
    private int xmlComponentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "facet_id")
    private int facetId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "kind")
    private String kind;
    @Size(max = 60)
    @Column(name = "kind_desc")
    private String kindDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_fixed")
    private boolean isFixed;
    @Size(max = 4000)
    @Column(name = "value")
    private String value;

    public XmlSchemaFacets() {
    }

    public int getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(int xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public int getFacetId() {
        return facetId;
    }

    public void setFacetId(int facetId) {
        this.facetId = facetId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKindDesc() {
        return kindDesc;
    }

    public void setKindDesc(String kindDesc) {
        this.kindDesc = kindDesc;
    }

    public boolean getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(boolean isFixed) {
        this.isFixed = isFixed;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
