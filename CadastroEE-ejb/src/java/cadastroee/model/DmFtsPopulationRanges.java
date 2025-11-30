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
import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_fts_population_ranges")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmFtsPopulationRanges.findAll", query = "SELECT d FROM DmFtsPopulationRanges d"),
    @NamedQuery(name = "DmFtsPopulationRanges.findByIsRetry", query = "SELECT d FROM DmFtsPopulationRanges d WHERE d.isRetry = :isRetry"),
    @NamedQuery(name = "DmFtsPopulationRanges.findBySessionId", query = "SELECT d FROM DmFtsPopulationRanges d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmFtsPopulationRanges.findByProcessedRowCount", query = "SELECT d FROM DmFtsPopulationRanges d WHERE d.processedRowCount = :processedRowCount"),
    @NamedQuery(name = "DmFtsPopulationRanges.findByErrorCount", query = "SELECT d FROM DmFtsPopulationRanges d WHERE d.errorCount = :errorCount")})
public class DmFtsPopulationRanges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_address")
    private byte[] memoryAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "parent_memory_address")
    private byte[] parentMemoryAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_retry")
    private boolean isRetry;
    @Basic(optional = false)
    @NotNull
    @Column(name = "session_id")
    private short sessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "processed_row_count")
    private int processedRowCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "error_count")
    private int errorCount;

    public DmFtsPopulationRanges() {
    }

    public byte[] getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(byte[] memoryAddress) {
        this.memoryAddress = memoryAddress;
    }

    public byte[] getParentMemoryAddress() {
        return parentMemoryAddress;
    }

    public void setParentMemoryAddress(byte[] parentMemoryAddress) {
        this.parentMemoryAddress = parentMemoryAddress;
    }

    public boolean getIsRetry() {
        return isRetry;
    }

    public void setIsRetry(boolean isRetry) {
        this.isRetry = isRetry;
    }

    public short getSessionId() {
        return sessionId;
    }

    public void setSessionId(short sessionId) {
        this.sessionId = sessionId;
    }

    public int getProcessedRowCount() {
        return processedRowCount;
    }

    public void setProcessedRowCount(int processedRowCount) {
        this.processedRowCount = processedRowCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }
    
}
