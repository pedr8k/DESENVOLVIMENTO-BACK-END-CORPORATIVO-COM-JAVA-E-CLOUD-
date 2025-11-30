/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
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
@Table(name = "event_notifications")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EventNotifications.findAll", query = "SELECT e FROM EventNotifications e"),
    @NamedQuery(name = "EventNotifications.findByName", query = "SELECT e FROM EventNotifications e WHERE e.name = :name"),
    @NamedQuery(name = "EventNotifications.findByObjectId", query = "SELECT e FROM EventNotifications e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "EventNotifications.findByParentClass", query = "SELECT e FROM EventNotifications e WHERE e.parentClass = :parentClass"),
    @NamedQuery(name = "EventNotifications.findByParentClassDesc", query = "SELECT e FROM EventNotifications e WHERE e.parentClassDesc = :parentClassDesc"),
    @NamedQuery(name = "EventNotifications.findByParentId", query = "SELECT e FROM EventNotifications e WHERE e.parentId = :parentId"),
    @NamedQuery(name = "EventNotifications.findByCreateDate", query = "SELECT e FROM EventNotifications e WHERE e.createDate = :createDate"),
    @NamedQuery(name = "EventNotifications.findByModifyDate", query = "SELECT e FROM EventNotifications e WHERE e.modifyDate = :modifyDate"),
    @NamedQuery(name = "EventNotifications.findByServiceName", query = "SELECT e FROM EventNotifications e WHERE e.serviceName = :serviceName"),
    @NamedQuery(name = "EventNotifications.findByBrokerInstance", query = "SELECT e FROM EventNotifications e WHERE e.brokerInstance = :brokerInstance"),
    @NamedQuery(name = "EventNotifications.findByPrincipalId", query = "SELECT e FROM EventNotifications e WHERE e.principalId = :principalId")})
public class EventNotifications implements Serializable {

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
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Size(max = 256)
    @Column(name = "service_name")
    private String serviceName;
    @Size(max = 128)
    @Column(name = "broker_instance")
    private String brokerInstance;
    @Lob
    @Column(name = "creator_sid")
    private byte[] creatorSid;
    @Column(name = "principal_id")
    private Integer principalId;

    public EventNotifications() {
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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getBrokerInstance() {
        return brokerInstance;
    }

    public void setBrokerInstance(String brokerInstance) {
        this.brokerInstance = brokerInstance;
    }

    public byte[] getCreatorSid() {
        return creatorSid;
    }

    public void setCreatorSid(byte[] creatorSid) {
        this.creatorSid = creatorSid;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }
    
}
