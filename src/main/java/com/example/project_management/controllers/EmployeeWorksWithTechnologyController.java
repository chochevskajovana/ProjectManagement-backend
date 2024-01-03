package com.example.project_management.controllers;

import com.example.project_management.helpers.EmployeeWorksWithTechnologyHelper;
import com.example.project_management.models.EmployeeWorksWithTechnology;
import com.example.project_management.service.interfaces.EmployeeWorksWithTechnologyService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/employee-works-with-technology")
public class EmployeeWorksWithTechnologyController {

    private final EmployeeWorksWithTechnologyService employeeWorksWithTechnologyService;

    public EmployeeWorksWithTechnologyController(EmployeeWorksWithTechnologyService employeeWorksWithTechnologyService) {
        this.employeeWorksWithTechnologyService = employeeWorksWithTechnologyService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<EmployeeWorksWithTechnology> getAll(){
        return this.employeeWorksWithTechnologyService.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/add")
    public void addEmployeeWorksWithTechnology(@RequestBody EmployeeWorksWithTechnologyHelper employeeWorksWithTechnologyHelper){
        this.employeeWorksWithTechnologyService.addEmployeeWorksWithTechnology(employeeWorksWithTechnologyHelper.getEmployeeId(), employeeWorksWithTechnologyHelper.getTechnologyId());
    }
}
