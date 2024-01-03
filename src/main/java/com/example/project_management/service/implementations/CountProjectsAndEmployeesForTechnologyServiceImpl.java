package com.example.project_management.service.implementations;

import com.example.project_management.models.reports.CountProjectsAndEmployeesForTechnology;
import com.example.project_management.repository.ProjectsAndCountOfEmployeesForTechnologyRepository;
import com.example.project_management.service.interfaces.CountProjectsAndEmployeesForTechnologyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountProjectsAndEmployeesForTechnologyServiceImpl implements CountProjectsAndEmployeesForTechnologyService {

    private final ProjectsAndCountOfEmployeesForTechnologyRepository projectsAndCountOfEmployeesForTechnologyRepository;

    public CountProjectsAndEmployeesForTechnologyServiceImpl(ProjectsAndCountOfEmployeesForTechnologyRepository projectsAndCountOfEmployeesForTechnologyRepository) {
        this.projectsAndCountOfEmployeesForTechnologyRepository = projectsAndCountOfEmployeesForTechnologyRepository;
    }

    @Override
    public List<CountProjectsAndEmployeesForTechnology> findAll() {
        return this.projectsAndCountOfEmployeesForTechnologyRepository.findAll();
    }
}
