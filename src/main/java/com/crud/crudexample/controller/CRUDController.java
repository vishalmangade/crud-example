package com.crud.crudexample.controller;

import com.crud.crudexample.request.StudentRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CRUDController {
    @GetMapping("/")
    public String test(){
        return "Hello World";
    }
    @PostMapping("/saveStudent")
    public StudentRequest saveStudent(@RequestBody StudentRequest studentRequest){
        studentRequest.setId(1);
        return studentRequest;
    }
}
