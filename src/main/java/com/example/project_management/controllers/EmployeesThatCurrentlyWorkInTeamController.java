package com.example.project_management.controllers;

import com.example.project_management.models.reports.EmployeesThatCurrentlyWorkInTeam;
import com.example.project_management.service.interfaces.EmployeesThatCurrentlyWorkInTeamService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/employees_that_currently_work_in_team")
public class EmployeesThatCurrentlyWorkInTeamController {

    private final EmployeesThatCurrentlyWorkInTeamService employeesThatCurrentlyWorkInTeamService;

    public EmployeesThatCurrentlyWorkInTeamController(EmployeesThatCurrentlyWorkInTeamService employeesThatCurrentlyWorkInTeamService) {
        this.employeesThatCurrentlyWorkInTeamService = employeesThatCurrentlyWorkInTeamService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<EmployeesThatCurrentlyWorkInTeam> getAll(){
        return this.employeesThatCurrentlyWorkInTeamService.findAll();
    }
}
