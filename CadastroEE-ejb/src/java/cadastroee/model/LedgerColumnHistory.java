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
@Table(name = "ledger_column_history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LedgerColumnHistory.findAll", query = "SELECT l FROM LedgerColumnHistory l"),
    @NamedQuery(name = "LedgerColumnHistory.findByObjectId", query = "SELECT l FROM LedgerColumnHistory l WHERE l.objectId = :objectId"),
    @NamedQuery(name = "LedgerColumnHistory.findByColumnId", query = "SELECT l FROM LedgerColumnHistory l WHERE l.columnId = :columnId"),
    @NamedQuery(name = "LedgerColumnHistory.findByColumnName", query = "SELECT l FROM LedgerColumnHistory l WHERE l.columnName = :columnName"),
    @NamedQuery(name = "LedgerColumnHistory.findByOperationType", query = "SELECT l FROM LedgerColumnHistory l WHERE l.operationType = :operationType"),
    @NamedQuery(name = "LedgerColumnHistory.findByOperationTypeDesc", query = "SELECT l FROM LedgerColumnHistory l WHERE l.operationTypeDesc = :operationTypeDesc"),
    @NamedQuery(name = "LedgerColumnHistory.findByTransactionId", query = "SELECT l FROM LedgerColumnHistory l WHERE l.transactionId = :transactionId"),
    @NamedQuery(name = "LedgerColumnHistory.findBySequenceNumber", query = "SELECT l FROM LedgerColumnHistory l WHERE l.sequenceNumber = :sequenceNumber")})
public class LedgerColumnHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "column_name")
    private String columnName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "operation_type")
    private int operationType;
    @Size(max = 60)
    @Column(name = "operation_type_desc")
    private String operationTypeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_id")
    private long transactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sequence_number")
    private long sequenceNumber;

    public LedgerColumnHistory() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    public String getOperationTypeDesc() {
        return operationTypeDesc;
    }

    public void setOperationTypeDesc(String operationTypeDesc) {
        this.operationTypeDesc = operationTypeDesc;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    
}
