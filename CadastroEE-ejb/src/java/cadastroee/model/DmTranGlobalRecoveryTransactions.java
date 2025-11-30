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
@Table(name = "dm_tran_global_recovery_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findAll", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByDatabaseId", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByTransactionUow", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.transactionUow = :transactionUow"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByTransactionManagerDbid", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.transactionManagerDbid = :transactionManagerDbid"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByTransactionManagerRmid", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.transactionManagerRmid = :transactionManagerRmid"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByTransactionManagerServerName", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.transactionManagerServerName = :transactionManagerServerName"),
    @NamedQuery(name = "DmTranGlobalRecoveryTransactions.findByTransactionManagerDatabaseName", query = "SELECT d FROM DmTranGlobalRecoveryTransactions d WHERE d.transactionManagerDatabaseName = :transactionManagerDatabaseName")})
public class DmTranGlobalRecoveryTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "transaction_uow")
    private String transactionUow;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transaction_manager_dbid")
    private int transactionManagerDbid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "transaction_manager_rmid")
    private String transactionManagerRmid;
    @Size(max = 261)
    @Column(name = "transaction_manager_server_name")
    private String transactionManagerServerName;
    @Size(max = 129)
    @Column(name = "transaction_manager_database_name")
    private String transactionManagerDatabaseName;

    public DmTranGlobalRecoveryTransactions() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public String getTransactionUow() {
        return transactionUow;
    }

    public void setTransactionUow(String transactionUow) {
        this.transactionUow = transactionUow;
    }

    public int getTransactionManagerDbid() {
        return transactionManagerDbid;
    }

    public void setTransactionManagerDbid(int transactionManagerDbid) {
        this.transactionManagerDbid = transactionManagerDbid;
    }

    public String getTransactionManagerRmid() {
        return transactionManagerRmid;
    }

    public void setTransactionManagerRmid(String transactionManagerRmid) {
        this.transactionManagerRmid = transactionManagerRmid;
    }

    public String getTransactionManagerServerName() {
        return transactionManagerServerName;
    }

    public void setTransactionManagerServerName(String transactionManagerServerName) {
        this.transactionManagerServerName = transactionManagerServerName;
    }

    public String getTransactionManagerDatabaseName() {
        return transactionManagerDatabaseName;
    }

    public void setTransactionManagerDatabaseName(String transactionManagerDatabaseName) {
        this.transactionManagerDatabaseName = transactionManagerDatabaseName;
    }
    
}
