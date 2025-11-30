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
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "sysmembers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysmembers.findAll", query = "SELECT s FROM Sysmembers s"),
    @NamedQuery(name = "Sysmembers.findByMemberuid", query = "SELECT s FROM Sysmembers s WHERE s.memberuid = :memberuid"),
    @NamedQuery(name = "Sysmembers.findByGroupuid", query = "SELECT s FROM Sysmembers s WHERE s.groupuid = :groupuid")})
public class Sysmembers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "memberuid")
    private Short memberuid;
    @Column(name = "groupuid")
    private Short groupuid;

    public Sysmembers() {
    }

    public Short getMemberuid() {
        return memberuid;
    }

    public void setMemberuid(Short memberuid) {
        this.memberuid = memberuid;
    }

    public Short getGroupuid() {
        return groupuid;
    }

    public void setGroupuid(Short groupuid) {
        this.groupuid = groupuid;
    }
    
}
