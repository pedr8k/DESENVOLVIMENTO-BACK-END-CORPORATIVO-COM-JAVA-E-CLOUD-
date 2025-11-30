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
@Table(name = "module_assembly_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModuleAssemblyUsages.findAll", query = "SELECT m FROM ModuleAssemblyUsages m"),
    @NamedQuery(name = "ModuleAssemblyUsages.findByObjectId", query = "SELECT m FROM ModuleAssemblyUsages m WHERE m.objectId = :objectId"),
    @NamedQuery(name = "ModuleAssemblyUsages.findByAssemblyId", query = "SELECT m FROM ModuleAssemblyUsages m WHERE m.assemblyId = :assemblyId")})
public class ModuleAssemblyUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assembly_id")
    private int assemblyId;

    public ModuleAssemblyUsages() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(int assemblyId) {
        this.assemblyId = assemblyId;
    }
    
}
