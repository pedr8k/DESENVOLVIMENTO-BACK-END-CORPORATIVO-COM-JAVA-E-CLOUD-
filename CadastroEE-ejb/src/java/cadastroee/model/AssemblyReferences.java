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
@Table(name = "assembly_references")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssemblyReferences.findAll", query = "SELECT a FROM AssemblyReferences a"),
    @NamedQuery(name = "AssemblyReferences.findByAssemblyId", query = "SELECT a FROM AssemblyReferences a WHERE a.assemblyId = :assemblyId"),
    @NamedQuery(name = "AssemblyReferences.findByReferencedAssemblyId", query = "SELECT a FROM AssemblyReferences a WHERE a.referencedAssemblyId = :referencedAssemblyId")})
public class AssemblyReferences implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assembly_id")
    private int assemblyId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "referenced_assembly_id")
    private int referencedAssemblyId;

    public AssemblyReferences() {
    }

    public int getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(int assemblyId) {
        this.assemblyId = assemblyId;
    }

    public int getReferencedAssemblyId() {
        return referencedAssemblyId;
    }

    public void setReferencedAssemblyId(int referencedAssemblyId) {
        this.referencedAssemblyId = referencedAssemblyId;
    }
    
}
