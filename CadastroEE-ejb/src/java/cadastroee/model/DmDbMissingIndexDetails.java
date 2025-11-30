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
@Table(name = "dm_db_missing_index_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbMissingIndexDetails.findAll", query = "SELECT d FROM DmDbMissingIndexDetails d"),
    @NamedQuery(name = "DmDbMissingIndexDetails.findByIndexHandle", query = "SELECT d FROM DmDbMissingIndexDetails d WHERE d.indexHandle = :indexHandle"),
    @NamedQuery(name = "DmDbMissingIndexDetails.findByDatabaseId", query = "SELECT d FROM DmDbMissingIndexDetails d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmDbMissingIndexDetails.findByObjectId", query = "SELECT d FROM DmDbMissingIndexDetails d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbMissingIndexDetails.findByEqualityColumns", query = "SELECT d FROM DmDbMissingIndexDetails d WHERE d.equalityColumns = :equalityColumns"),
    @NamedQuery(name = "DmDbMissingIndexDetails.findByInequalityColumns", query = "SELECT d FROM DmDbMissingIndexDetails d WHERE d.inequalityColumns = :inequalityColumns"),
    @NamedQuery(name = "DmDbMissingIndexDetails.findByIncludedColumns", query = "SELECT d FROM DmDbMissingIndexDetails d WHERE d.includedColumns = :includedColumns"),
    @NamedQuery(name = "DmDbMissingIndexDetails.findByStatement", query = "SELECT d FROM DmDbMissingIndexDetails d WHERE d.statement = :statement")})
public class DmDbMissingIndexDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_handle")
    private int indexHandle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private short databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 4000)
    @Column(name = "equality_columns")
    private String equalityColumns;
    @Size(max = 4000)
    @Column(name = "inequality_columns")
    private String inequalityColumns;
    @Size(max = 4000)
    @Column(name = "included_columns")
    private String includedColumns;
    @Size(max = 4000)
    @Column(name = "statement")
    private String statement;

    public DmDbMissingIndexDetails() {
    }

    public int getIndexHandle() {
        return indexHandle;
    }

    public void setIndexHandle(int indexHandle) {
        this.indexHandle = indexHandle;
    }

    public short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(short databaseId) {
        this.databaseId = databaseId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getEqualityColumns() {
        return equalityColumns;
    }

    public void setEqualityColumns(String equalityColumns) {
        this.equalityColumns = equalityColumns;
    }

    public String getInequalityColumns() {
        return inequalityColumns;
    }

    public void setInequalityColumns(String inequalityColumns) {
        this.inequalityColumns = inequalityColumns;
    }

    public String getIncludedColumns() {
        return includedColumns;
    }

    public void setIncludedColumns(String includedColumns) {
        this.includedColumns = includedColumns;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
    
}
