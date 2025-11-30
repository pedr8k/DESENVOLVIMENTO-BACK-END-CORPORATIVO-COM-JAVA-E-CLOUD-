/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_broker_queue_monitors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmBrokerQueueMonitors.findAll", query = "SELECT d FROM DmBrokerQueueMonitors d"),
    @NamedQuery(name = "DmBrokerQueueMonitors.findByDatabaseId", query = "SELECT d FROM DmBrokerQueueMonitors d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmBrokerQueueMonitors.findByQueueId", query = "SELECT d FROM DmBrokerQueueMonitors d WHERE d.queueId = :queueId"),
    @NamedQuery(name = "DmBrokerQueueMonitors.findByState", query = "SELECT d FROM DmBrokerQueueMonitors d WHERE d.state = :state"),
    @NamedQuery(name = "DmBrokerQueueMonitors.findByLastEmptyRowsetTime", query = "SELECT d FROM DmBrokerQueueMonitors d WHERE d.lastEmptyRowsetTime = :lastEmptyRowsetTime"),
    @NamedQuery(name = "DmBrokerQueueMonitors.findByLastActivatedTime", query = "SELECT d FROM DmBrokerQueueMonitors d WHERE d.lastActivatedTime = :lastActivatedTime"),
    @NamedQuery(name = "DmBrokerQueueMonitors.findByTasksWaiting", query = "SELECT d FROM DmBrokerQueueMonitors d WHERE d.tasksWaiting = :tasksWaiting")})
public class DmBrokerQueueMonitors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "queue_id")
    private Integer queueId;
    @Size(max = 32)
    @Column(name = "state")
    private String state;
    @Column(name = "last_empty_rowset_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastEmptyRowsetTime;
    @Column(name = "last_activated_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastActivatedTime;
    @Column(name = "tasks_waiting")
    private Integer tasksWaiting;

    public DmBrokerQueueMonitors() {
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getLastEmptyRowsetTime() {
        return lastEmptyRowsetTime;
    }

    public void setLastEmptyRowsetTime(Date lastEmptyRowsetTime) {
        this.lastEmptyRowsetTime = lastEmptyRowsetTime;
    }

    public Date getLastActivatedTime() {
        return lastActivatedTime;
    }

    public void setLastActivatedTime(Date lastActivatedTime) {
        this.lastActivatedTime = lastActivatedTime;
    }

    public Integer getTasksWaiting() {
        return tasksWaiting;
    }

    public void setTasksWaiting(Integer tasksWaiting) {
        this.tasksWaiting = tasksWaiting;
    }
    
}
