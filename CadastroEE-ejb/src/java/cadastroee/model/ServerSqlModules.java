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
@Table(name = "server_sql_modules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServerSqlModules.findAll", query = "SELECT s FROM ServerSqlModules s"),
    @NamedQuery(name = "ServerSqlModules.findByObjectId", query = "SELECT s FROM ServerSqlModules s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "ServerSqlModules.findByDefinition", query = "SELECT s FROM ServerSqlModules s WHERE s.definition = :definition"),
    @NamedQuery(name = "ServerSqlModules.findByUsesAnsiNulls", query = "SELECT s FROM ServerSqlModules s WHERE s.usesAnsiNulls = :usesAnsiNulls"),
    @NamedQuery(name = "ServerSqlModules.findByUsesQuotedIdentifier", query = "SELECT s FROM ServerSqlModules s WHERE s.usesQuotedIdentifier = :usesQuotedIdentifier"),
    @NamedQuery(name = "ServerSqlModules.findByExecuteAsPrincipalId", query = "SELECT s FROM ServerSqlModules s WHERE s.executeAsPrincipalId = :executeAsPrincipalId")})
public class ServerSqlModules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Size(max = 2147483647)
    @Column(name = "definition")
    private String definition;
    @Column(name = "uses_ansi_nulls")
    private Boolean usesAnsiNulls;
    @Column(name = "uses_quoted_identifier")
    private Boolean usesQuotedIdentifier;
    @Column(name = "execute_as_principal_id")
    private Integer executeAsPrincipalId;

    public ServerSqlModules() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Boolean getUsesAnsiNulls() {
        return usesAnsiNulls;
    }

    public void setUsesAnsiNulls(Boolean usesAnsiNulls) {
        this.usesAnsiNulls = usesAnsiNulls;
    }

    public Boolean getUsesQuotedIdentifier() {
        return usesQuotedIdentifier;
    }

    public void setUsesQuotedIdentifier(Boolean usesQuotedIdentifier) {
        this.usesQuotedIdentifier = usesQuotedIdentifier;
    }

    public Integer getExecuteAsPrincipalId() {
        return executeAsPrincipalId;
    }

    public void setExecuteAsPrincipalId(Integer executeAsPrincipalId) {
        this.executeAsPrincipalId = executeAsPrincipalId;
    }
    
}
