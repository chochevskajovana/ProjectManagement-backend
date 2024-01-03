package com.example.project_management.controllers;

import com.example.project_management.helpers.EmployeeIsPartOfTeamHelper;
import com.example.project_management.models.EmployeeIsPartOfTeam;
import com.example.project_management.service.interfaces.EmployeeIsPartOfTeamService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/employee-is-part-of-team")
public class EmployeeIsPartOfTeamController {

    private final EmployeeIsPartOfTeamService employeeIsPartOfTeamService;

    public EmployeeIsPartOfTeamController(EmployeeIsPartOfTeamService employeeIsPartOfTeamService) {
        this.employeeIsPartOfTeamService = employeeIsPartOfTeamService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<EmployeeIsPartOfTeam> getAll(){
        return this.employeeIsPartOfTeamService.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/add")
    public void addEmployeeToTeam(@RequestBody EmployeeIsPartOfTeamHelper employeeIsPartOfTeamHelper){
        this.employeeIsPartOfTeamService.addEmployeeToTeam(employeeIsPartOfTeamHelper.getEmployeeId(), employeeIsPartOfTeamHelper.getTeamId(), employeeIsPartOfTeamHelper.getDateStarted(), employeeIsPartOfTeamHelper.getDateEnded());
    }
}
