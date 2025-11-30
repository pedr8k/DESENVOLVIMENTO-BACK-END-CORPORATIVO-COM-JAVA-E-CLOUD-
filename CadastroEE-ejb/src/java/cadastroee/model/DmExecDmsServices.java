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
@Table(name = "dm_exec_dms_services")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecDmsServices.findAll", query = "SELECT d FROM DmExecDmsServices d"),
    @NamedQuery(name = "DmExecDmsServices.findByDmsCoreId", query = "SELECT d FROM DmExecDmsServices d WHERE d.dmsCoreId = :dmsCoreId"),
    @NamedQuery(name = "DmExecDmsServices.findByComputeNodeId", query = "SELECT d FROM DmExecDmsServices d WHERE d.computeNodeId = :computeNodeId"),
    @NamedQuery(name = "DmExecDmsServices.findByStatus", query = "SELECT d FROM DmExecDmsServices d WHERE d.status = :status"),
    @NamedQuery(name = "DmExecDmsServices.findByComputePoolId", query = "SELECT d FROM DmExecDmsServices d WHERE d.computePoolId = :computePoolId")})
public class DmExecDmsServices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "dms_core_id")
    private Integer dmsCoreId;
    @Column(name = "compute_node_id")
    private Integer computeNodeId;
    @Size(max = 32)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecDmsServices() {
    }

    public Integer getDmsCoreId() {
        return dmsCoreId;
    }

    public void setDmsCoreId(Integer dmsCoreId) {
        this.dmsCoreId = dmsCoreId;
    }

    public Integer getComputeNodeId() {
        return computeNodeId;
    }

    public void setComputeNodeId(Integer computeNodeId) {
        this.computeNodeId = computeNodeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }
    
}
