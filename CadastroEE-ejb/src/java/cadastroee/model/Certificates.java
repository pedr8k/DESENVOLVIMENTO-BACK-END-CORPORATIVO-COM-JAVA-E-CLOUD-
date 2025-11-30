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
@Table(name = "certificates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Certificates.findAll", query = "SELECT c FROM Certificates c"),
    @NamedQuery(name = "Certificates.findByName", query = "SELECT c FROM Certificates c WHERE c.name = :name"),
    @NamedQuery(name = "Certificates.findByCertificateId", query = "SELECT c FROM Certificates c WHERE c.certificateId = :certificateId"),
    @NamedQuery(name = "Certificates.findByPrincipalId", query = "SELECT c FROM Certificates c WHERE c.principalId = :principalId"),
    @NamedQuery(name = "Certificates.findByPvtKeyEncryptionType", query = "SELECT c FROM Certificates c WHERE c.pvtKeyEncryptionType = :pvtKeyEncryptionType"),
    @NamedQuery(name = "Certificates.findByPvtKeyEncryptionTypeDesc", query = "SELECT c FROM Certificates c WHERE c.pvtKeyEncryptionTypeDesc = :pvtKeyEncryptionTypeDesc"),
    @NamedQuery(name = "Certificates.findByIsActiveForBeginDialog", query = "SELECT c FROM Certificates c WHERE c.isActiveForBeginDialog = :isActiveForBeginDialog"),
    @NamedQuery(name = "Certificates.findByIssuerName", query = "SELECT c FROM Certificates c WHERE c.issuerName = :issuerName"),
    @NamedQuery(name = "Certificates.findByCertSerialNumber", query = "SELECT c FROM Certificates c WHERE c.certSerialNumber = :certSerialNumber"),
    @NamedQuery(name = "Certificates.findByStringSid", query = "SELECT c FROM Certificates c WHERE c.stringSid = :stringSid"),
    @NamedQuery(name = "Certificates.findBySubject", query = "SELECT c FROM Certificates c WHERE c.subject = :subject"),
    @NamedQuery(name = "Certificates.findByExpiryDate", query = "SELECT c FROM Certificates c WHERE c.expiryDate = :expiryDate"),
    @NamedQuery(name = "Certificates.findByStartDate", query = "SELECT c FROM Certificates c WHERE c.startDate = :startDate"),
    @NamedQuery(name = "Certificates.findByAttestedBy", query = "SELECT c FROM Certificates c WHERE c.attestedBy = :attestedBy"),
    @NamedQuery(name = "Certificates.findByPvtKeyLastBackupDate", query = "SELECT c FROM Certificates c WHERE c.pvtKeyLastBackupDate = :pvtKeyLastBackupDate"),
    @NamedQuery(name = "Certificates.findByKeyLength", query = "SELECT c FROM Certificates c WHERE c.keyLength = :keyLength")})
public class Certificates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "certificate_id")
    private int certificateId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "pvt_key_encryption_type")
    private String pvtKeyEncryptionType;
    @Size(max = 60)
    @Column(name = "pvt_key_encryption_type_desc")
    private String pvtKeyEncryptionTypeDesc;
    @Column(name = "is_active_for_begin_dialog")
    private Boolean isActiveForBeginDialog;
    @Size(max = 442)
    @Column(name = "issuer_name")
    private String issuerName;
    @Size(max = 64)
    @Column(name = "cert_serial_number")
    private String certSerialNumber;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Size(max = 128)
    @Column(name = "string_sid")
    private String stringSid;
    @Size(max = 4000)
    @Column(name = "subject")
    private String subject;
    @Column(name = "expiry_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;
    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "thumbprint")
    private byte[] thumbprint;
    @Size(max = 260)
    @Column(name = "attested_by")
    private String attestedBy;
    @Column(name = "pvt_key_last_backup_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pvtKeyLastBackupDate;
    @Column(name = "key_length")
    private Integer keyLength;

    public Certificates() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getPvtKeyEncryptionType() {
        return pvtKeyEncryptionType;
    }

    public void setPvtKeyEncryptionType(String pvtKeyEncryptionType) {
        this.pvtKeyEncryptionType = pvtKeyEncryptionType;
    }

    public String getPvtKeyEncryptionTypeDesc() {
        return pvtKeyEncryptionTypeDesc;
    }

    public void setPvtKeyEncryptionTypeDesc(String pvtKeyEncryptionTypeDesc) {
        this.pvtKeyEncryptionTypeDesc = pvtKeyEncryptionTypeDesc;
    }

    public Boolean getIsActiveForBeginDialog() {
        return isActiveForBeginDialog;
    }

    public void setIsActiveForBeginDialog(Boolean isActiveForBeginDialog) {
        this.isActiveForBeginDialog = isActiveForBeginDialog;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public String getCertSerialNumber() {
        return certSerialNumber;
    }

    public void setCertSerialNumber(String certSerialNumber) {
        this.certSerialNumber = certSerialNumber;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public String getStringSid() {
        return stringSid;
    }

    public void setStringSid(String stringSid) {
        this.stringSid = stringSid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public byte[] getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(byte[] thumbprint) {
        this.thumbprint = thumbprint;
    }

    public String getAttestedBy() {
        return attestedBy;
    }

    public void setAttestedBy(String attestedBy) {
        this.attestedBy = attestedBy;
    }

    public Date getPvtKeyLastBackupDate() {
        return pvtKeyLastBackupDate;
    }

    public void setPvtKeyLastBackupDate(Date pvtKeyLastBackupDate) {
        this.pvtKeyLastBackupDate = pvtKeyLastBackupDate;
    }

    public Integer getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
    }
    
}
