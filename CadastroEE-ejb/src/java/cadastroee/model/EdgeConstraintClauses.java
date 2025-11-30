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
@Table(name = "edge_constraint_clauses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EdgeConstraintClauses.findAll", query = "SELECT e FROM EdgeConstraintClauses e"),
    @NamedQuery(name = "EdgeConstraintClauses.findByObjectId", query = "SELECT e FROM EdgeConstraintClauses e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "EdgeConstraintClauses.findByClauseNumber", query = "SELECT e FROM EdgeConstraintClauses e WHERE e.clauseNumber = :clauseNumber"),
    @NamedQuery(name = "EdgeConstraintClauses.findByFromObjectId", query = "SELECT e FROM EdgeConstraintClauses e WHERE e.fromObjectId = :fromObjectId"),
    @NamedQuery(name = "EdgeConstraintClauses.findByToObjectId", query = "SELECT e FROM EdgeConstraintClauses e WHERE e.toObjectId = :toObjectId")})
public class EdgeConstraintClauses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "clause_number")
    private int clauseNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "from_object_id")
    private int fromObjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "to_object_id")
    private int toObjectId;

    public EdgeConstraintClauses() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getClauseNumber() {
        return clauseNumber;
    }

    public void setClauseNumber(int clauseNumber) {
        this.clauseNumber = clauseNumber;
    }

    public int getFromObjectId() {
        return fromObjectId;
    }

    public void setFromObjectId(int fromObjectId) {
        this.fromObjectId = fromObjectId;
    }

    public int getToObjectId() {
        return toObjectId;
    }

    public void setToObjectId(int toObjectId) {
        this.toObjectId = toObjectId;
    }
    
}
