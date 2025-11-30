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
@Table(name = "dm_exec_compute_node_errors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmExecComputeNodeErrors.findAll", query = "SELECT d FROM DmExecComputeNodeErrors d"),
    @NamedQuery(name = "DmExecComputeNodeErrors.findByErrorId", query = "SELECT d FROM DmExecComputeNodeErrors d WHERE d.errorId = :errorId"),
    @NamedQuery(name = "DmExecComputeNodeErrors.findBySource", query = "SELECT d FROM DmExecComputeNodeErrors d WHERE d.source = :source"),
    @NamedQuery(name = "DmExecComputeNodeErrors.findByType", query = "SELECT d FROM DmExecComputeNodeErrors d WHERE d.type = :type"),
    @NamedQuery(name = "DmExecComputeNodeErrors.findByCreateTime", query = "SELECT d FROM DmExecComputeNodeErrors d WHERE d.createTime = :createTime"),
    @NamedQuery(name = "DmExecComputeNodeErrors.findByComputeNodeId", query = "SELECT d FROM DmExecComputeNodeErrors d WHERE d.computeNodeId = :computeNodeId"),
    @NamedQuery(name = "DmExecComputeNodeErrors.findByExecutionId", query = "SELECT d FROM DmExecComputeNodeErrors d WHERE d.executionId = :executionId"),
    @NamedQuery(name = "DmExecComputeNodeErrors.findBySpid", query = "SELECT d FROM DmExecComputeNodeErrors d WHERE d.spid = :spid"),
    @NamedQuery(name = "DmExecComputeNodeErrors.findByThreadId", query = "SELECT d FROM DmExecComputeNodeErrors d WHERE d.threadId = :threadId"),
    @NamedQuery(name = "DmExecComputeNodeErrors.findByDetails", query = "SELECT d FROM DmExecComputeNodeErrors d WHERE d.details = :details"),
    @NamedQuery(name = "DmExecComputeNodeErrors.findByComputePoolId", query = "SELECT d FROM DmExecComputeNodeErrors d WHERE d.computePoolId = :computePoolId")})
public class DmExecComputeNodeErrors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 36)
    @Column(name = "error_id")
    private String errorId;
    @Size(max = 255)
    @Column(name = "source")
    private String source;
    @Size(max = 255)
    @Column(name = "type")
    private String type;
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "compute_node_id")
    private Integer computeNodeId;
    @Size(max = 36)
    @Column(name = "execution_id")
    private String executionId;
    @Column(name = "spid")
    private Integer spid;
    @Column(name = "thread_id")
    private Integer threadId;
    @Size(max = 4000)
    @Column(name = "details")
    private String details;
    @Basic(optional = false)
    @NotNull
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecComputeNodeErrors() {
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getComputeNodeId() {
        return computeNodeId;
    }

    public void setComputeNodeId(Integer computeNodeId) {
        this.computeNodeId = computeNodeId;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }
    
}
