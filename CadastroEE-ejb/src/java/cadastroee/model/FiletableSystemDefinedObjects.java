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
@Table(name = "filetable_system_defined_objects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FiletableSystemDefinedObjects.findAll", query = "SELECT f FROM FiletableSystemDefinedObjects f"),
    @NamedQuery(name = "FiletableSystemDefinedObjects.findByObjectId", query = "SELECT f FROM FiletableSystemDefinedObjects f WHERE f.objectId = :objectId"),
    @NamedQuery(name = "FiletableSystemDefinedObjects.findByParentObjectId", query = "SELECT f FROM FiletableSystemDefinedObjects f WHERE f.parentObjectId = :parentObjectId")})
public class FiletableSystemDefinedObjects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_object_id")
    private int parentObjectId;

    public FiletableSystemDefinedObjects() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(int parentObjectId) {
        this.parentObjectId = parentObjectId;
    }
    
}
