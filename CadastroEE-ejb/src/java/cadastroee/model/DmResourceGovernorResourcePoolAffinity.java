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
@Table(name = "dm_resource_governor_resource_pool_affinity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmResourceGovernorResourcePoolAffinity.findAll", query = "SELECT d FROM DmResourceGovernorResourcePoolAffinity d"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolAffinity.findByPoolId", query = "SELECT d FROM DmResourceGovernorResourcePoolAffinity d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolAffinity.findByProcessorGroup", query = "SELECT d FROM DmResourceGovernorResourcePoolAffinity d WHERE d.processorGroup = :processorGroup"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolAffinity.findBySchedulerMask", query = "SELECT d FROM DmResourceGovernorResourcePoolAffinity d WHERE d.schedulerMask = :schedulerMask")})
public class DmResourceGovernorResourcePoolAffinity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "processor_group")
    private short processorGroup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scheduler_mask")
    private long schedulerMask;

    public DmResourceGovernorResourcePoolAffinity() {
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(short processorGroup) {
        this.processorGroup = processorGroup;
    }

    public long getSchedulerMask() {
        return schedulerMask;
    }

    public void setSchedulerMask(long schedulerMask) {
        this.schedulerMask = schedulerMask;
    }
    
}
