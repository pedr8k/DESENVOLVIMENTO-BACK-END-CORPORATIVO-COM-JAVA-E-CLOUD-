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
@Table(name = "dm_exec_query_optimizer_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecQueryOptimizerInfo.findAll", query = "SELECT d FROM DmExecQueryOptimizerInfo d"),
    @NamedQuery(name = "DmExecQueryOptimizerInfo.findByCounter", query = "SELECT d FROM DmExecQueryOptimizerInfo d WHERE d.counter = :counter"),
    @NamedQuery(name = "DmExecQueryOptimizerInfo.findByOccurrence", query = "SELECT d FROM DmExecQueryOptimizerInfo d WHERE d.occurrence = :occurrence"),
    @NamedQuery(name = "DmExecQueryOptimizerInfo.findByValue", query = "SELECT d FROM DmExecQueryOptimizerInfo d WHERE d.value = :value")})
public class DmExecQueryOptimizerInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "counter")
    private String counter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "occurrence")
    private long occurrence;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "value")
    private Double value;

    public DmExecQueryOptimizerInfo() {
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public long getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(long occurrence) {
        this.occurrence = occurrence;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
}
