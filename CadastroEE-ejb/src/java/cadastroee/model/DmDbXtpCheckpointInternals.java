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
import java.math.BigInteger;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_db_xtp_checkpoint_internals")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findAll", query = "SELECT d FROM DmDbXtpCheckpointInternals d"),
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findByCheckpointId", query = "SELECT d FROM DmDbXtpCheckpointInternals d WHERE d.checkpointId = :checkpointId"),
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findByCheckpointTimestamp", query = "SELECT d FROM DmDbXtpCheckpointInternals d WHERE d.checkpointTimestamp = :checkpointTimestamp"),
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findByLastSegmentLsn", query = "SELECT d FROM DmDbXtpCheckpointInternals d WHERE d.lastSegmentLsn = :lastSegmentLsn"),
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findByRecoveryLsn", query = "SELECT d FROM DmDbXtpCheckpointInternals d WHERE d.recoveryLsn = :recoveryLsn"),
    @NamedQuery(name = "DmDbXtpCheckpointInternals.findByIsSynchronized", query = "SELECT d FROM DmDbXtpCheckpointInternals d WHERE d.isSynchronized = :isSynchronized")})
public class DmDbXtpCheckpointInternals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checkpoint_id")
    private long checkpointId;
    @Column(name = "checkpoint_timestamp")
    private BigInteger checkpointTimestamp;
    @Column(name = "last_segment_lsn")
    private BigInteger lastSegmentLsn;
    @Column(name = "recovery_lsn")
    private BigInteger recoveryLsn;
    @Column(name = "is_synchronized")
    private Boolean isSynchronized;

    public DmDbXtpCheckpointInternals() {
    }

    public long getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(long checkpointId) {
        this.checkpointId = checkpointId;
    }

    public BigInteger getCheckpointTimestamp() {
        return checkpointTimestamp;
    }

    public void setCheckpointTimestamp(BigInteger checkpointTimestamp) {
        this.checkpointTimestamp = checkpointTimestamp;
    }

    public BigInteger getLastSegmentLsn() {
        return lastSegmentLsn;
    }

    public void setLastSegmentLsn(BigInteger lastSegmentLsn) {
        this.lastSegmentLsn = lastSegmentLsn;
    }

    public BigInteger getRecoveryLsn() {
        return recoveryLsn;
    }

    public void setRecoveryLsn(BigInteger recoveryLsn) {
        this.recoveryLsn = recoveryLsn;
    }

    public Boolean getIsSynchronized() {
        return isSynchronized;
    }

    public void setIsSynchronized(Boolean isSynchronized) {
        this.isSynchronized = isSynchronized;
    }
    
}
