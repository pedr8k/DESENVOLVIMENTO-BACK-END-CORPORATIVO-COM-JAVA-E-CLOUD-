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
@Table(name = "dm_os_cluster_nodes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsClusterNodes.findAll", query = "SELECT d FROM DmOsClusterNodes d"),
    @NamedQuery(name = "DmOsClusterNodes.findByNodeName", query = "SELECT d FROM DmOsClusterNodes d WHERE d.nodeName = :nodeName"),
    @NamedQuery(name = "DmOsClusterNodes.findByStatus", query = "SELECT d FROM DmOsClusterNodes d WHERE d.status = :status"),
    @NamedQuery(name = "DmOsClusterNodes.findByStatusDescription", query = "SELECT d FROM DmOsClusterNodes d WHERE d.statusDescription = :statusDescription"),
    @NamedQuery(name = "DmOsClusterNodes.findByIsCurrentOwner", query = "SELECT d FROM DmOsClusterNodes d WHERE d.isCurrentOwner = :isCurrentOwner")})
public class DmOsClusterNodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "NodeName")
    private String nodeName;
    @Column(name = "status")
    private Integer status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "status_description")
    private String statusDescription;
    @Column(name = "is_current_owner")
    private Boolean isCurrentOwner;

    public DmOsClusterNodes() {
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Boolean getIsCurrentOwner() {
        return isCurrentOwner;
    }

    public void setIsCurrentOwner(Boolean isCurrentOwner) {
        this.isCurrentOwner = isCurrentOwner;
    }
    
}
