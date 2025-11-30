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
@Table(name = "conversation_groups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConversationGroups.findAll", query = "SELECT c FROM ConversationGroups c"),
    @NamedQuery(name = "ConversationGroups.findByConversationGroupId", query = "SELECT c FROM ConversationGroups c WHERE c.conversationGroupId = :conversationGroupId"),
    @NamedQuery(name = "ConversationGroups.findByServiceId", query = "SELECT c FROM ConversationGroups c WHERE c.serviceId = :serviceId"),
    @NamedQuery(name = "ConversationGroups.findByIsSystem", query = "SELECT c FROM ConversationGroups c WHERE c.isSystem = :isSystem")})
public class ConversationGroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "conversation_group_id")
    private String conversationGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_id")
    private int serviceId;
    @Column(name = "is_system")
    private Boolean isSystem;

    public ConversationGroups() {
    }

    public String getConversationGroupId() {
        return conversationGroupId;
    }

    public void setConversationGroupId(String conversationGroupId) {
        this.conversationGroupId = conversationGroupId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }
    
}
