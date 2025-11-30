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
@Table(name = "TABLE_CONSTRAINTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TableConstraints.findAll", query = "SELECT t FROM TableConstraints t"),
    @NamedQuery(name = "TableConstraints.findByConstraintCatalog", query = "SELECT t FROM TableConstraints t WHERE t.constraintCatalog = :constraintCatalog"),
    @NamedQuery(name = "TableConstraints.findByConstraintSchema", query = "SELECT t FROM TableConstraints t WHERE t.constraintSchema = :constraintSchema"),
    @NamedQuery(name = "TableConstraints.findByConstraintName", query = "SELECT t FROM TableConstraints t WHERE t.constraintName = :constraintName"),
    @NamedQuery(name = "TableConstraints.findByTableCatalog", query = "SELECT t FROM TableConstraints t WHERE t.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "TableConstraints.findByTableSchema", query = "SELECT t FROM TableConstraints t WHERE t.tableSchema = :tableSchema"),
    @NamedQuery(name = "TableConstraints.findByTableName", query = "SELECT t FROM TableConstraints t WHERE t.tableName = :tableName"),
    @NamedQuery(name = "TableConstraints.findByConstraintType", query = "SELECT t FROM TableConstraints t WHERE t.constraintType = :constraintType"),
    @NamedQuery(name = "TableConstraints.findByIsDeferrable", query = "SELECT t FROM TableConstraints t WHERE t.isDeferrable = :isDeferrable"),
    @NamedQuery(name = "TableConstraints.findByInitiallyDeferred", query = "SELECT t FROM TableConstraints t WHERE t.initiallyDeferred = :initiallyDeferred")})
public class TableConstraints implements Serializable {

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
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;
    @Size(max = 128)
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;
    @Size(max = 128)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Size(max = 11)
    @Column(name = "CONSTRAINT_TYPE")
    private String constraintType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "IS_DEFERRABLE")
    private String isDeferrable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "INITIALLY_DEFERRED")
    private String initiallyDeferred;

    public TableConstraints() {
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

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType;
    }

    public String getIsDeferrable() {
        return isDeferrable;
    }

    public void setIsDeferrable(String isDeferrable) {
        this.isDeferrable = isDeferrable;
    }

    public String getInitiallyDeferred() {
        return initiallyDeferred;
    }

    public void setInitiallyDeferred(String initiallyDeferred) {
        this.initiallyDeferred = initiallyDeferred;
    }
    
}
