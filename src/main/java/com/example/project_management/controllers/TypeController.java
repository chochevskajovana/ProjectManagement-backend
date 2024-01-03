package com.example.project_management.controllers;

import com.example.project_management.models.Type;
import com.example.project_management.service.interfaces.TypeService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/type")
public class TypeController {

    private final TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<Type> getAll(){
        return this.typeService.findAll();
    }

}
