package com.example.project_management.service.implementations;

import com.example.project_management.models.Project;
import com.example.project_management.repository.ProjectRepository;
import com.example.project_management.service.interfaces.ProjectService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> findAll() {
        return this.projectRepository.findAll();
    }

    @Override
    public void addNewProject(String name, String description, Date dateStarted, Date dateFinished, Boolean isActive, String Image, Integer clientId) {
        this.projectRepository.addNewProject(name, description, dateStarted, dateFinished, isActive, Image, clientId);
    }
}
