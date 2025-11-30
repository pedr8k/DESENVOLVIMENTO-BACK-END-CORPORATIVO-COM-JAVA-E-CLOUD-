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
@Table(name = "trace_categories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraceCategories.findAll", query = "SELECT t FROM TraceCategories t"),
    @NamedQuery(name = "TraceCategories.findByCategoryId", query = "SELECT t FROM TraceCategories t WHERE t.categoryId = :categoryId"),
    @NamedQuery(name = "TraceCategories.findByName", query = "SELECT t FROM TraceCategories t WHERE t.name = :name"),
    @NamedQuery(name = "TraceCategories.findByType", query = "SELECT t FROM TraceCategories t WHERE t.type = :type")})
public class TraceCategories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "category_id")
    private short categoryId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;

    public TraceCategories() {
    }

    public short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(short categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }
    
}
