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
@Table(name = "dm_io_cluster_shared_drives")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmIoClusterSharedDrives.findAll", query = "SELECT d FROM DmIoClusterSharedDrives d"),
    @NamedQuery(name = "DmIoClusterSharedDrives.findByDriveName", query = "SELECT d FROM DmIoClusterSharedDrives d WHERE d.driveName = :driveName")})
public class DmIoClusterSharedDrives implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 1)
    @Column(name = "DriveName")
    private String driveName;

    public DmIoClusterSharedDrives() {
    }

    public String getDriveName() {
        return driveName;
    }

    public void setDriveName(String driveName) {
        this.driveName = driveName;
    }
    
}
