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
@Table(name = "dm_column_encryption_enclave_properties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmColumnEncryptionEnclaveProperties.findAll", query = "SELECT d FROM DmColumnEncryptionEnclaveProperties d"),
    @NamedQuery(name = "DmColumnEncryptionEnclaveProperties.findByName", query = "SELECT d FROM DmColumnEncryptionEnclaveProperties d WHERE d.name = :name"),
    @NamedQuery(name = "DmColumnEncryptionEnclaveProperties.findByValue", query = "SELECT d FROM DmColumnEncryptionEnclaveProperties d WHERE d.value = :value")})
public class DmColumnEncryptionEnclaveProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private Serializable value;

    public DmColumnEncryptionEnclaveProperties() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serializable getValue() {
        return value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }
    
}
