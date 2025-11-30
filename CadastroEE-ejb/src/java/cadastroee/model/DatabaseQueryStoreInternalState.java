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

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "database_query_store_internal_state")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseQueryStoreInternalState.findAll", query = "SELECT d FROM DatabaseQueryStoreInternalState d"),
    @NamedQuery(name = "DatabaseQueryStoreInternalState.findByPendingMessageCount", query = "SELECT d FROM DatabaseQueryStoreInternalState d WHERE d.pendingMessageCount = :pendingMessageCount"),
    @NamedQuery(name = "DatabaseQueryStoreInternalState.findByMessagingMemoryUsedMb", query = "SELECT d FROM DatabaseQueryStoreInternalState d WHERE d.messagingMemoryUsedMb = :messagingMemoryUsedMb")})
public class DatabaseQueryStoreInternalState implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pending_message_count")
    private long pendingMessageCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "messaging_memory_used_mb")
    private long messagingMemoryUsedMb;

    public DatabaseQueryStoreInternalState() {
    }

    public long getPendingMessageCount() {
        return pendingMessageCount;
    }

    public void setPendingMessageCount(long pendingMessageCount) {
        this.pendingMessageCount = pendingMessageCount;
    }

    public long getMessagingMemoryUsedMb() {
        return messagingMemoryUsedMb;
    }

    public void setMessagingMemoryUsedMb(long messagingMemoryUsedMb) {
        this.messagingMemoryUsedMb = messagingMemoryUsedMb;
    }
    
}
