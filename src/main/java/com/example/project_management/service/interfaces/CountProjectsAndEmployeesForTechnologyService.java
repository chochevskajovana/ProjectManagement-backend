package com.example.project_management.service.interfaces;
import com.example.project_management.models.reports.CountProjectsAndEmployeesForTechnology;

import java.util.List;

public interface CountProjectsAndEmployeesForTechnologyService {

    List<CountProjectsAndEmployeesForTechnology> findAll();
}
