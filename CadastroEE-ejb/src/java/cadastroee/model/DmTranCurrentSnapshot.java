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
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_tran_current_snapshot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranCurrentSnapshot.findAll", query = "SELECT d FROM DmTranCurrentSnapshot d"),
    @NamedQuery(name = "DmTranCurrentSnapshot.findByTransactionSequenceNum", query = "SELECT d FROM DmTranCurrentSnapshot d WHERE d.transactionSequenceNum = :transactionSequenceNum")})
public class DmTranCurrentSnapshot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "transaction_sequence_num")
    private BigInteger transactionSequenceNum;

    public DmTranCurrentSnapshot() {
    }

    public BigInteger getTransactionSequenceNum() {
        return transactionSequenceNum;
    }

    public void setTransactionSequenceNum(BigInteger transactionSequenceNum) {
        this.transactionSequenceNum = transactionSequenceNum;
    }
    
}
