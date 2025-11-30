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
@Table(name = "dm_fts_semantic_similarity_population")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findAll", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByDatabaseId", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByCatalogId", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.catalogId = :catalogId"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByTableId", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.tableId = :tableId"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByDocumentCount", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.documentCount = :documentCount"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByDocumentProcessedCount", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.documentProcessedCount = :documentProcessedCount"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByCompletionType", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.completionType = :completionType"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByCompletionTypeDescription", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.completionTypeDescription = :completionTypeDescription"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByWorkerCount", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.workerCount = :workerCount"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByStatus", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.status = :status"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByStatusDescription", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.statusDescription = :statusDescription"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByStartTime", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.startTime = :startTime")})
public class DmFtsSemanticSimilarityPopulation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catalog_id")
    private int catalogId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "table_id")
    private int tableId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "document_count")
    private long documentCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "document_processed_count")
    private long documentProcessedCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "completion_type")
    private int completionType;
    @Size(max = 64)
    @Column(name = "completion_type_description")
    private String completionTypeDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "worker_count")
    private int workerCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Size(max = 64)
    @Column(name = "status_description")
    private String statusDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "incremental_timestamp")
    private byte[] incrementalTimestamp;

    public DmFtsSemanticSimilarityPopulation() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public long getDocumentCount() {
        return documentCount;
    }

    public void setDocumentCount(long documentCount) {
        this.documentCount = documentCount;
    }

    public long getDocumentProcessedCount() {
        return documentProcessedCount;
    }

    public void setDocumentProcessedCount(long documentProcessedCount) {
        this.documentProcessedCount = documentProcessedCount;
    }

    public int getCompletionType() {
        return completionType;
    }

    public void setCompletionType(int completionType) {
        this.completionType = completionType;
    }

    public String getCompletionTypeDescription() {
        return completionTypeDescription;
    }

    public void setCompletionTypeDescription(String completionTypeDescription) {
        this.completionTypeDescription = completionTypeDescription;
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public byte[] getIncrementalTimestamp() {
        return incrementalTimestamp;
    }

    public void setIncrementalTimestamp(byte[] incrementalTimestamp) {
        this.incrementalTimestamp = incrementalTimestamp;
    }
    
}
