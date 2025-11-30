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
@Table(name = "dm_io_cluster_valid_path_names")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmIoClusterValidPathNames.findAll", query = "SELECT d FROM DmIoClusterValidPathNames d"),
    @NamedQuery(name = "DmIoClusterValidPathNames.findByPathName", query = "SELECT d FROM DmIoClusterValidPathNames d WHERE d.pathName = :pathName"),
    @NamedQuery(name = "DmIoClusterValidPathNames.findByClusterOwnerNode", query = "SELECT d FROM DmIoClusterValidPathNames d WHERE d.clusterOwnerNode = :clusterOwnerNode"),
    @NamedQuery(name = "DmIoClusterValidPathNames.findByIsClusterSharedVolume", query = "SELECT d FROM DmIoClusterValidPathNames d WHERE d.isClusterSharedVolume = :isClusterSharedVolume")})
public class DmIoClusterValidPathNames implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 256)
    @Column(name = "path_name")
    private String pathName;
    @Size(max = 60)
    @Column(name = "cluster_owner_node")
    private String clusterOwnerNode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_cluster_shared_volume")
    private boolean isClusterSharedVolume;

    public DmIoClusterValidPathNames() {
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public String getClusterOwnerNode() {
        return clusterOwnerNode;
    }

    public void setClusterOwnerNode(String clusterOwnerNode) {
        this.clusterOwnerNode = clusterOwnerNode;
    }

    public boolean getIsClusterSharedVolume() {
        return isClusterSharedVolume;
    }

    public void setIsClusterSharedVolume(boolean isClusterSharedVolume) {
        this.isClusterSharedVolume = isClusterSharedVolume;
    }
    
}
