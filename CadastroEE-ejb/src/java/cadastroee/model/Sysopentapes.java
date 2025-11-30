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
@Table(name = "sysopentapes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sysopentapes.findAll", query = "SELECT s FROM Sysopentapes s"),
    @NamedQuery(name = "Sysopentapes.findByOpenTape", query = "SELECT s FROM Sysopentapes s WHERE s.openTape = :openTape")})
public class Sysopentapes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "openTape")
    private String openTape;

    public Sysopentapes() {
    }

    public String getOpenTape() {
        return openTape;
    }

    public void setOpenTape(String openTape) {
        this.openTape = openTape;
    }
    
}
