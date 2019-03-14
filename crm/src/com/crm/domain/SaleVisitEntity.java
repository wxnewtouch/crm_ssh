package com.crm.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "sale_visit", schema = "crm_ssh")
public class SaleVisitEntity {
    private String visitId;
    private Date visitTime;
    private String visitAddr;
    private String visitDetail;
    private Date visitNexttime;

    @Id
    @Column(name = "visit_id")
    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    @Basic
    @Column(name = "visit_time")
    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    @Basic
    @Column(name = "visit_addr")
    public String getVisitAddr() {
        return visitAddr;
    }

    public void setVisitAddr(String visitAddr) {
        this.visitAddr = visitAddr;
    }

    @Basic
    @Column(name = "visit_detail")
    public String getVisitDetail() {
        return visitDetail;
    }

    public void setVisitDetail(String visitDetail) {
        this.visitDetail = visitDetail;
    }

    @Basic
    @Column(name = "visit_nexttime")
    public Date getVisitNexttime() {
        return visitNexttime;
    }

    public void setVisitNexttime(Date visitNexttime) {
        this.visitNexttime = visitNexttime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleVisitEntity that = (SaleVisitEntity) o;
        return Objects.equals(visitId, that.visitId) &&
                Objects.equals(visitTime, that.visitTime) &&
                Objects.equals(visitAddr, that.visitAddr) &&
                Objects.equals(visitDetail, that.visitDetail) &&
                Objects.equals(visitNexttime, that.visitNexttime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(visitId, visitTime, visitAddr, visitDetail, visitNexttime);
    }
}
