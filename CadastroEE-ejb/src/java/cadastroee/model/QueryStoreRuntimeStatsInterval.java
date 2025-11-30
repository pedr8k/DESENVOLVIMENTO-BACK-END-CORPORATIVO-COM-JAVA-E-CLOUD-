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
@Table(name = "query_store_runtime_stats_interval")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStoreRuntimeStatsInterval.findAll", query = "SELECT q FROM QueryStoreRuntimeStatsInterval q"),
    @NamedQuery(name = "QueryStoreRuntimeStatsInterval.findByRuntimeStatsIntervalId", query = "SELECT q FROM QueryStoreRuntimeStatsInterval q WHERE q.runtimeStatsIntervalId = :runtimeStatsIntervalId"),
    @NamedQuery(name = "QueryStoreRuntimeStatsInterval.findByStartTime", query = "SELECT q FROM QueryStoreRuntimeStatsInterval q WHERE q.startTime = :startTime"),
    @NamedQuery(name = "QueryStoreRuntimeStatsInterval.findByEndTime", query = "SELECT q FROM QueryStoreRuntimeStatsInterval q WHERE q.endTime = :endTime"),
    @NamedQuery(name = "QueryStoreRuntimeStatsInterval.findByComment", query = "SELECT q FROM QueryStoreRuntimeStatsInterval q WHERE q.comment = :comment")})
public class QueryStoreRuntimeStatsInterval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "runtime_stats_interval_id")
    private long runtimeStatsIntervalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    private Serializable startTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_time")
    private Serializable endTime;
    @Size(max = 2147483647)
    @Column(name = "comment")
    private String comment;

    public QueryStoreRuntimeStatsInterval() {
    }

    public long getRuntimeStatsIntervalId() {
        return runtimeStatsIntervalId;
    }

    public void setRuntimeStatsIntervalId(long runtimeStatsIntervalId) {
        this.runtimeStatsIntervalId = runtimeStatsIntervalId;
    }

    public Serializable getStartTime() {
        return startTime;
    }

    public void setStartTime(Serializable startTime) {
        this.startTime = startTime;
    }

    public Serializable getEndTime() {
        return endTime;
    }

    public void setEndTime(Serializable endTime) {
        this.endTime = endTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
