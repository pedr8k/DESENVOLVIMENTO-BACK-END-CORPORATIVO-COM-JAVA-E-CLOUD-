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
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "external_table_partitioning_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExternalTablePartitioningColumns.findAll", query = "SELECT e FROM ExternalTablePartitioningColumns e"),
    @NamedQuery(name = "ExternalTablePartitioningColumns.findByObjectId", query = "SELECT e FROM ExternalTablePartitioningColumns e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "ExternalTablePartitioningColumns.findByColumnId", query = "SELECT e FROM ExternalTablePartitioningColumns e WHERE e.columnId = :columnId"),
    @NamedQuery(name = "ExternalTablePartitioningColumns.findByOrdinalId", query = "SELECT e FROM ExternalTablePartitioningColumns e WHERE e.ordinalId = :ordinalId")})
public class ExternalTablePartitioningColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Column(name = "ordinal_id")
    private BigInteger ordinalId;

    public ExternalTablePartitioningColumns() {
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

    public BigInteger getOrdinalId() {
        return ordinalId;
    }

    public void setOrdinalId(BigInteger ordinalId) {
        this.ordinalId = ordinalId;
    }
    
}
