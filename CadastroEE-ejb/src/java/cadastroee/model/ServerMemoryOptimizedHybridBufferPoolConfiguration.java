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
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "server_memory_optimized_hybrid_buffer_pool_configuration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerMemoryOptimizedHybridBufferPoolConfiguration.findAll", query = "SELECT s FROM ServerMemoryOptimizedHybridBufferPoolConfiguration s"),
    @NamedQuery(name = "ServerMemoryOptimizedHybridBufferPoolConfiguration.findByIsConfigured", query = "SELECT s FROM ServerMemoryOptimizedHybridBufferPoolConfiguration s WHERE s.isConfigured = :isConfigured"),
    @NamedQuery(name = "ServerMemoryOptimizedHybridBufferPoolConfiguration.findByIsEnabled", query = "SELECT s FROM ServerMemoryOptimizedHybridBufferPoolConfiguration s WHERE s.isEnabled = :isEnabled")})
public class ServerMemoryOptimizedHybridBufferPoolConfiguration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "is_configured")
    private Serializable isConfigured;
    @Column(name = "is_enabled")
    private Serializable isEnabled;

    public ServerMemoryOptimizedHybridBufferPoolConfiguration() {
    }

    public Serializable getIsConfigured() {
        return isConfigured;
    }

    public void setIsConfigured(Serializable isConfigured) {
        this.isConfigured = isConfigured;
    }

    public Serializable getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Serializable isEnabled) {
        this.isEnabled = isEnabled;
    }
    
}
