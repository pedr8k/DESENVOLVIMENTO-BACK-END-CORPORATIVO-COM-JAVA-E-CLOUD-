/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
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
@Table(name = "external_libraries_installed")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalLibrariesInstalled.findAll", query = "SELECT e FROM ExternalLibrariesInstalled e"),
    @NamedQuery(name = "ExternalLibrariesInstalled.findByDbId", query = "SELECT e FROM ExternalLibrariesInstalled e WHERE e.dbId = :dbId"),
    @NamedQuery(name = "ExternalLibrariesInstalled.findByPrincipalId", query = "SELECT e FROM ExternalLibrariesInstalled e WHERE e.principalId = :principalId"),
    @NamedQuery(name = "ExternalLibrariesInstalled.findByLanguageId", query = "SELECT e FROM ExternalLibrariesInstalled e WHERE e.languageId = :languageId"),
    @NamedQuery(name = "ExternalLibrariesInstalled.findByExternalLibraryId", query = "SELECT e FROM ExternalLibrariesInstalled e WHERE e.externalLibraryId = :externalLibraryId"),
    @NamedQuery(name = "ExternalLibrariesInstalled.findByName", query = "SELECT e FROM ExternalLibrariesInstalled e WHERE e.name = :name")})
public class ExternalLibrariesInstalled implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "db_id")
    private int dbId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "principal_id")
    private int principalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_library_id")
    private int externalLibraryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "mdversion")
    private byte[] mdversion;

    public ExternalLibrariesInstalled() {
    }

    public int getDbId() {
        return dbId;
    }

    public void setDbId(int dbId) {
        this.dbId = dbId;
    }

    public int getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(int principalId) {
        this.principalId = principalId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getExternalLibraryId() {
        return externalLibraryId;
    }

    public void setExternalLibraryId(int externalLibraryId) {
        this.externalLibraryId = externalLibraryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getMdversion() {
        return mdversion;
    }

    public void setMdversion(byte[] mdversion) {
        this.mdversion = mdversion;
    }
    
}
