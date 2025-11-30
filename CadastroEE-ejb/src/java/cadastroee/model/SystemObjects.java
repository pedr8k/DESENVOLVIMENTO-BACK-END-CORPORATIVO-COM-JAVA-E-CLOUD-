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
@Table(name = "system_objects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemObjects.findAll", query = "SELECT s FROM SystemObjects s"),
    @NamedQuery(name = "SystemObjects.findByName", query = "SELECT s FROM SystemObjects s WHERE s.name = :name"),
    @NamedQuery(name = "SystemObjects.findByObjectId", query = "SELECT s FROM SystemObjects s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SystemObjects.findByPrincipalId", query = "SELECT s FROM SystemObjects s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "SystemObjects.findBySchemaId", query = "SELECT s FROM SystemObjects s WHERE s.schemaId = :schemaId"),
    @NamedQuery(name = "SystemObjects.findByParentObjectId", query = "SELECT s FROM SystemObjects s WHERE s.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "SystemObjects.findByType", query = "SELECT s FROM SystemObjects s WHERE s.type = :type"),
    @NamedQuery(name = "SystemObjects.findByTypeDesc", query = "SELECT s FROM SystemObjects s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "SystemObjects.findByCreateDate", query = "SELECT s FROM SystemObjects s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "SystemObjects.findByModifyDate", query = "SELECT s FROM SystemObjects s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "SystemObjects.findByIsMsShipped", query = "SELECT s FROM SystemObjects s WHERE s.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "SystemObjects.findByIsPublished", query = "SELECT s FROM SystemObjects s WHERE s.isPublished = :isPublished"),
    @NamedQuery(name = "SystemObjects.findByIsSchemaPublished", query = "SELECT s FROM SystemObjects s WHERE s.isSchemaPublished = :isSchemaPublished")})
public class SystemObjects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "schema_id")
    private int schemaId;
    @Column(name = "parent_object_id")
    private Integer parentObjectId;
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
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "is_ms_shipped")
    private Boolean isMsShipped;
    @Column(name = "is_published")
    private Boolean isPublished;
    @Column(name = "is_schema_published")
    private Boolean isSchemaPublished;

    public SystemObjects() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public int getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(int schemaId) {
        this.schemaId = schemaId;
    }

    public Integer getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(Integer parentObjectId) {
        this.parentObjectId = parentObjectId;
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

    public Boolean getIsMsShipped() {
        return isMsShipped;
    }

    public void setIsMsShipped(Boolean isMsShipped) {
        this.isMsShipped = isMsShipped;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public Boolean getIsSchemaPublished() {
        return isSchemaPublished;
    }

    public void setIsSchemaPublished(Boolean isSchemaPublished) {
        this.isSchemaPublished = isSchemaPublished;
    }
    
}
