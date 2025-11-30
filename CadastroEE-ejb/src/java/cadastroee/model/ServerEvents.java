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
@Table(name = "server_events")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerEvents.findAll", query = "SELECT s FROM ServerEvents s"),
    @NamedQuery(name = "ServerEvents.findByObjectId", query = "SELECT s FROM ServerEvents s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "ServerEvents.findByType", query = "SELECT s FROM ServerEvents s WHERE s.type = :type"),
    @NamedQuery(name = "ServerEvents.findByTypeDesc", query = "SELECT s FROM ServerEvents s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "ServerEvents.findByIsTriggerEvent", query = "SELECT s FROM ServerEvents s WHERE s.isTriggerEvent = :isTriggerEvent"),
    @NamedQuery(name = "ServerEvents.findByEventGroupType", query = "SELECT s FROM ServerEvents s WHERE s.eventGroupType = :eventGroupType"),
    @NamedQuery(name = "ServerEvents.findByEventGroupTypeDesc", query = "SELECT s FROM ServerEvents s WHERE s.eventGroupTypeDesc = :eventGroupTypeDesc")})
public class ServerEvents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private int type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "is_trigger_event")
    private Boolean isTriggerEvent;
    @Column(name = "event_group_type")
    private Integer eventGroupType;
    @Size(max = 128)
    @Column(name = "event_group_type_desc")
    private String eventGroupTypeDesc;

    public ServerEvents() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Boolean getIsTriggerEvent() {
        return isTriggerEvent;
    }

    public void setIsTriggerEvent(Boolean isTriggerEvent) {
        this.isTriggerEvent = isTriggerEvent;
    }

    public Integer getEventGroupType() {
        return eventGroupType;
    }

    public void setEventGroupType(Integer eventGroupType) {
        this.eventGroupType = eventGroupType;
    }

    public String getEventGroupTypeDesc() {
        return eventGroupTypeDesc;
    }

    public void setEventGroupTypeDesc(String eventGroupTypeDesc) {
        this.eventGroupTypeDesc = eventGroupTypeDesc;
    }
    
}
