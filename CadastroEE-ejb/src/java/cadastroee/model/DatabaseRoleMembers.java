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
@Table(name = "database_role_members")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseRoleMembers.findAll", query = "SELECT d FROM DatabaseRoleMembers d"),
    @NamedQuery(name = "DatabaseRoleMembers.findByRolePrincipalId", query = "SELECT d FROM DatabaseRoleMembers d WHERE d.rolePrincipalId = :rolePrincipalId"),
    @NamedQuery(name = "DatabaseRoleMembers.findByMemberPrincipalId", query = "SELECT d FROM DatabaseRoleMembers d WHERE d.memberPrincipalId = :memberPrincipalId")})
public class DatabaseRoleMembers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_principal_id")
    private int rolePrincipalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "member_principal_id")
    private int memberPrincipalId;

    public DatabaseRoleMembers() {
    }

    public int getRolePrincipalId() {
        return rolePrincipalId;
    }

    public void setRolePrincipalId(int rolePrincipalId) {
        this.rolePrincipalId = rolePrincipalId;
    }

    public int getMemberPrincipalId() {
        return memberPrincipalId;
    }

    public void setMemberPrincipalId(int memberPrincipalId) {
        this.memberPrincipalId = memberPrincipalId;
    }
    
}
