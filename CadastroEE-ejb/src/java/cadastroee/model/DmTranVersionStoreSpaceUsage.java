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
@Table(name = "dm_tran_version_store_space_usage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmTranVersionStoreSpaceUsage.findAll", query = "SELECT d FROM DmTranVersionStoreSpaceUsage d"),
    @NamedQuery(name = "DmTranVersionStoreSpaceUsage.findByDatabaseId", query = "SELECT d FROM DmTranVersionStoreSpaceUsage d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmTranVersionStoreSpaceUsage.findByReservedPageCount", query = "SELECT d FROM DmTranVersionStoreSpaceUsage d WHERE d.reservedPageCount = :reservedPageCount"),
    @NamedQuery(name = "DmTranVersionStoreSpaceUsage.findByReservedSpaceKb", query = "SELECT d FROM DmTranVersionStoreSpaceUsage d WHERE d.reservedSpaceKb = :reservedSpaceKb")})
public class DmTranVersionStoreSpaceUsage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "database_id")
    private Integer databaseId;
    @Column(name = "reserved_page_count")
    private BigInteger reservedPageCount;
    @Column(name = "reserved_space_kb")
    private BigInteger reservedSpaceKb;

    public DmTranVersionStoreSpaceUsage() {
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public BigInteger getReservedPageCount() {
        return reservedPageCount;
    }

    public void setReservedPageCount(BigInteger reservedPageCount) {
        this.reservedPageCount = reservedPageCount;
    }

    public BigInteger getReservedSpaceKb() {
        return reservedSpaceKb;
    }

    public void setReservedSpaceKb(BigInteger reservedSpaceKb) {
        this.reservedSpaceKb = reservedSpaceKb;
    }
    
}
