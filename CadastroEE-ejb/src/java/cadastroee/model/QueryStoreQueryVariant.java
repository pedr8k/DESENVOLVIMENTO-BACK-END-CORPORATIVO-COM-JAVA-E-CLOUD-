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
@Table(name = "query_store_query_variant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QueryStoreQueryVariant.findAll", query = "SELECT q FROM QueryStoreQueryVariant q"),
    @NamedQuery(name = "QueryStoreQueryVariant.findByQueryVariantQueryId", query = "SELECT q FROM QueryStoreQueryVariant q WHERE q.queryVariantQueryId = :queryVariantQueryId"),
    @NamedQuery(name = "QueryStoreQueryVariant.findByParentQueryId", query = "SELECT q FROM QueryStoreQueryVariant q WHERE q.parentQueryId = :parentQueryId"),
    @NamedQuery(name = "QueryStoreQueryVariant.findByDispatcherPlanId", query = "SELECT q FROM QueryStoreQueryVariant q WHERE q.dispatcherPlanId = :dispatcherPlanId")})
public class QueryStoreQueryVariant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "query_variant_query_id")
    private long queryVariantQueryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "parent_query_id")
    private long parentQueryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dispatcher_plan_id")
    private long dispatcherPlanId;

    public QueryStoreQueryVariant() {
    }

    public long getQueryVariantQueryId() {
        return queryVariantQueryId;
    }

    public void setQueryVariantQueryId(long queryVariantQueryId) {
        this.queryVariantQueryId = queryVariantQueryId;
    }

    public long getParentQueryId() {
        return parentQueryId;
    }

    public void setParentQueryId(long parentQueryId) {
        this.parentQueryId = parentQueryId;
    }

    public long getDispatcherPlanId() {
        return dispatcherPlanId;
    }

    public void setDispatcherPlanId(long dispatcherPlanId) {
        this.dispatcherPlanId = dispatcherPlanId;
    }
    
}
