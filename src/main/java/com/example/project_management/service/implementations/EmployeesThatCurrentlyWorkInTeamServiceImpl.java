package com.example.project_management.service.implementations;

import com.example.project_management.models.reports.EmployeesThatCurrentlyWorkInTeam;
import com.example.project_management.repository.EmployeesThatCurrentlyWorkInTeamRepository;
import com.example.project_management.service.interfaces.EmployeesThatCurrentlyWorkInTeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesThatCurrentlyWorkInTeamServiceImpl implements EmployeesThatCurrentlyWorkInTeamService {

    private final EmployeesThatCurrentlyWorkInTeamRepository employeesThatCurrentlyWorkInTeamRepository;

    public EmployeesThatCurrentlyWorkInTeamServiceImpl(EmployeesThatCurrentlyWorkInTeamRepository employeesThatCurrentlyWorkInTeamRepository) {
        this.employeesThatCurrentlyWorkInTeamRepository = employeesThatCurrentlyWorkInTeamRepository;
    }

    @Override
    public List<EmployeesThatCurrentlyWorkInTeam> findAll() {
        return this.employeesThatCurrentlyWorkInTeamRepository.findAll();
    }
}
