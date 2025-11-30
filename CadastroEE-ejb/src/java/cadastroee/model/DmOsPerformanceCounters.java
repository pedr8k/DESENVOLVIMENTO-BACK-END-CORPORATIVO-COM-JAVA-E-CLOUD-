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
@Table(name = "dm_os_performance_counters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsPerformanceCounters.findAll", query = "SELECT d FROM DmOsPerformanceCounters d"),
    @NamedQuery(name = "DmOsPerformanceCounters.findByObjectName", query = "SELECT d FROM DmOsPerformanceCounters d WHERE d.objectName = :objectName"),
    @NamedQuery(name = "DmOsPerformanceCounters.findByCounterName", query = "SELECT d FROM DmOsPerformanceCounters d WHERE d.counterName = :counterName"),
    @NamedQuery(name = "DmOsPerformanceCounters.findByInstanceName", query = "SELECT d FROM DmOsPerformanceCounters d WHERE d.instanceName = :instanceName"),
    @NamedQuery(name = "DmOsPerformanceCounters.findByCntrValue", query = "SELECT d FROM DmOsPerformanceCounters d WHERE d.cntrValue = :cntrValue"),
    @NamedQuery(name = "DmOsPerformanceCounters.findByCntrType", query = "SELECT d FROM DmOsPerformanceCounters d WHERE d.cntrType = :cntrType")})
public class DmOsPerformanceCounters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "object_name")
    private String objectName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "counter_name")
    private String counterName;
    @Size(max = 128)
    @Column(name = "instance_name")
    private String instanceName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cntr_value")
    private long cntrValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cntr_type")
    private int cntrType;

    public DmOsPerformanceCounters() {
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getCounterName() {
        return counterName;
    }

    public void setCounterName(String counterName) {
        this.counterName = counterName;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public long getCntrValue() {
        return cntrValue;
    }

    public void setCntrValue(long cntrValue) {
        this.cntrValue = cntrValue;
    }

    public int getCntrType() {
        return cntrType;
    }

    public void setCntrType(int cntrType) {
        this.cntrType = cntrType;
    }
    
}
