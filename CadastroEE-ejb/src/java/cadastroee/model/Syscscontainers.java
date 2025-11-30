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
@Table(name = "syscscontainers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscscontainers.findAll", query = "SELECT s FROM Syscscontainers s"),
    @NamedQuery(name = "Syscscontainers.findByBlobContainerId", query = "SELECT s FROM Syscscontainers s WHERE s.blobContainerId = :blobContainerId"),
    @NamedQuery(name = "Syscscontainers.findByBlobContainerUrl", query = "SELECT s FROM Syscscontainers s WHERE s.blobContainerUrl = :blobContainerUrl"),
    @NamedQuery(name = "Syscscontainers.findByBlobContainerType", query = "SELECT s FROM Syscscontainers s WHERE s.blobContainerType = :blobContainerType")})
public class Syscscontainers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "blob_container_id")
    private short blobContainerId;
    @Size(max = 261)
    @Column(name = "blob_container_url")
    private String blobContainerUrl;
    @Column(name = "blob_container_type")
    private Short blobContainerType;

    public Syscscontainers() {
    }

    public short getBlobContainerId() {
        return blobContainerId;
    }

    public void setBlobContainerId(short blobContainerId) {
        this.blobContainerId = blobContainerId;
    }

    public String getBlobContainerUrl() {
        return blobContainerUrl;
    }

    public void setBlobContainerUrl(String blobContainerUrl) {
        this.blobContainerUrl = blobContainerUrl;
    }

    public Short getBlobContainerType() {
        return blobContainerType;
    }

    public void setBlobContainerType(Short blobContainerType) {
        this.blobContainerType = blobContainerType;
    }
    
}
