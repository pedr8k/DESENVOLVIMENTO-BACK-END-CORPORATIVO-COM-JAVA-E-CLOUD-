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
@Table(name = "dm_external_script_execution_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExternalScriptExecutionStats.findAll", query = "SELECT d FROM DmExternalScriptExecutionStats d"),
    @NamedQuery(name = "DmExternalScriptExecutionStats.findByLanguage", query = "SELECT d FROM DmExternalScriptExecutionStats d WHERE d.language = :language"),
    @NamedQuery(name = "DmExternalScriptExecutionStats.findByCounterName", query = "SELECT d FROM DmExternalScriptExecutionStats d WHERE d.counterName = :counterName"),
    @NamedQuery(name = "DmExternalScriptExecutionStats.findByCounterValue", query = "SELECT d FROM DmExternalScriptExecutionStats d WHERE d.counterValue = :counterValue")})
public class DmExternalScriptExecutionStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "language")
    private String language;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "counter_name")
    private String counterName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "counter_value")
    private long counterValue;

    public DmExternalScriptExecutionStats() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCounterName() {
        return counterName;
    }

    public void setCounterName(String counterName) {
        this.counterName = counterName;
    }

    public long getCounterValue() {
        return counterValue;
    }

    public void setCounterValue(long counterValue) {
        this.counterValue = counterValue;
    }
    
}
