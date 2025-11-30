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
@Table(name = "dm_db_mirroring_past_actions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbMirroringPastActions.findAll", query = "SELECT d FROM DmDbMirroringPastActions d"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByMirroringGuid", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.mirroringGuid = :mirroringGuid"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByStateMachineName", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.stateMachineName = :stateMachineName"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByActionType", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.actionType = :actionType"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByName", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.name = :name"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByCurrentState", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.currentState = :currentState"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByActionSequence", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.actionSequence = :actionSequence")})
public class DmDbMirroringPastActions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 36)
    @Column(name = "mirroring_guid")
    private String mirroringGuid;
    @Size(max = 60)
    @Column(name = "state_machine_name")
    private String stateMachineName;
    @Size(max = 60)
    @Column(name = "action_type")
    private String actionType;
    @Size(max = 60)
    @Column(name = "name")
    private String name;
    @Size(max = 60)
    @Column(name = "current_state")
    private String currentState;
    @Basic(optional = false)
    @NotNull
    @Column(name = "action_sequence")
    private int actionSequence;

    public DmDbMirroringPastActions() {
    }

    public String getMirroringGuid() {
        return mirroringGuid;
    }

    public void setMirroringGuid(String mirroringGuid) {
        this.mirroringGuid = mirroringGuid;
    }

    public String getStateMachineName() {
        return stateMachineName;
    }

    public void setStateMachineName(String stateMachineName) {
        this.stateMachineName = stateMachineName;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public int getActionSequence() {
        return actionSequence;
    }

    public void setActionSequence(int actionSequence) {
        this.actionSequence = actionSequence;
    }
    
}
