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
@Table(name = "type_assembly_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeAssemblyUsages.findAll", query = "SELECT t FROM TypeAssemblyUsages t"),
    @NamedQuery(name = "TypeAssemblyUsages.findByUserTypeId", query = "SELECT t FROM TypeAssemblyUsages t WHERE t.userTypeId = :userTypeId"),
    @NamedQuery(name = "TypeAssemblyUsages.findByAssemblyId", query = "SELECT t FROM TypeAssemblyUsages t WHERE t.assemblyId = :assemblyId")})
public class TypeAssemblyUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_type_id")
    private int userTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assembly_id")
    private int assemblyId;

    public TypeAssemblyUsages() {
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public int getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(int assemblyId) {
        this.assemblyId = assemblyId;
    }
    
}
