package com.muru.learn.mathapp;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name="MathAdd")
public class MathAdd extends Base {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column
    public Integer first;

    @Column
    public Integer second;

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFirst() { return first; }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() { return second; }

    public void setSecond(Integer second) {
        this.second = second;
    }
}
