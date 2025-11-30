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
@Table(name = "master_key_passwords")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MasterKeyPasswords.findAll", query = "SELECT m FROM MasterKeyPasswords m"),
    @NamedQuery(name = "MasterKeyPasswords.findByCredentialId", query = "SELECT m FROM MasterKeyPasswords m WHERE m.credentialId = :credentialId"),
    @NamedQuery(name = "MasterKeyPasswords.findByFamilyGuid", query = "SELECT m FROM MasterKeyPasswords m WHERE m.familyGuid = :familyGuid")})
public class MasterKeyPasswords implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "credential_id")
    private int credentialId;
    @Size(max = 36)
    @Column(name = "family_guid")
    private String familyGuid;

    public MasterKeyPasswords() {
    }

    public int getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(int credentialId) {
        this.credentialId = credentialId;
    }

    public String getFamilyGuid() {
        return familyGuid;
    }

    public void setFamilyGuid(String familyGuid) {
        this.familyGuid = familyGuid;
    }
    
}
