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
import java.math.BigInteger;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_os_latch_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsLatchStats.findAll", query = "SELECT d FROM DmOsLatchStats d"),
    @NamedQuery(name = "DmOsLatchStats.findByLatchClass", query = "SELECT d FROM DmOsLatchStats d WHERE d.latchClass = :latchClass"),
    @NamedQuery(name = "DmOsLatchStats.findByWaitingRequestsCount", query = "SELECT d FROM DmOsLatchStats d WHERE d.waitingRequestsCount = :waitingRequestsCount"),
    @NamedQuery(name = "DmOsLatchStats.findByWaitTimeMs", query = "SELECT d FROM DmOsLatchStats d WHERE d.waitTimeMs = :waitTimeMs"),
    @NamedQuery(name = "DmOsLatchStats.findByMaxWaitTimeMs", query = "SELECT d FROM DmOsLatchStats d WHERE d.maxWaitTimeMs = :maxWaitTimeMs")})
public class DmOsLatchStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "latch_class")
    private String latchClass;
    @Column(name = "waiting_requests_count")
    private BigInteger waitingRequestsCount;
    @Column(name = "wait_time_ms")
    private BigInteger waitTimeMs;
    @Column(name = "max_wait_time_ms")
    private BigInteger maxWaitTimeMs;

    public DmOsLatchStats() {
    }

    public String getLatchClass() {
        return latchClass;
    }

    public void setLatchClass(String latchClass) {
        this.latchClass = latchClass;
    }

    public BigInteger getWaitingRequestsCount() {
        return waitingRequestsCount;
    }

    public void setWaitingRequestsCount(BigInteger waitingRequestsCount) {
        this.waitingRequestsCount = waitingRequestsCount;
    }

    public BigInteger getWaitTimeMs() {
        return waitTimeMs;
    }

    public void setWaitTimeMs(BigInteger waitTimeMs) {
        this.waitTimeMs = waitTimeMs;
    }

    public BigInteger getMaxWaitTimeMs() {
        return maxWaitTimeMs;
    }

    public void setMaxWaitTimeMs(BigInteger maxWaitTimeMs) {
        this.maxWaitTimeMs = maxWaitTimeMs;
    }
    
}
