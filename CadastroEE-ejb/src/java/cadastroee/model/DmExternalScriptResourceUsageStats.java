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
@Table(name = "dm_external_script_resource_usage_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findAll", query = "SELECT d FROM DmExternalScriptResourceUsageStats d"),
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findByPackageName", query = "SELECT d FROM DmExternalScriptResourceUsageStats d WHERE d.packageName = :packageName"),
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findByMemoryUsage", query = "SELECT d FROM DmExternalScriptResourceUsageStats d WHERE d.memoryUsage = :memoryUsage"),
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findByCpuUsage", query = "SELECT d FROM DmExternalScriptResourceUsageStats d WHERE d.cpuUsage = :cpuUsage")})
public class DmExternalScriptResourceUsageStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "package_name")
    private String packageName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_usage")
    private long memoryUsage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpu_usage")
    private long cpuUsage;

    public DmExternalScriptResourceUsageStats() {
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public long getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(long memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public long getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(long cpuUsage) {
        this.cpuUsage = cpuUsage;
    }
    
}
