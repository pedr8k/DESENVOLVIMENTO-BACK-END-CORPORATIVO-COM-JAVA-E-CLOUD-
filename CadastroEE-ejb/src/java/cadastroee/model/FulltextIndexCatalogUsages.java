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
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "fulltext_index_catalog_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextIndexCatalogUsages.findAll", query = "SELECT f FROM FulltextIndexCatalogUsages f"),
    @NamedQuery(name = "FulltextIndexCatalogUsages.findByObjectId", query = "SELECT f FROM FulltextIndexCatalogUsages f WHERE f.objectId = :objectId"),
    @NamedQuery(name = "FulltextIndexCatalogUsages.findByIndexId", query = "SELECT f FROM FulltextIndexCatalogUsages f WHERE f.indexId = :indexId"),
    @NamedQuery(name = "FulltextIndexCatalogUsages.findByFulltextCatalogId", query = "SELECT f FROM FulltextIndexCatalogUsages f WHERE f.fulltextCatalogId = :fulltextCatalogId")})
public class FulltextIndexCatalogUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Column(name = "index_id")
    private Integer indexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fulltext_catalog_id")
    private int fulltextCatalogId;

    public FulltextIndexCatalogUsages() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public int getFulltextCatalogId() {
        return fulltextCatalogId;
    }

    public void setFulltextCatalogId(int fulltextCatalogId) {
        this.fulltextCatalogId = fulltextCatalogId;
    }
    
}
