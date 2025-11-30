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
import java.math.BigInteger;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_os_cluster_properties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmOsClusterProperties.findAll", query = "SELECT d FROM DmOsClusterProperties d"),
    @NamedQuery(name = "DmOsClusterProperties.findByVerboseLogging", query = "SELECT d FROM DmOsClusterProperties d WHERE d.verboseLogging = :verboseLogging"),
    @NamedQuery(name = "DmOsClusterProperties.findBySqlDumperDumpFlags", query = "SELECT d FROM DmOsClusterProperties d WHERE d.sqlDumperDumpFlags = :sqlDumperDumpFlags"),
    @NamedQuery(name = "DmOsClusterProperties.findBySqlDumperDumpPath", query = "SELECT d FROM DmOsClusterProperties d WHERE d.sqlDumperDumpPath = :sqlDumperDumpPath"),
    @NamedQuery(name = "DmOsClusterProperties.findBySqlDumperDumpTimeOut", query = "SELECT d FROM DmOsClusterProperties d WHERE d.sqlDumperDumpTimeOut = :sqlDumperDumpTimeOut"),
    @NamedQuery(name = "DmOsClusterProperties.findByFailureConditionLevel", query = "SELECT d FROM DmOsClusterProperties d WHERE d.failureConditionLevel = :failureConditionLevel"),
    @NamedQuery(name = "DmOsClusterProperties.findByHealthCheckTimeout", query = "SELECT d FROM DmOsClusterProperties d WHERE d.healthCheckTimeout = :healthCheckTimeout")})
public class DmOsClusterProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "VerboseLogging")
    private BigInteger verboseLogging;
    @Column(name = "SqlDumperDumpFlags")
    private BigInteger sqlDumperDumpFlags;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "SqlDumperDumpPath")
    private String sqlDumperDumpPath;
    @Column(name = "SqlDumperDumpTimeOut")
    private BigInteger sqlDumperDumpTimeOut;
    @Column(name = "FailureConditionLevel")
    private BigInteger failureConditionLevel;
    @Column(name = "HealthCheckTimeout")
    private BigInteger healthCheckTimeout;

    public DmOsClusterProperties() {
    }

    public BigInteger getVerboseLogging() {
        return verboseLogging;
    }

    public void setVerboseLogging(BigInteger verboseLogging) {
        this.verboseLogging = verboseLogging;
    }

    public BigInteger getSqlDumperDumpFlags() {
        return sqlDumperDumpFlags;
    }

    public void setSqlDumperDumpFlags(BigInteger sqlDumperDumpFlags) {
        this.sqlDumperDumpFlags = sqlDumperDumpFlags;
    }

    public String getSqlDumperDumpPath() {
        return sqlDumperDumpPath;
    }

    public void setSqlDumperDumpPath(String sqlDumperDumpPath) {
        this.sqlDumperDumpPath = sqlDumperDumpPath;
    }

    public BigInteger getSqlDumperDumpTimeOut() {
        return sqlDumperDumpTimeOut;
    }

    public void setSqlDumperDumpTimeOut(BigInteger sqlDumperDumpTimeOut) {
        this.sqlDumperDumpTimeOut = sqlDumperDumpTimeOut;
    }

    public BigInteger getFailureConditionLevel() {
        return failureConditionLevel;
    }

    public void setFailureConditionLevel(BigInteger failureConditionLevel) {
        this.failureConditionLevel = failureConditionLevel;
    }

    public BigInteger getHealthCheckTimeout() {
        return healthCheckTimeout;
    }

    public void setHealthCheckTimeout(BigInteger healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
    }
    
}
