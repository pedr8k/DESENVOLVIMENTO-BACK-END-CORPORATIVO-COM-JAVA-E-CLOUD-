/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_server_external_policy_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerExternalPolicyRoles.findAll", query = "SELECT d FROM DmServerExternalPolicyRoles d"),
    @NamedQuery(name = "DmServerExternalPolicyRoles.findByRoleName", query = "SELECT d FROM DmServerExternalPolicyRoles d WHERE d.roleName = :roleName"),
    @NamedQuery(name = "DmServerExternalPolicyRoles.findByRoleGuid", query = "SELECT d FROM DmServerExternalPolicyRoles d WHERE d.roleGuid = :roleGuid"),
    @NamedQuery(name = "DmServerExternalPolicyRoles.findByModifyDate", query = "SELECT d FROM DmServerExternalPolicyRoles d WHERE d.modifyDate = :modifyDate")})
public class DmServerExternalPolicyRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "role_name")
    private String roleName;
    @Size(max = 128)
    @Column(name = "role_guid")
    private String roleGuid;
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    public DmServerExternalPolicyRoles() {
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleGuid() {
        return roleGuid;
    }

    public void setRoleGuid(String roleGuid) {
        this.roleGuid = roleGuid;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
    
}
