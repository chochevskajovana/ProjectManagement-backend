package com.example.project_management.controllers;

import com.example.project_management.models.views.EmployeeDetailsView;
import com.example.project_management.service.interfaces.EmployeeDetailsViewService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/employee-details")
public class EmployeeDetailsViewController {

    private final EmployeeDetailsViewService employeeDetailsViewService;

    public EmployeeDetailsViewController(EmployeeDetailsViewService employeeDetailsViewService) {
        this.employeeDetailsViewService = employeeDetailsViewService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<EmployeeDetailsView> getAll(){
        return this.employeeDetailsViewService.findAll();
    }
}
