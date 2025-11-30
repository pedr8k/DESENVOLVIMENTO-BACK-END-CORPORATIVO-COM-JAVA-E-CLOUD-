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
@Table(name = "external_libraries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalLibraries.findAll", query = "SELECT e FROM ExternalLibraries e"),
    @NamedQuery(name = "ExternalLibraries.findByExternalLibraryId", query = "SELECT e FROM ExternalLibraries e WHERE e.externalLibraryId = :externalLibraryId"),
    @NamedQuery(name = "ExternalLibraries.findByName", query = "SELECT e FROM ExternalLibraries e WHERE e.name = :name"),
    @NamedQuery(name = "ExternalLibraries.findByPrincipalId", query = "SELECT e FROM ExternalLibraries e WHERE e.principalId = :principalId"),
    @NamedQuery(name = "ExternalLibraries.findByLanguage", query = "SELECT e FROM ExternalLibraries e WHERE e.language = :language"),
    @NamedQuery(name = "ExternalLibraries.findByScope", query = "SELECT e FROM ExternalLibraries e WHERE e.scope = :scope"),
    @NamedQuery(name = "ExternalLibraries.findByScopeDesc", query = "SELECT e FROM ExternalLibraries e WHERE e.scopeDesc = :scopeDesc")})
public class ExternalLibraries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_library_id")
    private int externalLibraryId;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "principal_id")
    private Integer principalId;
    @Size(max = 128)
    @Column(name = "language")
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "scope")
    private int scope;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "scope_desc")
    private String scopeDesc;

    public ExternalLibraries() {
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

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public String getScopeDesc() {
        return scopeDesc;
    }

    public void setScopeDesc(String scopeDesc) {
        this.scopeDesc = scopeDesc;
    }
    
}
