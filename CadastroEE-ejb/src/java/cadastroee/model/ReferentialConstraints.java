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
@Table(name = "REFERENTIAL_CONSTRAINTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReferentialConstraints.findAll", query = "SELECT r FROM ReferentialConstraints r"),
    @NamedQuery(name = "ReferentialConstraints.findByConstraintCatalog", query = "SELECT r FROM ReferentialConstraints r WHERE r.constraintCatalog = :constraintCatalog"),
    @NamedQuery(name = "ReferentialConstraints.findByConstraintSchema", query = "SELECT r FROM ReferentialConstraints r WHERE r.constraintSchema = :constraintSchema"),
    @NamedQuery(name = "ReferentialConstraints.findByConstraintName", query = "SELECT r FROM ReferentialConstraints r WHERE r.constraintName = :constraintName"),
    @NamedQuery(name = "ReferentialConstraints.findByUniqueConstraintCatalog", query = "SELECT r FROM ReferentialConstraints r WHERE r.uniqueConstraintCatalog = :uniqueConstraintCatalog"),
    @NamedQuery(name = "ReferentialConstraints.findByUniqueConstraintSchema", query = "SELECT r FROM ReferentialConstraints r WHERE r.uniqueConstraintSchema = :uniqueConstraintSchema"),
    @NamedQuery(name = "ReferentialConstraints.findByUniqueConstraintName", query = "SELECT r FROM ReferentialConstraints r WHERE r.uniqueConstraintName = :uniqueConstraintName"),
    @NamedQuery(name = "ReferentialConstraints.findByMatchOption", query = "SELECT r FROM ReferentialConstraints r WHERE r.matchOption = :matchOption"),
    @NamedQuery(name = "ReferentialConstraints.findByUpdateRule", query = "SELECT r FROM ReferentialConstraints r WHERE r.updateRule = :updateRule"),
    @NamedQuery(name = "ReferentialConstraints.findByDeleteRule", query = "SELECT r FROM ReferentialConstraints r WHERE r.deleteRule = :deleteRule")})
public class ReferentialConstraints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;
    @Size(max = 128)
    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;
    @Size(max = 128)
    @Column(name = "UNIQUE_CONSTRAINT_CATALOG")
    private String uniqueConstraintCatalog;
    @Size(max = 128)
    @Column(name = "UNIQUE_CONSTRAINT_SCHEMA")
    private String uniqueConstraintSchema;
    @Size(max = 128)
    @Column(name = "UNIQUE_CONSTRAINT_NAME")
    private String uniqueConstraintName;
    @Size(max = 7)
    @Column(name = "MATCH_OPTION")
    private String matchOption;
    @Size(max = 11)
    @Column(name = "UPDATE_RULE")
    private String updateRule;
    @Size(max = 11)
    @Column(name = "DELETE_RULE")
    private String deleteRule;

    public ReferentialConstraints() {
    }

    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getUniqueConstraintCatalog() {
        return uniqueConstraintCatalog;
    }

    public void setUniqueConstraintCatalog(String uniqueConstraintCatalog) {
        this.uniqueConstraintCatalog = uniqueConstraintCatalog;
    }

    public String getUniqueConstraintSchema() {
        return uniqueConstraintSchema;
    }

    public void setUniqueConstraintSchema(String uniqueConstraintSchema) {
        this.uniqueConstraintSchema = uniqueConstraintSchema;
    }

    public String getUniqueConstraintName() {
        return uniqueConstraintName;
    }

    public void setUniqueConstraintName(String uniqueConstraintName) {
        this.uniqueConstraintName = uniqueConstraintName;
    }

    public String getMatchOption() {
        return matchOption;
    }

    public void setMatchOption(String matchOption) {
        this.matchOption = matchOption;
    }

    public String getUpdateRule() {
        return updateRule;
    }

    public void setUpdateRule(String updateRule) {
        this.updateRule = updateRule;
    }

    public String getDeleteRule() {
        return deleteRule;
    }

    public void setDeleteRule(String deleteRule) {
        this.deleteRule = deleteRule;
    }
    
}
