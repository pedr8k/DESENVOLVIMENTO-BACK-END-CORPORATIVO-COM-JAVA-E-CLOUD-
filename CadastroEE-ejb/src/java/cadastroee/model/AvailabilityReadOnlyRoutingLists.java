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
@Table(name = "availability_read_only_routing_lists")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvailabilityReadOnlyRoutingLists.findAll", query = "SELECT a FROM AvailabilityReadOnlyRoutingLists a"),
    @NamedQuery(name = "AvailabilityReadOnlyRoutingLists.findByReplicaId", query = "SELECT a FROM AvailabilityReadOnlyRoutingLists a WHERE a.replicaId = :replicaId"),
    @NamedQuery(name = "AvailabilityReadOnlyRoutingLists.findByRoutingPriority", query = "SELECT a FROM AvailabilityReadOnlyRoutingLists a WHERE a.routingPriority = :routingPriority"),
    @NamedQuery(name = "AvailabilityReadOnlyRoutingLists.findByReadOnlyReplicaId", query = "SELECT a FROM AvailabilityReadOnlyRoutingLists a WHERE a.readOnlyReplicaId = :readOnlyReplicaId")})
public class AvailabilityReadOnlyRoutingLists implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "replica_id")
    private String replicaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "routing_priority")
    private int routingPriority;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "read_only_replica_id")
    private String readOnlyReplicaId;

    public AvailabilityReadOnlyRoutingLists() {
    }

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }

    public int getRoutingPriority() {
        return routingPriority;
    }

    public void setRoutingPriority(int routingPriority) {
        this.routingPriority = routingPriority;
    }

    public String getReadOnlyReplicaId() {
        return readOnlyReplicaId;
    }

    public void setReadOnlyReplicaId(String readOnlyReplicaId) {
        this.readOnlyReplicaId = readOnlyReplicaId;
    }
    
}
