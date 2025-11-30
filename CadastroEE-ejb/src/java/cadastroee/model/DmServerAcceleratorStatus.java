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
@Table(name = "dm_server_accelerator_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerAcceleratorStatus.findAll", query = "SELECT d FROM DmServerAcceleratorStatus d"),
    @NamedQuery(name = "DmServerAcceleratorStatus.findByAccelerator", query = "SELECT d FROM DmServerAcceleratorStatus d WHERE d.accelerator = :accelerator"),
    @NamedQuery(name = "DmServerAcceleratorStatus.findByAcceleratorDesc", query = "SELECT d FROM DmServerAcceleratorStatus d WHERE d.acceleratorDesc = :acceleratorDesc"),
    @NamedQuery(name = "DmServerAcceleratorStatus.findByConfig", query = "SELECT d FROM DmServerAcceleratorStatus d WHERE d.config = :config"),
    @NamedQuery(name = "DmServerAcceleratorStatus.findByConfigInUse", query = "SELECT d FROM DmServerAcceleratorStatus d WHERE d.configInUse = :configInUse"),
    @NamedQuery(name = "DmServerAcceleratorStatus.findByMode", query = "SELECT d FROM DmServerAcceleratorStatus d WHERE d.mode = :mode"),
    @NamedQuery(name = "DmServerAcceleratorStatus.findByModeDesc", query = "SELECT d FROM DmServerAcceleratorStatus d WHERE d.modeDesc = :modeDesc"),
    @NamedQuery(name = "DmServerAcceleratorStatus.findByModeReason", query = "SELECT d FROM DmServerAcceleratorStatus d WHERE d.modeReason = :modeReason"),
    @NamedQuery(name = "DmServerAcceleratorStatus.findByModeReasonDesc", query = "SELECT d FROM DmServerAcceleratorStatus d WHERE d.modeReasonDesc = :modeReasonDesc"),
    @NamedQuery(name = "DmServerAcceleratorStatus.findByAcceleratorHardwareDetected", query = "SELECT d FROM DmServerAcceleratorStatus d WHERE d.acceleratorHardwareDetected = :acceleratorHardwareDetected"),
    @NamedQuery(name = "DmServerAcceleratorStatus.findByAcceleratorLibraryVersion", query = "SELECT d FROM DmServerAcceleratorStatus d WHERE d.acceleratorLibraryVersion = :acceleratorLibraryVersion"),
    @NamedQuery(name = "DmServerAcceleratorStatus.findByAcceleratorDriverVersion", query = "SELECT d FROM DmServerAcceleratorStatus d WHERE d.acceleratorDriverVersion = :acceleratorDriverVersion")})
public class DmServerAcceleratorStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "accelerator")
    private String accelerator;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "accelerator_desc")
    private String acceleratorDesc;
    @Column(name = "config")
    private Short config;
    @Column(name = "config_in_use")
    private Short configInUse;
    @Column(name = "mode")
    private Short mode;
    @Size(max = 60)
    @Column(name = "mode_desc")
    private String modeDesc;
    @Column(name = "mode_reason")
    private Short modeReason;
    @Size(max = 60)
    @Column(name = "mode_reason_desc")
    private String modeReasonDesc;
    @Column(name = "accelerator_hardware_detected")
    private Short acceleratorHardwareDetected;
    @Size(max = 256)
    @Column(name = "accelerator_library_version")
    private String acceleratorLibraryVersion;
    @Size(max = 256)
    @Column(name = "accelerator_driver_version")
    private String acceleratorDriverVersion;

    public DmServerAcceleratorStatus() {
    }

    public String getAccelerator() {
        return accelerator;
    }

    public void setAccelerator(String accelerator) {
        this.accelerator = accelerator;
    }

    public String getAcceleratorDesc() {
        return acceleratorDesc;
    }

    public void setAcceleratorDesc(String acceleratorDesc) {
        this.acceleratorDesc = acceleratorDesc;
    }

    public Short getConfig() {
        return config;
    }

    public void setConfig(Short config) {
        this.config = config;
    }

    public Short getConfigInUse() {
        return configInUse;
    }

    public void setConfigInUse(Short configInUse) {
        this.configInUse = configInUse;
    }

    public Short getMode() {
        return mode;
    }

    public void setMode(Short mode) {
        this.mode = mode;
    }

    public String getModeDesc() {
        return modeDesc;
    }

    public void setModeDesc(String modeDesc) {
        this.modeDesc = modeDesc;
    }

    public Short getModeReason() {
        return modeReason;
    }

    public void setModeReason(Short modeReason) {
        this.modeReason = modeReason;
    }

    public String getModeReasonDesc() {
        return modeReasonDesc;
    }

    public void setModeReasonDesc(String modeReasonDesc) {
        this.modeReasonDesc = modeReasonDesc;
    }

    public Short getAcceleratorHardwareDetected() {
        return acceleratorHardwareDetected;
    }

    public void setAcceleratorHardwareDetected(Short acceleratorHardwareDetected) {
        this.acceleratorHardwareDetected = acceleratorHardwareDetected;
    }

    public String getAcceleratorLibraryVersion() {
        return acceleratorLibraryVersion;
    }

    public void setAcceleratorLibraryVersion(String acceleratorLibraryVersion) {
        this.acceleratorLibraryVersion = acceleratorLibraryVersion;
    }

    public String getAcceleratorDriverVersion() {
        return acceleratorDriverVersion;
    }

    public void setAcceleratorDriverVersion(String acceleratorDriverVersion) {
        this.acceleratorDriverVersion = acceleratorDriverVersion;
    }
    
}
