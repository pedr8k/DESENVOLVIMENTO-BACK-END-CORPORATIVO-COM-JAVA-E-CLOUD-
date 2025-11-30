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
@Table(name = "sysfilegroups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysfilegroups.findAll", query = "SELECT s FROM Sysfilegroups s"),
    @NamedQuery(name = "Sysfilegroups.findByGroupid", query = "SELECT s FROM Sysfilegroups s WHERE s.groupid = :groupid"),
    @NamedQuery(name = "Sysfilegroups.findByAllocpolicy", query = "SELECT s FROM Sysfilegroups s WHERE s.allocpolicy = :allocpolicy"),
    @NamedQuery(name = "Sysfilegroups.findByStatus", query = "SELECT s FROM Sysfilegroups s WHERE s.status = :status"),
    @NamedQuery(name = "Sysfilegroups.findByGroupname", query = "SELECT s FROM Sysfilegroups s WHERE s.groupname = :groupname")})
public class Sysfilegroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "groupid")
    private Short groupid;
    @Column(name = "allocpolicy")
    private Short allocpolicy;
    @Column(name = "status")
    private Integer status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "groupname")
    private String groupname;

    public Sysfilegroups() {
    }

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Short getAllocpolicy() {
        return allocpolicy;
    }

    public void setAllocpolicy(Short allocpolicy) {
        this.allocpolicy = allocpolicy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
    
}
