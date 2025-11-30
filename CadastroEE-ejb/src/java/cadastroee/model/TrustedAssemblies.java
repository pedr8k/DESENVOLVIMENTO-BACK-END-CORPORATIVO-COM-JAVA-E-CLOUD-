/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "trusted_assemblies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrustedAssemblies.findAll", query = "SELECT t FROM TrustedAssemblies t"),
    @NamedQuery(name = "TrustedAssemblies.findByDescription", query = "SELECT t FROM TrustedAssemblies t WHERE t.description = :description"),
    @NamedQuery(name = "TrustedAssemblies.findByCreateDate", query = "SELECT t FROM TrustedAssemblies t WHERE t.createDate = :createDate"),
    @NamedQuery(name = "TrustedAssemblies.findByCreatedBy", query = "SELECT t FROM TrustedAssemblies t WHERE t.createdBy = :createdBy")})
public class TrustedAssemblies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "hash")
    private byte[] hash;
    @Size(max = 4000)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "created_by")
    private String createdBy;

    public TrustedAssemblies() {
    }

    public byte[] getHash() {
        return hash;
    }

    public void setHash(byte[] hash) {
        this.hash = hash;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
}
