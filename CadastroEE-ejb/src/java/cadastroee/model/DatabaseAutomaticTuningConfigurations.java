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
@Table(name = "database_automatic_tuning_configurations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatabaseAutomaticTuningConfigurations.findAll", query = "SELECT d FROM DatabaseAutomaticTuningConfigurations d"),
    @NamedQuery(name = "DatabaseAutomaticTuningConfigurations.findByOption", query = "SELECT d FROM DatabaseAutomaticTuningConfigurations d WHERE d.option = :option"),
    @NamedQuery(name = "DatabaseAutomaticTuningConfigurations.findByOptionValue", query = "SELECT d FROM DatabaseAutomaticTuningConfigurations d WHERE d.optionValue = :optionValue"),
    @NamedQuery(name = "DatabaseAutomaticTuningConfigurations.findByType", query = "SELECT d FROM DatabaseAutomaticTuningConfigurations d WHERE d.type = :type"),
    @NamedQuery(name = "DatabaseAutomaticTuningConfigurations.findByTypeValue", query = "SELECT d FROM DatabaseAutomaticTuningConfigurations d WHERE d.typeValue = :typeValue"),
    @NamedQuery(name = "DatabaseAutomaticTuningConfigurations.findByDetails", query = "SELECT d FROM DatabaseAutomaticTuningConfigurations d WHERE d.details = :details"),
    @NamedQuery(name = "DatabaseAutomaticTuningConfigurations.findByState", query = "SELECT d FROM DatabaseAutomaticTuningConfigurations d WHERE d.state = :state")})
public class DatabaseAutomaticTuningConfigurations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 60)
    @Column(name = "option")
    private String option;
    @Size(max = 60)
    @Column(name = "option_value")
    private String optionValue;
    @Size(max = 60)
    @Column(name = "type")
    private String type;
    @Column(name = "type_value")
    private Serializable typeValue;
    @Size(max = 4000)
    @Column(name = "details")
    private String details;
    @Basic(optional = false)
    @NotNull
    @Column(name = "state")
    private int state;

    public DatabaseAutomaticTuningConfigurations() {
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Serializable getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(Serializable typeValue) {
        this.typeValue = typeValue;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    
}
