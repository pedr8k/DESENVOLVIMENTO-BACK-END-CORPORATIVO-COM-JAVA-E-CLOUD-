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
@Table(name = "column_type_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColumnTypeUsages.findAll", query = "SELECT c FROM ColumnTypeUsages c"),
    @NamedQuery(name = "ColumnTypeUsages.findByObjectId", query = "SELECT c FROM ColumnTypeUsages c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "ColumnTypeUsages.findByColumnId", query = "SELECT c FROM ColumnTypeUsages c WHERE c.columnId = :columnId"),
    @NamedQuery(name = "ColumnTypeUsages.findByUserTypeId", query = "SELECT c FROM ColumnTypeUsages c WHERE c.userTypeId = :userTypeId")})
public class ColumnTypeUsages implements Serializable {

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
    @Column(name = "user_type_id")
    private int userTypeId;

    public ColumnTypeUsages() {
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

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }
    
}
