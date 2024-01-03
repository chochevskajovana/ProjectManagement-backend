package com.example.project_management.service.implementations;

import com.example.project_management.models.reports.CountOfEmployeesInTeamsPerProject;
import com.example.project_management.repository.CountOfEmployeesInTeamsPerProjectRepository;
import com.example.project_management.service.interfaces.CountOfEmployeesInTeamsPerProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountOfEmployeesInTeamsPerProjectServiceImpl implements CountOfEmployeesInTeamsPerProjectService {

    private final CountOfEmployeesInTeamsPerProjectRepository countOfEmployeesInTeamsPerProjectRepository;

    public CountOfEmployeesInTeamsPerProjectServiceImpl(CountOfEmployeesInTeamsPerProjectRepository countOfEmployeesInTeamsPerProjectRepository) {
        this.countOfEmployeesInTeamsPerProjectRepository = countOfEmployeesInTeamsPerProjectRepository;
    }

    @Override
    public List<CountOfEmployeesInTeamsPerProject> findAll() {
        return this.countOfEmployeesInTeamsPerProjectRepository.findAll();
    }
}
