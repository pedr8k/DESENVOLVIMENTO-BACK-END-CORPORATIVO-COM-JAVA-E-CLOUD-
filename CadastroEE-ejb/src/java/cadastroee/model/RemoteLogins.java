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
@Table(name = "remote_logins")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RemoteLogins.findAll", query = "SELECT r FROM RemoteLogins r"),
    @NamedQuery(name = "RemoteLogins.findByServerId", query = "SELECT r FROM RemoteLogins r WHERE r.serverId = :serverId"),
    @NamedQuery(name = "RemoteLogins.findByRemoteName", query = "SELECT r FROM RemoteLogins r WHERE r.remoteName = :remoteName"),
    @NamedQuery(name = "RemoteLogins.findByLocalPrincipalId", query = "SELECT r FROM RemoteLogins r WHERE r.localPrincipalId = :localPrincipalId"),
    @NamedQuery(name = "RemoteLogins.findByModifyDate", query = "SELECT r FROM RemoteLogins r WHERE r.modifyDate = :modifyDate")})
public class RemoteLogins implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "server_id")
    private int serverId;
    @Size(max = 128)
    @Column(name = "remote_name")
    private String remoteName;
    @Column(name = "local_principal_id")
    private Integer localPrincipalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    public RemoteLogins() {
    }

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public String getRemoteName() {
        return remoteName;
    }

    public void setRemoteName(String remoteName) {
        this.remoteName = remoteName;
    }

    public Integer getLocalPrincipalId() {
        return localPrincipalId;
    }

    public void setLocalPrincipalId(Integer localPrincipalId) {
        this.localPrincipalId = localPrincipalId;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
    
}
