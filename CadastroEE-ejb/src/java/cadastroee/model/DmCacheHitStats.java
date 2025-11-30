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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_cache_hit_stats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmCacheHitStats.findAll", query = "SELECT d FROM DmCacheHitStats d"),
    @NamedQuery(name = "DmCacheHitStats.findByDistributionId", query = "SELECT d FROM DmCacheHitStats d WHERE d.distributionId = :distributionId"),
    @NamedQuery(name = "DmCacheHitStats.findByCacheHit", query = "SELECT d FROM DmCacheHitStats d WHERE d.cacheHit = :cacheHit"),
    @NamedQuery(name = "DmCacheHitStats.findByRemoteHit", query = "SELECT d FROM DmCacheHitStats d WHERE d.remoteHit = :remoteHit"),
    @NamedQuery(name = "DmCacheHitStats.findByCollectionStartTime", query = "SELECT d FROM DmCacheHitStats d WHERE d.collectionStartTime = :collectionStartTime")})
public class DmCacheHitStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "distribution_id")
    private Short distributionId;
    @Column(name = "cache_hit")
    private BigInteger cacheHit;
    @Column(name = "remote_hit")
    private BigInteger remoteHit;
    @Column(name = "collection_start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date collectionStartTime;

    public DmCacheHitStats() {
    }

    public Short getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(Short distributionId) {
        this.distributionId = distributionId;
    }

    public BigInteger getCacheHit() {
        return cacheHit;
    }

    public void setCacheHit(BigInteger cacheHit) {
        this.cacheHit = cacheHit;
    }

    public BigInteger getRemoteHit() {
        return remoteHit;
    }

    public void setRemoteHit(BigInteger remoteHit) {
        this.remoteHit = remoteHit;
    }

    public Date getCollectionStartTime() {
        return collectionStartTime;
    }

    public void setCollectionStartTime(Date collectionStartTime) {
        this.collectionStartTime = collectionStartTime;
    }
    
}
