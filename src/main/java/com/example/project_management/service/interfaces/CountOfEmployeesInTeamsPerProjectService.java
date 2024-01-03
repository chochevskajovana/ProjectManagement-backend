package com.example.project_management.service.interfaces;
import com.example.project_management.models.reports.CountOfEmployeesInTeamsPerProject;

import java.util.List;

public interface CountOfEmployeesInTeamsPerProjectService {

    List<CountOfEmployeesInTeamsPerProject> findAll();
}
