package com.muru.learn.mathapp;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.io.Serializable;

public class ResultDto implements Serializable {
    private Integer result;

    public Integer getResult() { return result; }

    public void setResult(Integer result) {
        this.result = result;
    }
}
