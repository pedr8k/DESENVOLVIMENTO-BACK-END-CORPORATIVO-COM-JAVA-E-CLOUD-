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
@Table(name = "dm_os_memory_allocations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryAllocations.findAll", query = "SELECT d FROM DmOsMemoryAllocations d"),
    @NamedQuery(name = "DmOsMemoryAllocations.findBySizeInBytes", query = "SELECT d FROM DmOsMemoryAllocations d WHERE d.sizeInBytes = :sizeInBytes"),
    @NamedQuery(name = "DmOsMemoryAllocations.findByCreationTime", query = "SELECT d FROM DmOsMemoryAllocations d WHERE d.creationTime = :creationTime"),
    @NamedQuery(name = "DmOsMemoryAllocations.findByMemoryNodeId", query = "SELECT d FROM DmOsMemoryAllocations d WHERE d.memoryNodeId = :memoryNodeId"),
    @NamedQuery(name = "DmOsMemoryAllocations.findBySourceFile", query = "SELECT d FROM DmOsMemoryAllocations d WHERE d.sourceFile = :sourceFile"),
    @NamedQuery(name = "DmOsMemoryAllocations.findByLineNum", query = "SELECT d FROM DmOsMemoryAllocations d WHERE d.lineNum = :lineNum"),
    @NamedQuery(name = "DmOsMemoryAllocations.findBySequenceNum", query = "SELECT d FROM DmOsMemoryAllocations d WHERE d.sequenceNum = :sequenceNum"),
    @NamedQuery(name = "DmOsMemoryAllocations.findByTag", query = "SELECT d FROM DmOsMemoryAllocations d WHERE d.tag = :tag")})
public class DmOsMemoryAllocations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_allocation_address")
    private byte[] memoryAllocationAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "size_in_bytes")
    private long sizeInBytes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationTime;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "memory_object_address")
    private byte[] memoryObjectAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "memory_node_id")
    private short memoryNodeId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "allocator_stack_address")
    private byte[] allocatorStackAddress;
    @Size(max = 256)
    @Column(name = "source_file")
    private String sourceFile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "line_num")
    private int lineNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sequence_num")
    private int sequenceNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tag")
    private int tag;

    public DmOsMemoryAllocations() {
    }

    public byte[] getMemoryAllocationAddress() {
        return memoryAllocationAddress;
    }

    public void setMemoryAllocationAddress(byte[] memoryAllocationAddress) {
        this.memoryAllocationAddress = memoryAllocationAddress;
    }

    public long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public short getMemoryNodeId() {
        return memoryNodeId;
    }

    public void setMemoryNodeId(short memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
    }

    public byte[] getAllocatorStackAddress() {
        return allocatorStackAddress;
    }

    public void setAllocatorStackAddress(byte[] allocatorStackAddress) {
        this.allocatorStackAddress = allocatorStackAddress;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public int getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(int sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
    
}
