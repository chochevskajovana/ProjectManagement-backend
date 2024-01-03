package com.example.project_management.service.implementations;

import com.example.project_management.models.ProjectIsPartOfType;
import com.example.project_management.repository.ProjectIsPartOfTypeRepository;
import com.example.project_management.service.interfaces.ProjectIsPartOfTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectIsPartOfTypeServiceImpl implements ProjectIsPartOfTypeService {

    private final ProjectIsPartOfTypeRepository projectIsPartOfTypeRepository;

    public ProjectIsPartOfTypeServiceImpl(ProjectIsPartOfTypeRepository projectIsPartOfTypeRepository) {
        this.projectIsPartOfTypeRepository = projectIsPartOfTypeRepository;
    }

    @Override
    public List<ProjectIsPartOfType> findAll() {
        return this.projectIsPartOfTypeRepository.findAll();
    }
}
