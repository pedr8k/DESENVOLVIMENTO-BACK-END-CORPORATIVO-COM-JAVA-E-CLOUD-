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
@Table(name = "COLUMN_DOMAIN_USAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColumnDomainUsage.findAll", query = "SELECT c FROM ColumnDomainUsage c"),
    @NamedQuery(name = "ColumnDomainUsage.findByDomainCatalog", query = "SELECT c FROM ColumnDomainUsage c WHERE c.domainCatalog = :domainCatalog"),
    @NamedQuery(name = "ColumnDomainUsage.findByDomainSchema", query = "SELECT c FROM ColumnDomainUsage c WHERE c.domainSchema = :domainSchema"),
    @NamedQuery(name = "ColumnDomainUsage.findByDomainName", query = "SELECT c FROM ColumnDomainUsage c WHERE c.domainName = :domainName"),
    @NamedQuery(name = "ColumnDomainUsage.findByTableCatalog", query = "SELECT c FROM ColumnDomainUsage c WHERE c.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "ColumnDomainUsage.findByTableSchema", query = "SELECT c FROM ColumnDomainUsage c WHERE c.tableSchema = :tableSchema"),
    @NamedQuery(name = "ColumnDomainUsage.findByTableName", query = "SELECT c FROM ColumnDomainUsage c WHERE c.tableName = :tableName"),
    @NamedQuery(name = "ColumnDomainUsage.findByColumnName", query = "SELECT c FROM ColumnDomainUsage c WHERE c.columnName = :columnName")})
public class ColumnDomainUsage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "DOMAIN_CATALOG")
    private String domainCatalog;
    @Size(max = 128)
    @Column(name = "DOMAIN_SCHEMA")
    private String domainSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "DOMAIN_NAME")
    private String domainName;
    @Size(max = 128)
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;
    @Size(max = 128)
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Size(max = 128)
    @Column(name = "COLUMN_NAME")
    private String columnName;

    public ColumnDomainUsage() {
    }

    public String getDomainCatalog() {
        return domainCatalog;
    }

    public void setDomainCatalog(String domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    public String getDomainSchema() {
        return domainSchema;
    }

    public void setDomainSchema(String domainSchema) {
        this.domainSchema = domainSchema;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
    
}
