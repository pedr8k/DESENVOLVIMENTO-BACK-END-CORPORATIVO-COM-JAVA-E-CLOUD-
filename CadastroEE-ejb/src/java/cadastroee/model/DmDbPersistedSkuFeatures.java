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
@Table(name = "dm_db_persisted_sku_features")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DmDbPersistedSkuFeatures.findAll", query = "SELECT d FROM DmDbPersistedSkuFeatures d"),
    @NamedQuery(name = "DmDbPersistedSkuFeatures.findByFeatureName", query = "SELECT d FROM DmDbPersistedSkuFeatures d WHERE d.featureName = :featureName"),
    @NamedQuery(name = "DmDbPersistedSkuFeatures.findByFeatureId", query = "SELECT d FROM DmDbPersistedSkuFeatures d WHERE d.featureId = :featureId")})
public class DmDbPersistedSkuFeatures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 4000)
    @Column(name = "feature_name")
    private String featureName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "feature_id")
    private int featureId;

    public DmDbPersistedSkuFeatures() {
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }
    
}
