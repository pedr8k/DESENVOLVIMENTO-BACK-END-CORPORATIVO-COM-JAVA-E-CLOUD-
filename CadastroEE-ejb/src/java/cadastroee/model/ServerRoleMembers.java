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
@Table(name = "server_role_members")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerRoleMembers.findAll", query = "SELECT s FROM ServerRoleMembers s"),
    @NamedQuery(name = "ServerRoleMembers.findByRolePrincipalId", query = "SELECT s FROM ServerRoleMembers s WHERE s.rolePrincipalId = :rolePrincipalId"),
    @NamedQuery(name = "ServerRoleMembers.findByMemberPrincipalId", query = "SELECT s FROM ServerRoleMembers s WHERE s.memberPrincipalId = :memberPrincipalId")})
public class ServerRoleMembers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_principal_id")
    private int rolePrincipalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "member_principal_id")
    private int memberPrincipalId;

    public ServerRoleMembers() {
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
