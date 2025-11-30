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
@Table(name = "sysindexkeys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysindexkeys.findAll", query = "SELECT s FROM Sysindexkeys s"),
    @NamedQuery(name = "Sysindexkeys.findById", query = "SELECT s FROM Sysindexkeys s WHERE s.id = :id"),
    @NamedQuery(name = "Sysindexkeys.findByIndid", query = "SELECT s FROM Sysindexkeys s WHERE s.indid = :indid"),
    @NamedQuery(name = "Sysindexkeys.findByColid", query = "SELECT s FROM Sysindexkeys s WHERE s.colid = :colid"),
    @NamedQuery(name = "Sysindexkeys.findByKeyno", query = "SELECT s FROM Sysindexkeys s WHERE s.keyno = :keyno")})
public class Sysindexkeys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Column(name = "indid")
    private Short indid;
    @Column(name = "colid")
    private Short colid;
    @Column(name = "keyno")
    private Short keyno;

    public Sysindexkeys() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Short getIndid() {
        return indid;
    }

    public void setIndid(Short indid) {
        this.indid = indid;
    }

    public Short getColid() {
        return colid;
    }

    public void setColid(Short colid) {
        this.colid = colid;
    }

    public Short getKeyno() {
        return keyno;
    }

    public void setKeyno(Short keyno) {
        this.keyno = keyno;
    }
    
}
