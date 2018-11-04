package com.muru.learn.mathapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AddServiceImpl implements AddService {

    @Autowired
    private AddRepository addRepository;

    @Override
    public Integer add(Integer first, Integer second) {
        MathAdd mathAdd = new MathAdd();
        mathAdd.setId(1l);
        mathAdd.setFirst(first);
        mathAdd.setDateCreated(new Date());
        mathAdd.setDateUpdated(new Date());
        mathAdd.setSecond(second);
        addRepository.save(mathAdd);
        return first + second;
    }
}
