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
@Table(name = "trace_event_bindings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraceEventBindings.findAll", query = "SELECT t FROM TraceEventBindings t"),
    @NamedQuery(name = "TraceEventBindings.findByTraceEventId", query = "SELECT t FROM TraceEventBindings t WHERE t.traceEventId = :traceEventId"),
    @NamedQuery(name = "TraceEventBindings.findByTraceColumnId", query = "SELECT t FROM TraceEventBindings t WHERE t.traceColumnId = :traceColumnId")})
public class TraceEventBindings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trace_event_id")
    private short traceEventId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trace_column_id")
    private short traceColumnId;

    public TraceEventBindings() {
    }

    public short getTraceEventId() {
        return traceEventId;
    }

    public void setTraceEventId(short traceEventId) {
        this.traceEventId = traceEventId;
    }

    public short getTraceColumnId() {
        return traceColumnId;
    }

    public void setTraceColumnId(short traceColumnId) {
        this.traceColumnId = traceColumnId;
    }
    
}
