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
@Table(name = "server_triggers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerTriggers.findAll", query = "SELECT s FROM ServerTriggers s"),
    @NamedQuery(name = "ServerTriggers.findByName", query = "SELECT s FROM ServerTriggers s WHERE s.name = :name"),
    @NamedQuery(name = "ServerTriggers.findByObjectId", query = "SELECT s FROM ServerTriggers s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "ServerTriggers.findByParentClass", query = "SELECT s FROM ServerTriggers s WHERE s.parentClass = :parentClass"),
    @NamedQuery(name = "ServerTriggers.findByParentClassDesc", query = "SELECT s FROM ServerTriggers s WHERE s.parentClassDesc = :parentClassDesc"),
    @NamedQuery(name = "ServerTriggers.findByParentId", query = "SELECT s FROM ServerTriggers s WHERE s.parentId = :parentId"),
    @NamedQuery(name = "ServerTriggers.findByType", query = "SELECT s FROM ServerTriggers s WHERE s.type = :type"),
    @NamedQuery(name = "ServerTriggers.findByTypeDesc", query = "SELECT s FROM ServerTriggers s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "ServerTriggers.findByCreateDate", query = "SELECT s FROM ServerTriggers s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "ServerTriggers.findByModifyDate", query = "SELECT s FROM ServerTriggers s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "ServerTriggers.findByIsMsShipped", query = "SELECT s FROM ServerTriggers s WHERE s.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "ServerTriggers.findByIsDisabled", query = "SELECT s FROM ServerTriggers s WHERE s.isDisabled = :isDisabled")})
public class ServerTriggers implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_class")
    private short parentClass;
    @Size(max = 60)
    @Column(name = "parent_class_desc")
    private String parentClassDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_id")
    private int parentId;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ms_shipped")
    private boolean isMsShipped;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_disabled")
    private boolean isDisabled;

    public ServerTriggers() {
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

    public short getParentClass() {
        return parentClass;
    }

    public void setParentClass(short parentClass) {
        this.parentClass = parentClass;
    }

    public String getParentClassDesc() {
        return parentClassDesc;
    }

    public void setParentClassDesc(String parentClassDesc) {
        this.parentClassDesc = parentClassDesc;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
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

    public boolean getIsMsShipped() {
        return isMsShipped;
    }

    public void setIsMsShipped(boolean isMsShipped) {
        this.isMsShipped = isMsShipped;
    }

    public boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }
    
}
