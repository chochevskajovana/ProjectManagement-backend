package com.example.project_management.controllers;

import com.example.project_management.models.reports.CountOfEmployeesInTeamsPerProject;
import com.example.project_management.service.interfaces.CountOfEmployeesInTeamsPerProjectService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/count-of-employees-in-teams-per-project")
public class CountOfEmployeesInTeamsPerProjectController {

    private final CountOfEmployeesInTeamsPerProjectService countOfEmployeesInTeamsPerProjectService;


    public CountOfEmployeesInTeamsPerProjectController(CountOfEmployeesInTeamsPerProjectService countOfEmployeesInTeamsPerProjectService) {
        this.countOfEmployeesInTeamsPerProjectService = countOfEmployeesInTeamsPerProjectService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<CountOfEmployeesInTeamsPerProject> getAll() {
        return this.countOfEmployeesInTeamsPerProjectService.findAll();
    }
}


