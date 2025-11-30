/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "dm_audit_class_type_map")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmAuditClassTypeMap.findAll", query = "SELECT d FROM DmAuditClassTypeMap d"),
    @NamedQuery(name = "DmAuditClassTypeMap.findByClassType", query = "SELECT d FROM DmAuditClassTypeMap d WHERE d.classType = :classType"),
    @NamedQuery(name = "DmAuditClassTypeMap.findByClassTypeDesc", query = "SELECT d FROM DmAuditClassTypeMap d WHERE d.classTypeDesc = :classTypeDesc"),
    @NamedQuery(name = "DmAuditClassTypeMap.findBySecurableClassDesc", query = "SELECT d FROM DmAuditClassTypeMap d WHERE d.securableClassDesc = :securableClassDesc")})
public class DmAuditClassTypeMap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 2)
    @Column(name = "class_type")
    private String classType;
    @Size(max = 35)
    @Column(name = "class_type_desc")
    private String classTypeDesc;
    @Size(max = 35)
    @Column(name = "securable_class_desc")
    private String securableClassDesc;

    public DmAuditClassTypeMap() {
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getClassTypeDesc() {
        return classTypeDesc;
    }

    public void setClassTypeDesc(String classTypeDesc) {
        this.classTypeDesc = classTypeDesc;
    }

    public String getSecurableClassDesc() {
        return securableClassDesc;
    }

    public void setSecurableClassDesc(String securableClassDesc) {
        this.securableClassDesc = securableClassDesc;
    }
    
}
