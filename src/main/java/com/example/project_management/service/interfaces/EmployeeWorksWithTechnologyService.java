package com.example.project_management.service.interfaces;

import com.example.project_management.models.EmployeeWorksWithTechnology;

import java.util.List;

public interface EmployeeWorksWithTechnologyService {

    List<EmployeeWorksWithTechnology> findAll();

    void addEmployeeWorksWithTechnology(Long employeeId, Long technologyId);

}
