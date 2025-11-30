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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "external_languages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalLanguages.findAll", query = "SELECT e FROM ExternalLanguages e"),
    @NamedQuery(name = "ExternalLanguages.findByExternalLanguageId", query = "SELECT e FROM ExternalLanguages e WHERE e.externalLanguageId = :externalLanguageId"),
    @NamedQuery(name = "ExternalLanguages.findByLanguage", query = "SELECT e FROM ExternalLanguages e WHERE e.language = :language"),
    @NamedQuery(name = "ExternalLanguages.findByCreateDate", query = "SELECT e FROM ExternalLanguages e WHERE e.createDate = :createDate"),
    @NamedQuery(name = "ExternalLanguages.findByPrincipalId", query = "SELECT e FROM ExternalLanguages e WHERE e.principalId = :principalId")})
public class ExternalLanguages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "external_language_id")
    private int externalLanguageId;
    @Size(max = 128)
    @Column(name = "language")
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "principal_id")
    private Integer principalId;

    public ExternalLanguages() {
    }

    public int getExternalLanguageId() {
        return externalLanguageId;
    }

    public void setExternalLanguageId(int externalLanguageId) {
        this.externalLanguageId = externalLanguageId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }
    
}
