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

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "partition_range_values")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PartitionRangeValues.findAll", query = "SELECT p FROM PartitionRangeValues p"),
    @NamedQuery(name = "PartitionRangeValues.findByFunctionId", query = "SELECT p FROM PartitionRangeValues p WHERE p.functionId = :functionId"),
    @NamedQuery(name = "PartitionRangeValues.findByBoundaryId", query = "SELECT p FROM PartitionRangeValues p WHERE p.boundaryId = :boundaryId"),
    @NamedQuery(name = "PartitionRangeValues.findByParameterId", query = "SELECT p FROM PartitionRangeValues p WHERE p.parameterId = :parameterId"),
    @NamedQuery(name = "PartitionRangeValues.findByValue", query = "SELECT p FROM PartitionRangeValues p WHERE p.value = :value")})
public class PartitionRangeValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "function_id")
    private int functionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "boundary_id")
    private int boundaryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parameter_id")
    private int parameterId;
    @Column(name = "value")
    private Serializable value;

    public PartitionRangeValues() {
    }

    public int getFunctionId() {
        return functionId;
    }

    public void setFunctionId(int functionId) {
        this.functionId = functionId;
    }

    public int getBoundaryId() {
        return boundaryId;
    }

    public void setBoundaryId(int boundaryId) {
        this.boundaryId = boundaryId;
    }

    public int getParameterId() {
        return parameterId;
    }

    public void setParameterId(int parameterId) {
        this.parameterId = parameterId;
    }

    public Serializable getValue() {
        return value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }
    
}
