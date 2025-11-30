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
@Table(name = "allocation_units")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AllocationUnits.findAll", query = "SELECT a FROM AllocationUnits a"),
    @NamedQuery(name = "AllocationUnits.findByAllocationUnitId", query = "SELECT a FROM AllocationUnits a WHERE a.allocationUnitId = :allocationUnitId"),
    @NamedQuery(name = "AllocationUnits.findByType", query = "SELECT a FROM AllocationUnits a WHERE a.type = :type"),
    @NamedQuery(name = "AllocationUnits.findByTypeDesc", query = "SELECT a FROM AllocationUnits a WHERE a.typeDesc = :typeDesc"),
    @NamedQuery(name = "AllocationUnits.findByContainerId", query = "SELECT a FROM AllocationUnits a WHERE a.containerId = :containerId"),
    @NamedQuery(name = "AllocationUnits.findByDataSpaceId", query = "SELECT a FROM AllocationUnits a WHERE a.dataSpaceId = :dataSpaceId"),
    @NamedQuery(name = "AllocationUnits.findByTotalPages", query = "SELECT a FROM AllocationUnits a WHERE a.totalPages = :totalPages"),
    @NamedQuery(name = "AllocationUnits.findByUsedPages", query = "SELECT a FROM AllocationUnits a WHERE a.usedPages = :usedPages"),
    @NamedQuery(name = "AllocationUnits.findByDataPages", query = "SELECT a FROM AllocationUnits a WHERE a.dataPages = :dataPages")})
public class AllocationUnits implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "allocation_unit_id")
    private long allocationUnitId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "container_id")
    private long containerId;
    @Column(name = "data_space_id")
    private Integer dataSpaceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_pages")
    private long totalPages;
    @Basic(optional = false)
    @NotNull
    @Column(name = "used_pages")
    private long usedPages;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_pages")
    private long dataPages;

    public AllocationUnits() {
    }

    public long getAllocationUnitId() {
        return allocationUnitId;
    }

    public void setAllocationUnitId(long allocationUnitId) {
        this.allocationUnitId = allocationUnitId;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public long getContainerId() {
        return containerId;
    }

    public void setContainerId(long containerId) {
        this.containerId = containerId;
    }

    public Integer getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(Integer dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public long getUsedPages() {
        return usedPages;
    }

    public void setUsedPages(long usedPages) {
        this.usedPages = usedPages;
    }

    public long getDataPages() {
        return dataPages;
    }

    public void setDataPages(long dataPages) {
        this.dataPages = dataPages;
    }
    
}
