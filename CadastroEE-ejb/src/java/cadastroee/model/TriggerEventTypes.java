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
@Table(name = "trigger_event_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TriggerEventTypes.findAll", query = "SELECT t FROM TriggerEventTypes t"),
    @NamedQuery(name = "TriggerEventTypes.findByType", query = "SELECT t FROM TriggerEventTypes t WHERE t.type = :type"),
    @NamedQuery(name = "TriggerEventTypes.findByTypeName", query = "SELECT t FROM TriggerEventTypes t WHERE t.typeName = :typeName"),
    @NamedQuery(name = "TriggerEventTypes.findByParentType", query = "SELECT t FROM TriggerEventTypes t WHERE t.parentType = :parentType")})
public class TriggerEventTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private int type;
    @Size(max = 64)
    @Column(name = "type_name")
    private String typeName;
    @Column(name = "parent_type")
    private Integer parentType;

    public TriggerEventTypes() {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getParentType() {
        return parentType;
    }

    public void setParentType(Integer parentType) {
        this.parentType = parentType;
    }
    
}
