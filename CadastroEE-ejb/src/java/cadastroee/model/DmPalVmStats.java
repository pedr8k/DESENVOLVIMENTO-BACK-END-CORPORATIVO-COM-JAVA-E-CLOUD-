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
@Table(name = "dm_pal_vm_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmPalVmStats.findAll", query = "SELECT d FROM DmPalVmStats d"),
    @NamedQuery(name = "DmPalVmStats.findByVmMetricName", query = "SELECT d FROM DmPalVmStats d WHERE d.vmMetricName = :vmMetricName"),
    @NamedQuery(name = "DmPalVmStats.findByCount", query = "SELECT d FROM DmPalVmStats d WHERE d.count = :count")})
public class DmPalVmStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "vm_metric_name")
    private String vmMetricName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "count")
    private long count;

    public DmPalVmStats() {
    }

    public String getVmMetricName() {
        return vmMetricName;
    }

    public void setVmMetricName(String vmMetricName) {
        this.vmMetricName = vmMetricName;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
    
}
