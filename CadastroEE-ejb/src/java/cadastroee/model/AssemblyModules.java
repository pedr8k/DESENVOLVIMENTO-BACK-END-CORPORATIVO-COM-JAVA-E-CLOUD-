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

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "assembly_modules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssemblyModules.findAll", query = "SELECT a FROM AssemblyModules a"),
    @NamedQuery(name = "AssemblyModules.findByObjectId", query = "SELECT a FROM AssemblyModules a WHERE a.objectId = :objectId"),
    @NamedQuery(name = "AssemblyModules.findByAssemblyId", query = "SELECT a FROM AssemblyModules a WHERE a.assemblyId = :assemblyId"),
    @NamedQuery(name = "AssemblyModules.findByAssemblyClass", query = "SELECT a FROM AssemblyModules a WHERE a.assemblyClass = :assemblyClass"),
    @NamedQuery(name = "AssemblyModules.findByAssemblyMethod", query = "SELECT a FROM AssemblyModules a WHERE a.assemblyMethod = :assemblyMethod"),
    @NamedQuery(name = "AssemblyModules.findByNullOnNullInput", query = "SELECT a FROM AssemblyModules a WHERE a.nullOnNullInput = :nullOnNullInput"),
    @NamedQuery(name = "AssemblyModules.findByExecuteAsPrincipalId", query = "SELECT a FROM AssemblyModules a WHERE a.executeAsPrincipalId = :executeAsPrincipalId")})
public class AssemblyModules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assembly_id")
    private int assemblyId;
    @Size(max = 128)
    @Column(name = "assembly_class")
    private String assemblyClass;
    @Size(max = 128)
    @Column(name = "assembly_method")
    private String assemblyMethod;
    @Column(name = "null_on_null_input")
    private Boolean nullOnNullInput;
    @Column(name = "execute_as_principal_id")
    private Integer executeAsPrincipalId;

    public AssemblyModules() {
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

    public String getAssemblyClass() {
        return assemblyClass;
    }

    public void setAssemblyClass(String assemblyClass) {
        this.assemblyClass = assemblyClass;
    }

    public String getAssemblyMethod() {
        return assemblyMethod;
    }

    public void setAssemblyMethod(String assemblyMethod) {
        this.assemblyMethod = assemblyMethod;
    }

    public Boolean getNullOnNullInput() {
        return nullOnNullInput;
    }

    public void setNullOnNullInput(Boolean nullOnNullInput) {
        this.nullOnNullInput = nullOnNullInput;
    }

    public Integer getExecuteAsPrincipalId() {
        return executeAsPrincipalId;
    }

    public void setExecuteAsPrincipalId(Integer executeAsPrincipalId) {
        this.executeAsPrincipalId = executeAsPrincipalId;
    }
    
}
