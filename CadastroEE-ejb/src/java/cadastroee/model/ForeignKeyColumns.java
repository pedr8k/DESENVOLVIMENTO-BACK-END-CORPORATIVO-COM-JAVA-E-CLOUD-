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
@Table(name = "foreign_key_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ForeignKeyColumns.findAll", query = "SELECT f FROM ForeignKeyColumns f"),
    @NamedQuery(name = "ForeignKeyColumns.findByConstraintObjectId", query = "SELECT f FROM ForeignKeyColumns f WHERE f.constraintObjectId = :constraintObjectId"),
    @NamedQuery(name = "ForeignKeyColumns.findByConstraintColumnId", query = "SELECT f FROM ForeignKeyColumns f WHERE f.constraintColumnId = :constraintColumnId"),
    @NamedQuery(name = "ForeignKeyColumns.findByParentObjectId", query = "SELECT f FROM ForeignKeyColumns f WHERE f.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "ForeignKeyColumns.findByParentColumnId", query = "SELECT f FROM ForeignKeyColumns f WHERE f.parentColumnId = :parentColumnId"),
    @NamedQuery(name = "ForeignKeyColumns.findByReferencedObjectId", query = "SELECT f FROM ForeignKeyColumns f WHERE f.referencedObjectId = :referencedObjectId"),
    @NamedQuery(name = "ForeignKeyColumns.findByReferencedColumnId", query = "SELECT f FROM ForeignKeyColumns f WHERE f.referencedColumnId = :referencedColumnId")})
public class ForeignKeyColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "constraint_object_id")
    private int constraintObjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "constraint_column_id")
    private int constraintColumnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_object_id")
    private int parentObjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_column_id")
    private int parentColumnId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "referenced_object_id")
    private int referencedObjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "referenced_column_id")
    private int referencedColumnId;

    public ForeignKeyColumns() {
    }

    public int getConstraintObjectId() {
        return constraintObjectId;
    }

    public void setConstraintObjectId(int constraintObjectId) {
        this.constraintObjectId = constraintObjectId;
    }

    public int getConstraintColumnId() {
        return constraintColumnId;
    }

    public void setConstraintColumnId(int constraintColumnId) {
        this.constraintColumnId = constraintColumnId;
    }

    public int getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(int parentObjectId) {
        this.parentObjectId = parentObjectId;
    }

    public int getParentColumnId() {
        return parentColumnId;
    }

    public void setParentColumnId(int parentColumnId) {
        this.parentColumnId = parentColumnId;
    }

    public int getReferencedObjectId() {
        return referencedObjectId;
    }

    public void setReferencedObjectId(int referencedObjectId) {
        this.referencedObjectId = referencedObjectId;
    }

    public int getReferencedColumnId() {
        return referencedColumnId;
    }

    public void setReferencedColumnId(int referencedColumnId) {
        this.referencedColumnId = referencedColumnId;
    }
    
}
