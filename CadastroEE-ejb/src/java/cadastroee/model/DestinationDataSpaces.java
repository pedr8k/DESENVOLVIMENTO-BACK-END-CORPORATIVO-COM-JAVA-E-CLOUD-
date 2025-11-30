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
@Table(name = "destination_data_spaces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DestinationDataSpaces.findAll", query = "SELECT d FROM DestinationDataSpaces d"),
    @NamedQuery(name = "DestinationDataSpaces.findByPartitionSchemeId", query = "SELECT d FROM DestinationDataSpaces d WHERE d.partitionSchemeId = :partitionSchemeId"),
    @NamedQuery(name = "DestinationDataSpaces.findByDestinationId", query = "SELECT d FROM DestinationDataSpaces d WHERE d.destinationId = :destinationId"),
    @NamedQuery(name = "DestinationDataSpaces.findByDataSpaceId", query = "SELECT d FROM DestinationDataSpaces d WHERE d.dataSpaceId = :dataSpaceId")})
public class DestinationDataSpaces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partition_scheme_id")
    private int partitionSchemeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destination_id")
    private int destinationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_space_id")
    private int dataSpaceId;

    public DestinationDataSpaces() {
    }

    public int getPartitionSchemeId() {
        return partitionSchemeId;
    }

    public void setPartitionSchemeId(int partitionSchemeId) {
        this.partitionSchemeId = partitionSchemeId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public int getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(int dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }
    
}
