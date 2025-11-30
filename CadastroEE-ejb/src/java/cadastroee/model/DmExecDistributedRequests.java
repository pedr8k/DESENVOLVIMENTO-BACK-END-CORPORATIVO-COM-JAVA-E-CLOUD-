/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_exec_distributed_requests")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecDistributedRequests.findAll", query = "SELECT d FROM DmExecDistributedRequests d"),
    @NamedQuery(name = "DmExecDistributedRequests.findByExecutionId", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.executionId = :executionId"),
    @NamedQuery(name = "DmExecDistributedRequests.findByStatus", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.status = :status"),
    @NamedQuery(name = "DmExecDistributedRequests.findByErrorId", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.errorId = :errorId"),
    @NamedQuery(name = "DmExecDistributedRequests.findByStartTime", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmExecDistributedRequests.findByEndTime", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmExecDistributedRequests.findByTotalElapsedTime", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmExecDistributedRequests.findByComputePoolId", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.computePoolId = :computePoolId")})
public class DmExecDistributedRequests implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "sql_handle")
    private byte[] sqlHandle;
    @Size(max = 32)
    @Column(name = "execution_id")
    private String executionId;
    @Size(max = 32)
    @Column(name = "status")
    private String status;
    @Size(max = 36)
    @Column(name = "error_id")
    private String errorId;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "total_elapsed_time")
    private Integer totalElapsedTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecDistributedRequests() {
    }

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(Integer totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }
    
}
