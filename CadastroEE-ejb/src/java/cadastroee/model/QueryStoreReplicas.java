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
@Table(name = "query_store_replicas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStoreReplicas.findAll", query = "SELECT q FROM QueryStoreReplicas q"),
    @NamedQuery(name = "QueryStoreReplicas.findByReplicaGroupId", query = "SELECT q FROM QueryStoreReplicas q WHERE q.replicaGroupId = :replicaGroupId"),
    @NamedQuery(name = "QueryStoreReplicas.findByRoleType", query = "SELECT q FROM QueryStoreReplicas q WHERE q.roleType = :roleType"),
    @NamedQuery(name = "QueryStoreReplicas.findByReplicaName", query = "SELECT q FROM QueryStoreReplicas q WHERE q.replicaName = :replicaName")})
public class QueryStoreReplicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "replica_group_id")
    private long replicaGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_type")
    private short roleType;
    @Size(max = 644)
    @Column(name = "replica_name")
    private String replicaName;

    public QueryStoreReplicas() {
    }

    public long getReplicaGroupId() {
        return replicaGroupId;
    }

    public void setReplicaGroupId(long replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
    }

    public short getRoleType() {
        return roleType;
    }

    public void setRoleType(short roleType) {
        this.roleType = roleType;
    }

    public String getReplicaName() {
        return replicaName;
    }

    public void setReplicaName(String replicaName) {
        this.replicaName = replicaName;
    }
    
}
