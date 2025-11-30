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
@Table(name = "dm_server_registry")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmServerRegistry.findAll", query = "SELECT d FROM DmServerRegistry d"),
    @NamedQuery(name = "DmServerRegistry.findByRegistryKey", query = "SELECT d FROM DmServerRegistry d WHERE d.registryKey = :registryKey"),
    @NamedQuery(name = "DmServerRegistry.findByValueName", query = "SELECT d FROM DmServerRegistry d WHERE d.valueName = :valueName"),
    @NamedQuery(name = "DmServerRegistry.findByValueData", query = "SELECT d FROM DmServerRegistry d WHERE d.valueData = :valueData")})
public class DmServerRegistry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 256)
    @Column(name = "registry_key")
    private String registryKey;
    @Size(max = 256)
    @Column(name = "value_name")
    private String valueName;
    @Column(name = "value_data")
    private Serializable valueData;

    public DmServerRegistry() {
    }

    public String getRegistryKey() {
        return registryKey;
    }

    public void setRegistryKey(String registryKey) {
        this.registryKey = registryKey;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public Serializable getValueData() {
        return valueData;
    }

    public void setValueData(Serializable valueData) {
        this.valueData = valueData;
    }
    
}
