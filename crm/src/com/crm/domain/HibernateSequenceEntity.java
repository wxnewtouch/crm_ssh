package com.crm.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hibernate_sequence", schema = "crm_ssh")
public class HibernateSequenceEntity {
    private Long nextVal;

    @Basic
    @Column(name = "next_val")
    public Long getNextVal() {
        return nextVal;
    }

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HibernateSequenceEntity that = (HibernateSequenceEntity) o;
        return Objects.equals(nextVal, that.nextVal);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nextVal);
    }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
