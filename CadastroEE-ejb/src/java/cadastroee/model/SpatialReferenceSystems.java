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
@Table(name = "spatial_reference_systems")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SpatialReferenceSystems.findAll", query = "SELECT s FROM SpatialReferenceSystems s"),
    @NamedQuery(name = "SpatialReferenceSystems.findBySpatialReferenceId", query = "SELECT s FROM SpatialReferenceSystems s WHERE s.spatialReferenceId = :spatialReferenceId"),
    @NamedQuery(name = "SpatialReferenceSystems.findByAuthorityName", query = "SELECT s FROM SpatialReferenceSystems s WHERE s.authorityName = :authorityName"),
    @NamedQuery(name = "SpatialReferenceSystems.findByAuthorizedSpatialReferenceId", query = "SELECT s FROM SpatialReferenceSystems s WHERE s.authorizedSpatialReferenceId = :authorizedSpatialReferenceId"),
    @NamedQuery(name = "SpatialReferenceSystems.findByWellKnownText", query = "SELECT s FROM SpatialReferenceSystems s WHERE s.wellKnownText = :wellKnownText"),
    @NamedQuery(name = "SpatialReferenceSystems.findByUnitOfMeasure", query = "SELECT s FROM SpatialReferenceSystems s WHERE s.unitOfMeasure = :unitOfMeasure"),
    @NamedQuery(name = "SpatialReferenceSystems.findByUnitConversionFactor", query = "SELECT s FROM SpatialReferenceSystems s WHERE s.unitConversionFactor = :unitConversionFactor")})
public class SpatialReferenceSystems implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "spatial_reference_id")
    private Integer spatialReferenceId;
    @Size(max = 128)
    @Column(name = "authority_name")
    private String authorityName;
    @Column(name = "authorized_spatial_reference_id")
    private Integer authorizedSpatialReferenceId;
    @Size(max = 4000)
    @Column(name = "well_known_text")
    private String wellKnownText;
    @Size(max = 128)
    @Column(name = "unit_of_measure")
    private String unitOfMeasure;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "unit_conversion_factor")
    private Double unitConversionFactor;

    public SpatialReferenceSystems() {
    }

    public Integer getSpatialReferenceId() {
        return spatialReferenceId;
    }

    public void setSpatialReferenceId(Integer spatialReferenceId) {
        this.spatialReferenceId = spatialReferenceId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public Integer getAuthorizedSpatialReferenceId() {
        return authorizedSpatialReferenceId;
    }

    public void setAuthorizedSpatialReferenceId(Integer authorizedSpatialReferenceId) {
        this.authorizedSpatialReferenceId = authorizedSpatialReferenceId;
    }

    public String getWellKnownText() {
        return wellKnownText;
    }

    public void setWellKnownText(String wellKnownText) {
        this.wellKnownText = wellKnownText;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Double getUnitConversionFactor() {
        return unitConversionFactor;
    }

    public void setUnitConversionFactor(Double unitConversionFactor) {
        this.unitConversionFactor = unitConversionFactor;
    }
    
}
