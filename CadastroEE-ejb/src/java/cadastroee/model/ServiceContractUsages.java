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
@Table(name = "service_contract_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceContractUsages.findAll", query = "SELECT s FROM ServiceContractUsages s"),
    @NamedQuery(name = "ServiceContractUsages.findByServiceId", query = "SELECT s FROM ServiceContractUsages s WHERE s.serviceId = :serviceId"),
    @NamedQuery(name = "ServiceContractUsages.findByServiceContractId", query = "SELECT s FROM ServiceContractUsages s WHERE s.serviceContractId = :serviceContractId")})
public class ServiceContractUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_id")
    private int serviceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_contract_id")
    private int serviceContractId;

    public ServiceContractUsages() {
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(int serviceContractId) {
        this.serviceContractId = serviceContractId;
    }
    
}
