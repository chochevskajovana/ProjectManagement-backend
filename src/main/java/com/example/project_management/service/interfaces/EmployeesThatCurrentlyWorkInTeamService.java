package com.example.project_management.service.interfaces;
import com.example.project_management.models.reports.EmployeesThatCurrentlyWorkInTeam;

import java.util.List;

public interface EmployeesThatCurrentlyWorkInTeamService {

    List<EmployeesThatCurrentlyWorkInTeam> findAll();
}
