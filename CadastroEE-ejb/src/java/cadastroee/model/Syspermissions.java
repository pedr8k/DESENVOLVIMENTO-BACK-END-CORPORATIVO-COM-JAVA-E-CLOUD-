/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
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
@Table(name = "syspermissions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syspermissions.findAll", query = "SELECT s FROM Syspermissions s"),
    @NamedQuery(name = "Syspermissions.findById", query = "SELECT s FROM Syspermissions s WHERE s.id = :id"),
    @NamedQuery(name = "Syspermissions.findByGrantee", query = "SELECT s FROM Syspermissions s WHERE s.grantee = :grantee"),
    @NamedQuery(name = "Syspermissions.findByGrantor", query = "SELECT s FROM Syspermissions s WHERE s.grantor = :grantor"),
    @NamedQuery(name = "Syspermissions.findByActadd", query = "SELECT s FROM Syspermissions s WHERE s.actadd = :actadd"),
    @NamedQuery(name = "Syspermissions.findByActmod", query = "SELECT s FROM Syspermissions s WHERE s.actmod = :actmod")})
public class Syspermissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Column(name = "grantee")
    private Short grantee;
    @Column(name = "grantor")
    private Short grantor;
    @Column(name = "actadd")
    private Short actadd;
    @Column(name = "actmod")
    private Short actmod;
    @Lob
    @Column(name = "seladd")
    private byte[] seladd;
    @Lob
    @Column(name = "selmod")
    private byte[] selmod;
    @Lob
    @Column(name = "updadd")
    private byte[] updadd;
    @Lob
    @Column(name = "updmod")
    private byte[] updmod;
    @Lob
    @Column(name = "refadd")
    private byte[] refadd;
    @Lob
    @Column(name = "refmod")
    private byte[] refmod;

    public Syspermissions() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Short getGrantee() {
        return grantee;
    }

    public void setGrantee(Short grantee) {
        this.grantee = grantee;
    }

    public Short getGrantor() {
        return grantor;
    }

    public void setGrantor(Short grantor) {
        this.grantor = grantor;
    }

    public Short getActadd() {
        return actadd;
    }

    public void setActadd(Short actadd) {
        this.actadd = actadd;
    }

    public Short getActmod() {
        return actmod;
    }

    public void setActmod(Short actmod) {
        this.actmod = actmod;
    }

    public byte[] getSeladd() {
        return seladd;
    }

    public void setSeladd(byte[] seladd) {
        this.seladd = seladd;
    }

    public byte[] getSelmod() {
        return selmod;
    }

    public void setSelmod(byte[] selmod) {
        this.selmod = selmod;
    }

    public byte[] getUpdadd() {
        return updadd;
    }

    public void setUpdadd(byte[] updadd) {
        this.updadd = updadd;
    }

    public byte[] getUpdmod() {
        return updmod;
    }

    public void setUpdmod(byte[] updmod) {
        this.updmod = updmod;
    }

    public byte[] getRefadd() {
        return refadd;
    }

    public void setRefadd(byte[] refadd) {
        this.refadd = refadd;
    }

    public byte[] getRefmod() {
        return refmod;
    }

    public void setRefmod(byte[] refmod) {
        this.refmod = refmod;
    }
    
}
