package com.muru.learn.mathapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class Base implements Serializable {
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    public Date dateCreated;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    public Date dateUpdated;

    public Date getDateCreated() { return dateCreated; }

    public Date getDateUpdated() {return dateUpdated; }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
