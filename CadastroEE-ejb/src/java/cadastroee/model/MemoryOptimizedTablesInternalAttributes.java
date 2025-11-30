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
@Table(name = "memory_optimized_tables_internal_attributes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MemoryOptimizedTablesInternalAttributes.findAll", query = "SELECT m FROM MemoryOptimizedTablesInternalAttributes m"),
    @NamedQuery(name = "MemoryOptimizedTablesInternalAttributes.findByObjectId", query = "SELECT m FROM MemoryOptimizedTablesInternalAttributes m WHERE m.objectId = :objectId"),
    @NamedQuery(name = "MemoryOptimizedTablesInternalAttributes.findByXtpObjectId", query = "SELECT m FROM MemoryOptimizedTablesInternalAttributes m WHERE m.xtpObjectId = :xtpObjectId"),
    @NamedQuery(name = "MemoryOptimizedTablesInternalAttributes.findByType", query = "SELECT m FROM MemoryOptimizedTablesInternalAttributes m WHERE m.type = :type"),
    @NamedQuery(name = "MemoryOptimizedTablesInternalAttributes.findByTypeDesc", query = "SELECT m FROM MemoryOptimizedTablesInternalAttributes m WHERE m.typeDesc = :typeDesc"),
    @NamedQuery(name = "MemoryOptimizedTablesInternalAttributes.findByMinorId", query = "SELECT m FROM MemoryOptimizedTablesInternalAttributes m WHERE m.minorId = :minorId")})
public class MemoryOptimizedTablesInternalAttributes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "object_id")
    private Integer objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "xtp_object_id")
    private int xtpObjectId;
    @Column(name = "type")
    private Integer type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "minor_id")
    private int minorId;

    public MemoryOptimizedTablesInternalAttributes() {
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public int getXtpObjectId() {
        return xtpObjectId;
    }

    public void setXtpObjectId(int xtpObjectId) {
        this.xtpObjectId = xtpObjectId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public int getMinorId() {
        return minorId;
    }

    public void setMinorId(int minorId) {
        this.minorId = minorId;
    }
    
}
