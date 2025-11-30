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
@Table(name = "dm_os_windows_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsWindowsInfo.findAll", query = "SELECT d FROM DmOsWindowsInfo d"),
    @NamedQuery(name = "DmOsWindowsInfo.findByWindowsRelease", query = "SELECT d FROM DmOsWindowsInfo d WHERE d.windowsRelease = :windowsRelease"),
    @NamedQuery(name = "DmOsWindowsInfo.findByWindowsServicePackLevel", query = "SELECT d FROM DmOsWindowsInfo d WHERE d.windowsServicePackLevel = :windowsServicePackLevel"),
    @NamedQuery(name = "DmOsWindowsInfo.findByWindowsSku", query = "SELECT d FROM DmOsWindowsInfo d WHERE d.windowsSku = :windowsSku"),
    @NamedQuery(name = "DmOsWindowsInfo.findByOsLanguageVersion", query = "SELECT d FROM DmOsWindowsInfo d WHERE d.osLanguageVersion = :osLanguageVersion")})
public class DmOsWindowsInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "windows_release")
    private String windowsRelease;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "windows_service_pack_level")
    private String windowsServicePackLevel;
    @Column(name = "windows_sku")
    private Integer windowsSku;
    @Basic(optional = false)
    @NotNull
    @Column(name = "os_language_version")
    private int osLanguageVersion;

    public DmOsWindowsInfo() {
    }

    public String getWindowsRelease() {
        return windowsRelease;
    }

    public void setWindowsRelease(String windowsRelease) {
        this.windowsRelease = windowsRelease;
    }

    public String getWindowsServicePackLevel() {
        return windowsServicePackLevel;
    }

    public void setWindowsServicePackLevel(String windowsServicePackLevel) {
        this.windowsServicePackLevel = windowsServicePackLevel;
    }

    public Integer getWindowsSku() {
        return windowsSku;
    }

    public void setWindowsSku(Integer windowsSku) {
        this.windowsSku = windowsSku;
    }

    public int getOsLanguageVersion() {
        return osLanguageVersion;
    }

    public void setOsLanguageVersion(int osLanguageVersion) {
        this.osLanguageVersion = osLanguageVersion;
    }
    
}
