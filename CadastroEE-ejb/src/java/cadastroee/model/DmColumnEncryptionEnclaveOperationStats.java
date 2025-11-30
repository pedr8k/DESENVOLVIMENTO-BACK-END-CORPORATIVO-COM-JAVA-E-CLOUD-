/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_column_encryption_enclave_operation_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmColumnEncryptionEnclaveOperationStats.findAll", query = "SELECT d FROM DmColumnEncryptionEnclaveOperationStats d"),
    @NamedQuery(name = "DmColumnEncryptionEnclaveOperationStats.findByOperationType", query = "SELECT d FROM DmColumnEncryptionEnclaveOperationStats d WHERE d.operationType = :operationType"),
    @NamedQuery(name = "DmColumnEncryptionEnclaveOperationStats.findByTotalOperationCount", query = "SELECT d FROM DmColumnEncryptionEnclaveOperationStats d WHERE d.totalOperationCount = :totalOperationCount")})
public class DmColumnEncryptionEnclaveOperationStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "operation_type")
    private String operationType;
    @Column(name = "total_operation_count")
    private BigInteger totalOperationCount;

    public DmColumnEncryptionEnclaveOperationStats() {
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public BigInteger getTotalOperationCount() {
        return totalOperationCount;
    }

    public void setTotalOperationCount(BigInteger totalOperationCount) {
        this.totalOperationCount = totalOperationCount;
    }
    
}
