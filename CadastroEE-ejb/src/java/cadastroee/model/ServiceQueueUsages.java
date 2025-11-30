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
@Table(name = "service_queue_usages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiceQueueUsages.findAll", query = "SELECT s FROM ServiceQueueUsages s"),
    @NamedQuery(name = "ServiceQueueUsages.findByServiceId", query = "SELECT s FROM ServiceQueueUsages s WHERE s.serviceId = :serviceId"),
    @NamedQuery(name = "ServiceQueueUsages.findByServiceQueueId", query = "SELECT s FROM ServiceQueueUsages s WHERE s.serviceQueueId = :serviceQueueId")})
public class ServiceQueueUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_id")
    private int serviceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "service_queue_id")
    private int serviceQueueId;

    public ServiceQueueUsages() {
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getServiceQueueId() {
        return serviceQueueId;
    }

    public void setServiceQueueId(int serviceQueueId) {
        this.serviceQueueId = serviceQueueId;
    }
    
}
