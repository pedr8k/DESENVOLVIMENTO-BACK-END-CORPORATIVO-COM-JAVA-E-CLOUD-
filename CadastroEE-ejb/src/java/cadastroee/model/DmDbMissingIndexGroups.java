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
@Table(name = "dm_db_missing_index_groups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbMissingIndexGroups.findAll", query = "SELECT d FROM DmDbMissingIndexGroups d"),
    @NamedQuery(name = "DmDbMissingIndexGroups.findByIndexGroupHandle", query = "SELECT d FROM DmDbMissingIndexGroups d WHERE d.indexGroupHandle = :indexGroupHandle"),
    @NamedQuery(name = "DmDbMissingIndexGroups.findByIndexHandle", query = "SELECT d FROM DmDbMissingIndexGroups d WHERE d.indexHandle = :indexHandle")})
public class DmDbMissingIndexGroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_group_handle")
    private int indexGroupHandle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "index_handle")
    private int indexHandle;

    public DmDbMissingIndexGroups() {
    }

    public int getIndexGroupHandle() {
        return indexGroupHandle;
    }

    public void setIndexGroupHandle(int indexGroupHandle) {
        this.indexGroupHandle = indexGroupHandle;
    }

    public int getIndexHandle() {
        return indexHandle;
    }

    public void setIndexHandle(int indexHandle) {
        this.indexHandle = indexHandle;
    }
    
}
