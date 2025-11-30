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
@Table(name = "server_event_session_fields")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerEventSessionFields.findAll", query = "SELECT s FROM ServerEventSessionFields s"),
    @NamedQuery(name = "ServerEventSessionFields.findByEventSessionId", query = "SELECT s FROM ServerEventSessionFields s WHERE s.eventSessionId = :eventSessionId"),
    @NamedQuery(name = "ServerEventSessionFields.findByObjectId", query = "SELECT s FROM ServerEventSessionFields s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "ServerEventSessionFields.findByName", query = "SELECT s FROM ServerEventSessionFields s WHERE s.name = :name"),
    @NamedQuery(name = "ServerEventSessionFields.findByValue", query = "SELECT s FROM ServerEventSessionFields s WHERE s.value = :value")})
public class ServerEventSessionFields implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "event_session_id")
    private int eventSessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private Serializable value;

    public ServerEventSessionFields() {
    }

    public int getEventSessionId() {
        return eventSessionId;
    }

    public void setEventSessionId(int eventSessionId) {
        this.eventSessionId = eventSessionId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serializable getValue() {
        return value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }
    
}
