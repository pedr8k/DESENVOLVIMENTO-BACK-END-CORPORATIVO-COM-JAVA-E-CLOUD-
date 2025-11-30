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
@Table(name = "numbered_procedures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NumberedProcedures.findAll", query = "SELECT n FROM NumberedProcedures n"),
    @NamedQuery(name = "NumberedProcedures.findByObjectId", query = "SELECT n FROM NumberedProcedures n WHERE n.objectId = :objectId"),
    @NamedQuery(name = "NumberedProcedures.findByProcedureNumber", query = "SELECT n FROM NumberedProcedures n WHERE n.procedureNumber = :procedureNumber"),
    @NamedQuery(name = "NumberedProcedures.findByDefinition", query = "SELECT n FROM NumberedProcedures n WHERE n.definition = :definition")})
public class NumberedProcedures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "object_id")
    private int objectId;
    @Column(name = "procedure_number")
    private Short procedureNumber;
    @Size(max = 2147483647)
    @Column(name = "definition")
    private String definition;

    public NumberedProcedures() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Short getProcedureNumber() {
        return procedureNumber;
    }

    public void setProcedureNumber(Short procedureNumber) {
        this.procedureNumber = procedureNumber;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
    
}
