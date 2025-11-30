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
@Table(name = "function_order_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FunctionOrderColumns.findAll", query = "SELECT f FROM FunctionOrderColumns f"),
    @NamedQuery(name = "FunctionOrderColumns.findByObjectId", query = "SELECT f FROM FunctionOrderColumns f WHERE f.objectId = :objectId"),
    @NamedQuery(name = "FunctionOrderColumns.findByOrderColumnId", query = "SELECT f FROM FunctionOrderColumns f WHERE f.orderColumnId = :orderColumnId"),
    @NamedQuery(name = "FunctionOrderColumns.findByColumnId", query = "SELECT f FROM FunctionOrderColumns f WHERE f.columnId = :columnId"),
    @NamedQuery(name = "FunctionOrderColumns.findByIsDescending", query = "SELECT f FROM FunctionOrderColumns f WHERE f.isDescending = :isDescending")})
public class FunctionOrderColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_column_id")
    private int orderColumnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "column_id")
    private int columnId;
    @Column(name = "is_descending")
    private Boolean isDescending;

    public FunctionOrderColumns() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getOrderColumnId() {
        return orderColumnId;
    }

    public void setOrderColumnId(int orderColumnId) {
        this.orderColumnId = orderColumnId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public Boolean getIsDescending() {
        return isDescending;
    }

    public void setIsDescending(Boolean isDescending) {
        this.isDescending = isDescending;
    }
    
}
