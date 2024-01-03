package com.example.project_management.controllers;

import com.example.project_management.models.reports.CountProjectsAndEmployeesForTechnology;
import com.example.project_management.service.interfaces.CountProjectsAndEmployeesForTechnologyService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/count_projects_and_employees_that_use_technology")
public class CountProjectsAndEmployeesForTechnologyController {

    private final CountProjectsAndEmployeesForTechnologyService countProjectsAndEmployeesForTechnologyService;

    public CountProjectsAndEmployeesForTechnologyController(CountProjectsAndEmployeesForTechnologyService countProjectsAndEmployeesForTechnologyService) {
        this.countProjectsAndEmployeesForTechnologyService = countProjectsAndEmployeesForTechnologyService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<CountProjectsAndEmployeesForTechnology> getAll(){
        return this.countProjectsAndEmployeesForTechnologyService.findAll();
    }
}
