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
@Table(name = "syscursorrefs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Syscursorrefs.findAll", query = "SELECT s FROM Syscursorrefs s"),
    @NamedQuery(name = "Syscursorrefs.findByReferenceName", query = "SELECT s FROM Syscursorrefs s WHERE s.referenceName = :referenceName"),
    @NamedQuery(name = "Syscursorrefs.findByCursorScope", query = "SELECT s FROM Syscursorrefs s WHERE s.cursorScope = :cursorScope"),
    @NamedQuery(name = "Syscursorrefs.findByCursorHandl", query = "SELECT s FROM Syscursorrefs s WHERE s.cursorHandl = :cursorHandl")})
public class Syscursorrefs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "reference_name")
    private String referenceName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cursor_scope")
    private short cursorScope;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cursor_handl")
    private int cursorHandl;

    public Syscursorrefs() {
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public short getCursorScope() {
        return cursorScope;
    }

    public void setCursorScope(short cursorScope) {
        this.cursorScope = cursorScope;
    }

    public int getCursorHandl() {
        return cursorHandl;
    }

    public void setCursorHandl(int cursorHandl) {
        this.cursorHandl = cursorHandl;
    }
    
}
