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
@Table(name = "dm_os_host_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsHostInfo.findAll", query = "SELECT d FROM DmOsHostInfo d"),
    @NamedQuery(name = "DmOsHostInfo.findByHostPlatform", query = "SELECT d FROM DmOsHostInfo d WHERE d.hostPlatform = :hostPlatform"),
    @NamedQuery(name = "DmOsHostInfo.findByHostDistribution", query = "SELECT d FROM DmOsHostInfo d WHERE d.hostDistribution = :hostDistribution"),
    @NamedQuery(name = "DmOsHostInfo.findByHostRelease", query = "SELECT d FROM DmOsHostInfo d WHERE d.hostRelease = :hostRelease"),
    @NamedQuery(name = "DmOsHostInfo.findByHostServicePackLevel", query = "SELECT d FROM DmOsHostInfo d WHERE d.hostServicePackLevel = :hostServicePackLevel"),
    @NamedQuery(name = "DmOsHostInfo.findByHostSku", query = "SELECT d FROM DmOsHostInfo d WHERE d.hostSku = :hostSku"),
    @NamedQuery(name = "DmOsHostInfo.findByOsLanguageVersion", query = "SELECT d FROM DmOsHostInfo d WHERE d.osLanguageVersion = :osLanguageVersion"),
    @NamedQuery(name = "DmOsHostInfo.findByHostArchitecture", query = "SELECT d FROM DmOsHostInfo d WHERE d.hostArchitecture = :hostArchitecture")})
public class DmOsHostInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "host_platform")
    private String hostPlatform;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "host_distribution")
    private String hostDistribution;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "host_release")
    private String hostRelease;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "host_service_pack_level")
    private String hostServicePackLevel;
    @Column(name = "host_sku")
    private Integer hostSku;
    @Basic(optional = false)
    @NotNull
    @Column(name = "os_language_version")
    private int osLanguageVersion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "host_architecture")
    private String hostArchitecture;

    public DmOsHostInfo() {
    }

    public String getHostPlatform() {
        return hostPlatform;
    }

    public void setHostPlatform(String hostPlatform) {
        this.hostPlatform = hostPlatform;
    }

    public String getHostDistribution() {
        return hostDistribution;
    }

    public void setHostDistribution(String hostDistribution) {
        this.hostDistribution = hostDistribution;
    }

    public String getHostRelease() {
        return hostRelease;
    }

    public void setHostRelease(String hostRelease) {
        this.hostRelease = hostRelease;
    }

    public String getHostServicePackLevel() {
        return hostServicePackLevel;
    }

    public void setHostServicePackLevel(String hostServicePackLevel) {
        this.hostServicePackLevel = hostServicePackLevel;
    }

    public Integer getHostSku() {
        return hostSku;
    }

    public void setHostSku(Integer hostSku) {
        this.hostSku = hostSku;
    }

    public int getOsLanguageVersion() {
        return osLanguageVersion;
    }

    public void setOsLanguageVersion(int osLanguageVersion) {
        this.osLanguageVersion = osLanguageVersion;
    }

    public String getHostArchitecture() {
        return hostArchitecture;
    }

    public void setHostArchitecture(String hostArchitecture) {
        this.hostArchitecture = hostArchitecture;
    }
    
}
