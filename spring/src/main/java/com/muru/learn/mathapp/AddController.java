package com.muru.learn.mathapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RequestMapping(value = "math/add")
public class AddController {
    @Autowired
    public AddService addService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<ResultDto> add(Integer first, Integer second) {
        ResultDto resultDto = new ResultDto();
        resultDto.setResult(addService.add(first, second));
        return new ResponseEntity(resultDto, HttpStatus.CREATED);
    }
}
