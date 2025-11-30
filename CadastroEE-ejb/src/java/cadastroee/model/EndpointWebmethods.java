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
@Table(name = "endpoint_webmethods")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EndpointWebmethods.findAll", query = "SELECT e FROM EndpointWebmethods e"),
    @NamedQuery(name = "EndpointWebmethods.findByEndpointId", query = "SELECT e FROM EndpointWebmethods e WHERE e.endpointId = :endpointId"),
    @NamedQuery(name = "EndpointWebmethods.findByNamespace", query = "SELECT e FROM EndpointWebmethods e WHERE e.namespace = :namespace"),
    @NamedQuery(name = "EndpointWebmethods.findByMethodAlias", query = "SELECT e FROM EndpointWebmethods e WHERE e.methodAlias = :methodAlias"),
    @NamedQuery(name = "EndpointWebmethods.findByObjectName", query = "SELECT e FROM EndpointWebmethods e WHERE e.objectName = :objectName"),
    @NamedQuery(name = "EndpointWebmethods.findByResultSchema", query = "SELECT e FROM EndpointWebmethods e WHERE e.resultSchema = :resultSchema"),
    @NamedQuery(name = "EndpointWebmethods.findByResultSchemaDesc", query = "SELECT e FROM EndpointWebmethods e WHERE e.resultSchemaDesc = :resultSchemaDesc"),
    @NamedQuery(name = "EndpointWebmethods.findByResultFormat", query = "SELECT e FROM EndpointWebmethods e WHERE e.resultFormat = :resultFormat"),
    @NamedQuery(name = "EndpointWebmethods.findByResultFormatDesc", query = "SELECT e FROM EndpointWebmethods e WHERE e.resultFormatDesc = :resultFormatDesc")})
public class EndpointWebmethods implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "endpoint_id")
    private int endpointId;
    @Size(max = 384)
    @Column(name = "namespace")
    private String namespace;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "method_alias")
    private String methodAlias;
    @Size(max = 776)
    @Column(name = "object_name")
    private String objectName;
    @Column(name = "result_schema")
    private Short resultSchema;
    @Size(max = 60)
    @Column(name = "result_schema_desc")
    private String resultSchemaDesc;
    @Column(name = "result_format")
    private Short resultFormat;
    @Size(max = 60)
    @Column(name = "result_format_desc")
    private String resultFormatDesc;

    public EndpointWebmethods() {
    }

    public int getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(int endpointId) {
        this.endpointId = endpointId;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getMethodAlias() {
        return methodAlias;
    }

    public void setMethodAlias(String methodAlias) {
        this.methodAlias = methodAlias;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Short getResultSchema() {
        return resultSchema;
    }

    public void setResultSchema(Short resultSchema) {
        this.resultSchema = resultSchema;
    }

    public String getResultSchemaDesc() {
        return resultSchemaDesc;
    }

    public void setResultSchemaDesc(String resultSchemaDesc) {
        this.resultSchemaDesc = resultSchemaDesc;
    }

    public Short getResultFormat() {
        return resultFormat;
    }

    public void setResultFormat(Short resultFormat) {
        this.resultFormat = resultFormat;
    }

    public String getResultFormatDesc() {
        return resultFormatDesc;
    }

    public void setResultFormatDesc(String resultFormatDesc) {
        this.resultFormatDesc = resultFormatDesc;
    }
    
}
