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
@Table(name = "dm_os_server_diagnostics_log_configurations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsServerDiagnosticsLogConfigurations.findAll", query = "SELECT d FROM DmOsServerDiagnosticsLogConfigurations d"),
    @NamedQuery(name = "DmOsServerDiagnosticsLogConfigurations.findByIsEnabled", query = "SELECT d FROM DmOsServerDiagnosticsLogConfigurations d WHERE d.isEnabled = :isEnabled"),
    @NamedQuery(name = "DmOsServerDiagnosticsLogConfigurations.findByPath", query = "SELECT d FROM DmOsServerDiagnosticsLogConfigurations d WHERE d.path = :path"),
    @NamedQuery(name = "DmOsServerDiagnosticsLogConfigurations.findByMaxSize", query = "SELECT d FROM DmOsServerDiagnosticsLogConfigurations d WHERE d.maxSize = :maxSize"),
    @NamedQuery(name = "DmOsServerDiagnosticsLogConfigurations.findByMaxFiles", query = "SELECT d FROM DmOsServerDiagnosticsLogConfigurations d WHERE d.maxFiles = :maxFiles")})
public class DmOsServerDiagnosticsLogConfigurations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "is_enabled")
    private Integer isEnabled;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "path")
    private String path;
    @Column(name = "max_size")
    private Integer maxSize;
    @Column(name = "max_files")
    private Integer maxFiles;

    public DmOsServerDiagnosticsLogConfigurations() {
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Integer getMaxFiles() {
        return maxFiles;
    }

    public void setMaxFiles(Integer maxFiles) {
        this.maxFiles = maxFiles;
    }
    
}
