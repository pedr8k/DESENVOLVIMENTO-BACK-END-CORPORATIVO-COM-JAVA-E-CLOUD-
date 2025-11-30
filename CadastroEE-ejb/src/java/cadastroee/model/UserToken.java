/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "user_token")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserToken.findAll", query = "SELECT u FROM UserToken u"),
    @NamedQuery(name = "UserToken.findByPrincipalId", query = "SELECT u FROM UserToken u WHERE u.principalId = :principalId"),
    @NamedQuery(name = "UserToken.findByName", query = "SELECT u FROM UserToken u WHERE u.name = :name"),
    @NamedQuery(name = "UserToken.findByType", query = "SELECT u FROM UserToken u WHERE u.type = :type"),
    @NamedQuery(name = "UserToken.findByUsage", query = "SELECT u FROM UserToken u WHERE u.usage = :usage")})
public class UserToken implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "principal_id")
    private Integer principalId;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 128)
    @Column(name = "type")
    private String type;
    @Size(max = 128)
    @Column(name = "usage")
    private String usage;

    public UserToken() {
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
    
}
