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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "partition_functions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PartitionFunctions.findAll", query = "SELECT p FROM PartitionFunctions p"),
    @NamedQuery(name = "PartitionFunctions.findByName", query = "SELECT p FROM PartitionFunctions p WHERE p.name = :name"),
    @NamedQuery(name = "PartitionFunctions.findByFunctionId", query = "SELECT p FROM PartitionFunctions p WHERE p.functionId = :functionId"),
    @NamedQuery(name = "PartitionFunctions.findByType", query = "SELECT p FROM PartitionFunctions p WHERE p.type = :type"),
    @NamedQuery(name = "PartitionFunctions.findByTypeDesc", query = "SELECT p FROM PartitionFunctions p WHERE p.typeDesc = :typeDesc"),
    @NamedQuery(name = "PartitionFunctions.findByFanout", query = "SELECT p FROM PartitionFunctions p WHERE p.fanout = :fanout"),
    @NamedQuery(name = "PartitionFunctions.findByBoundaryValueOnRight", query = "SELECT p FROM PartitionFunctions p WHERE p.boundaryValueOnRight = :boundaryValueOnRight"),
    @NamedQuery(name = "PartitionFunctions.findByIsSystem", query = "SELECT p FROM PartitionFunctions p WHERE p.isSystem = :isSystem"),
    @NamedQuery(name = "PartitionFunctions.findByCreateDate", query = "SELECT p FROM PartitionFunctions p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "PartitionFunctions.findByModifyDate", query = "SELECT p FROM PartitionFunctions p WHERE p.modifyDate = :modifyDate")})
public class PartitionFunctions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "function_id")
    private int functionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "type")
    private String type;
    @Size(max = 60)
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fanout")
    private int fanout;
    @Basic(optional = false)
    @NotNull
    @Column(name = "boundary_value_on_right")
    private boolean boundaryValueOnRight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_system")
    private boolean isSystem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    public PartitionFunctions() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFunctionId() {
        return functionId;
    }

    public void setFunctionId(int functionId) {
        this.functionId = functionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public int getFanout() {
        return fanout;
    }

    public void setFanout(int fanout) {
        this.fanout = fanout;
    }

    public boolean getBoundaryValueOnRight() {
        return boundaryValueOnRight;
    }

    public void setBoundaryValueOnRight(boolean boundaryValueOnRight) {
        this.boundaryValueOnRight = boundaryValueOnRight;
    }

    public boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(boolean isSystem) {
        this.isSystem = isSystem;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
    
}
