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
@Table(name = "securable_classes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SecurableClasses.findAll", query = "SELECT s FROM SecurableClasses s"),
    @NamedQuery(name = "SecurableClasses.findByClassDesc", query = "SELECT s FROM SecurableClasses s WHERE s.classDesc = :classDesc"),
    @NamedQuery(name = "SecurableClasses.findByClass1", query = "SELECT s FROM SecurableClasses s WHERE s.class1 = :class1")})
public class SecurableClasses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 60)
    @Column(name = "class_desc")
    private String classDesc;
    @Column(name = "class")
    private Integer class1;

    public SecurableClasses() {
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public Integer getClass1() {
        return class1;
    }

    public void setClass1(Integer class1) {
        this.class1 = class1;
    }
    
}
