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
@Table(name = "fulltext_system_stopwords")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FulltextSystemStopwords.findAll", query = "SELECT f FROM FulltextSystemStopwords f"),
    @NamedQuery(name = "FulltextSystemStopwords.findByStopword", query = "SELECT f FROM FulltextSystemStopwords f WHERE f.stopword = :stopword"),
    @NamedQuery(name = "FulltextSystemStopwords.findByLanguageId", query = "SELECT f FROM FulltextSystemStopwords f WHERE f.languageId = :languageId")})
public class FulltextSystemStopwords implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 64)
    @Column(name = "stopword")
    private String stopword;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;

    public FulltextSystemStopwords() {
    }

    public String getStopword() {
        return stopword;
    }

    public void setStopword(String stopword) {
        this.stopword = stopword;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
    
}
