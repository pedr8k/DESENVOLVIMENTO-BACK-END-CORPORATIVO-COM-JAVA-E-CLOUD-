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
@Table(name = "dm_db_external_language_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbExternalLanguageStats.findAll", query = "SELECT d FROM DmDbExternalLanguageStats d"),
    @NamedQuery(name = "DmDbExternalLanguageStats.findByExternalLanguageId", query = "SELECT d FROM DmDbExternalLanguageStats d WHERE d.externalLanguageId = :externalLanguageId"),
    @NamedQuery(name = "DmDbExternalLanguageStats.findByIsInstalled", query = "SELECT d FROM DmDbExternalLanguageStats d WHERE d.isInstalled = :isInstalled")})
public class DmDbExternalLanguageStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_language_id")
    private int externalLanguageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_installed")
    private boolean isInstalled;

    public DmDbExternalLanguageStats() {
    }

    public int getExternalLanguageId() {
        return externalLanguageId;
    }

    public void setExternalLanguageId(int externalLanguageId) {
        this.externalLanguageId = externalLanguageId;
    }

    public boolean getIsInstalled() {
        return isInstalled;
    }

    public void setIsInstalled(boolean isInstalled) {
        this.isInstalled = isInstalled;
    }
    
}
