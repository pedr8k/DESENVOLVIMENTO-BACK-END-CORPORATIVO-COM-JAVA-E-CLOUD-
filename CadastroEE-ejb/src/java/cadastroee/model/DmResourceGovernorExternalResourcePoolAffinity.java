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
@Table(name = "dm_resource_governor_external_resource_pool_affinity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmResourceGovernorExternalResourcePoolAffinity.findAll", query = "SELECT d FROM DmResourceGovernorExternalResourcePoolAffinity d"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePoolAffinity.findByExternalPoolId", query = "SELECT d FROM DmResourceGovernorExternalResourcePoolAffinity d WHERE d.externalPoolId = :externalPoolId"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePoolAffinity.findByProcessorGroup", query = "SELECT d FROM DmResourceGovernorExternalResourcePoolAffinity d WHERE d.processorGroup = :processorGroup"),
    @NamedQuery(name = "DmResourceGovernorExternalResourcePoolAffinity.findByCpuMask", query = "SELECT d FROM DmResourceGovernorExternalResourcePoolAffinity d WHERE d.cpuMask = :cpuMask")})
public class DmResourceGovernorExternalResourcePoolAffinity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_pool_id")
    private int externalPoolId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "processor_group")
    private short processorGroup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cpu_mask")
    private long cpuMask;

    public DmResourceGovernorExternalResourcePoolAffinity() {
    }

    public int getExternalPoolId() {
        return externalPoolId;
    }

    public void setExternalPoolId(int externalPoolId) {
        this.externalPoolId = externalPoolId;
    }

    public short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(short processorGroup) {
        this.processorGroup = processorGroup;
    }

    public long getCpuMask() {
        return cpuMask;
    }

    public void setCpuMask(long cpuMask) {
        this.cpuMask = cpuMask;
    }
    
}
