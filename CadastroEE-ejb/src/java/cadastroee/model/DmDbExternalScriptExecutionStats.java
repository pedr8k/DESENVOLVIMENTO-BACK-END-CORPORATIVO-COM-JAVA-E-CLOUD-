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
@Table(name = "dm_db_external_script_execution_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbExternalScriptExecutionStats.findAll", query = "SELECT d FROM DmDbExternalScriptExecutionStats d"),
    @NamedQuery(name = "DmDbExternalScriptExecutionStats.findByExternalLanguageId", query = "SELECT d FROM DmDbExternalScriptExecutionStats d WHERE d.externalLanguageId = :externalLanguageId"),
    @NamedQuery(name = "DmDbExternalScriptExecutionStats.findByCounterName", query = "SELECT d FROM DmDbExternalScriptExecutionStats d WHERE d.counterName = :counterName"),
    @NamedQuery(name = "DmDbExternalScriptExecutionStats.findByCounterValue", query = "SELECT d FROM DmDbExternalScriptExecutionStats d WHERE d.counterValue = :counterValue")})
public class DmDbExternalScriptExecutionStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_language_id")
    private int externalLanguageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "counter_name")
    private String counterName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "counter_value")
    private long counterValue;

    public DmDbExternalScriptExecutionStats() {
    }

    public int getExternalLanguageId() {
        return externalLanguageId;
    }

    public void setExternalLanguageId(int externalLanguageId) {
        this.externalLanguageId = externalLanguageId;
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
