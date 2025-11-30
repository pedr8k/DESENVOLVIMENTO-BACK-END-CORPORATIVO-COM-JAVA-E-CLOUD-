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
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_os_ring_buffers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsRingBuffers.findAll", query = "SELECT d FROM DmOsRingBuffers d"),
    @NamedQuery(name = "DmOsRingBuffers.findByRingBufferType", query = "SELECT d FROM DmOsRingBuffers d WHERE d.ringBufferType = :ringBufferType"),
    @NamedQuery(name = "DmOsRingBuffers.findByTimestamp", query = "SELECT d FROM DmOsRingBuffers d WHERE d.timestamp = :timestamp"),
    @NamedQuery(name = "DmOsRingBuffers.findByRecord", query = "SELECT d FROM DmOsRingBuffers d WHERE d.record = :record")})
public class DmOsRingBuffers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "ring_buffer_address")
    private byte[] ringBufferAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "ring_buffer_type")
    private String ringBufferType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "timestamp")
    private long timestamp;
    @Size(max = 2147483647)
    @Column(name = "record")
    private String record;

    public DmOsRingBuffers() {
    }

    public byte[] getRingBufferAddress() {
        return ringBufferAddress;
    }

    public void setRingBufferAddress(byte[] ringBufferAddress) {
        this.ringBufferAddress = ringBufferAddress;
    }

    public String getRingBufferType() {
        return ringBufferType;
    }

    public void setRingBufferType(String ringBufferType) {
        this.ringBufferType = ringBufferType;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
    
}
