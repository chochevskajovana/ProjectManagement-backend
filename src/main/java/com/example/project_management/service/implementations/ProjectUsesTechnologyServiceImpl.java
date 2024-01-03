package com.example.project_management.service.implementations;

import com.example.project_management.models.ProjectUsesTechnology;
import com.example.project_management.repository.ProjectUsesTechnologyRepository;
import com.example.project_management.service.interfaces.ProjectUsesTechnologyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectUsesTechnologyServiceImpl implements ProjectUsesTechnologyService {

    private final ProjectUsesTechnologyRepository projectUsesTechnologyRepository;

    public ProjectUsesTechnologyServiceImpl(ProjectUsesTechnologyRepository projectUsesTechnologyRepository) {
        this.projectUsesTechnologyRepository = projectUsesTechnologyRepository;
    }

    @Override
    public void addProjectUsesTechnology(Integer projectId, Integer technologyId) {
        this.projectUsesTechnologyRepository.addProjectUsesTechnology(projectId, technologyId);
    }

    @Override
    public List<ProjectUsesTechnology> findAll() {
        return this.projectUsesTechnologyRepository.findAll();
    }
}
