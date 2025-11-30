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
@Table(name = "dm_db_data_pools")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbDataPools.findAll", query = "SELECT d FROM DmDbDataPools d"),
    @NamedQuery(name = "DmDbDataPools.findByDataPoolId", query = "SELECT d FROM DmDbDataPools d WHERE d.dataPoolId = :dataPoolId"),
    @NamedQuery(name = "DmDbDataPools.findByName", query = "SELECT d FROM DmDbDataPools d WHERE d.name = :name"),
    @NamedQuery(name = "DmDbDataPools.findByLocation", query = "SELECT d FROM DmDbDataPools d WHERE d.location = :location")})
public class DmDbDataPools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_pool_id")
    private int dataPoolId;
    @Size(max = 256)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "location")
    private String location;

    public DmDbDataPools() {
    }

    public int getDataPoolId() {
        return dataPoolId;
    }

    public void setDataPoolId(int dataPoolId) {
        this.dataPoolId = dataPoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
