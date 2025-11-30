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
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "server_principal_credentials")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerPrincipalCredentials.findAll", query = "SELECT s FROM ServerPrincipalCredentials s"),
    @NamedQuery(name = "ServerPrincipalCredentials.findByPrincipalId", query = "SELECT s FROM ServerPrincipalCredentials s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "ServerPrincipalCredentials.findByCredentialId", query = "SELECT s FROM ServerPrincipalCredentials s WHERE s.credentialId = :credentialId")})
public class ServerPrincipalCredentials implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "principal_id")
    private int principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "credential_id")
    private int credentialId;

    public ServerPrincipalCredentials() {
    }

    public int getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(int principalId) {
        this.principalId = principalId;
    }

    public int getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(int credentialId) {
        this.credentialId = credentialId;
    }
    
}
