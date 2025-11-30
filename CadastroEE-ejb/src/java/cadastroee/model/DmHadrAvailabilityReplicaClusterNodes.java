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
@Table(name = "dm_hadr_availability_replica_cluster_nodes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterNodes.findAll", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterNodes d"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterNodes.findByGroupName", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterNodes d WHERE d.groupName = :groupName"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterNodes.findByReplicaServerName", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterNodes d WHERE d.replicaServerName = :replicaServerName"),
    @NamedQuery(name = "DmHadrAvailabilityReplicaClusterNodes.findByNodeName", query = "SELECT d FROM DmHadrAvailabilityReplicaClusterNodes d WHERE d.nodeName = :nodeName")})
public class DmHadrAvailabilityReplicaClusterNodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "group_name")
    private String groupName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "replica_server_name")
    private String replicaServerName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "node_name")
    private String nodeName;

    public DmHadrAvailabilityReplicaClusterNodes() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getReplicaServerName() {
        return replicaServerName;
    }

    public void setReplicaServerName(String replicaServerName) {
        this.replicaServerName = replicaServerName;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
    
}
