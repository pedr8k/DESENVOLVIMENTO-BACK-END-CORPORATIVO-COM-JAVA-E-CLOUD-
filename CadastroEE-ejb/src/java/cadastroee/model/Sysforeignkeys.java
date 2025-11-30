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
@Table(name = "sysforeignkeys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysforeignkeys.findAll", query = "SELECT s FROM Sysforeignkeys s"),
    @NamedQuery(name = "Sysforeignkeys.findByConstid", query = "SELECT s FROM Sysforeignkeys s WHERE s.constid = :constid"),
    @NamedQuery(name = "Sysforeignkeys.findByFkeyid", query = "SELECT s FROM Sysforeignkeys s WHERE s.fkeyid = :fkeyid"),
    @NamedQuery(name = "Sysforeignkeys.findByRkeyid", query = "SELECT s FROM Sysforeignkeys s WHERE s.rkeyid = :rkeyid"),
    @NamedQuery(name = "Sysforeignkeys.findByFkey", query = "SELECT s FROM Sysforeignkeys s WHERE s.fkey = :fkey"),
    @NamedQuery(name = "Sysforeignkeys.findByRkey", query = "SELECT s FROM Sysforeignkeys s WHERE s.rkey = :rkey"),
    @NamedQuery(name = "Sysforeignkeys.findByKeyno", query = "SELECT s FROM Sysforeignkeys s WHERE s.keyno = :keyno")})
public class Sysforeignkeys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "constid")
    private int constid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkeyid")
    private int fkeyid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rkeyid")
    private int rkeyid;
    @Column(name = "fkey")
    private Short fkey;
    @Column(name = "rkey")
    private Short rkey;
    @Column(name = "keyno")
    private Short keyno;

    public Sysforeignkeys() {
    }

    public int getConstid() {
        return constid;
    }

    public void setConstid(int constid) {
        this.constid = constid;
    }

    public int getFkeyid() {
        return fkeyid;
    }

    public void setFkeyid(int fkeyid) {
        this.fkeyid = fkeyid;
    }

    public int getRkeyid() {
        return rkeyid;
    }

    public void setRkeyid(int rkeyid) {
        this.rkeyid = rkeyid;
    }

    public Short getFkey() {
        return fkey;
    }

    public void setFkey(Short fkey) {
        this.fkey = fkey;
    }

    public Short getRkey() {
        return rkey;
    }

    public void setRkey(Short rkey) {
        this.rkey = rkey;
    }

    public Short getKeyno() {
        return keyno;
    }

    public void setKeyno(Short keyno) {
        this.keyno = keyno;
    }
    
}
