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
@Table(name = "fulltext_semantic_language_statistics_database")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextSemanticLanguageStatisticsDatabase.findAll", query = "SELECT f FROM FulltextSemanticLanguageStatisticsDatabase f"),
    @NamedQuery(name = "FulltextSemanticLanguageStatisticsDatabase.findByDatabaseId", query = "SELECT f FROM FulltextSemanticLanguageStatisticsDatabase f WHERE f.databaseId = :databaseId"),
    @NamedQuery(name = "FulltextSemanticLanguageStatisticsDatabase.findByRegisterDate", query = "SELECT f FROM FulltextSemanticLanguageStatisticsDatabase f WHERE f.registerDate = :registerDate"),
    @NamedQuery(name = "FulltextSemanticLanguageStatisticsDatabase.findByRegisteredBy", query = "SELECT f FROM FulltextSemanticLanguageStatisticsDatabase f WHERE f.registeredBy = :registeredBy"),
    @NamedQuery(name = "FulltextSemanticLanguageStatisticsDatabase.findByVersion", query = "SELECT f FROM FulltextSemanticLanguageStatisticsDatabase f WHERE f.version = :version")})
public class FulltextSemanticLanguageStatisticsDatabase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "register_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "registered_by")
    private int registeredBy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "version")
    private String version;

    public FulltextSemanticLanguageStatisticsDatabase() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public int getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(int registeredBy) {
        this.registeredBy = registeredBy;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
}
