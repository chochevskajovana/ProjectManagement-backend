package com.example.project_management.service.implementations;

import com.example.project_management.models.views.ProjectDetailsView;
import com.example.project_management.repository.ProjectDetailsViewRepository;
import com.example.project_management.service.interfaces.ProjectDetailsViewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectDetailsViewServiceImpl implements ProjectDetailsViewService {

    private final ProjectDetailsViewRepository projectDetailsViewRepository;

    public ProjectDetailsViewServiceImpl(ProjectDetailsViewRepository projectDetailsViewRepository) {
        this.projectDetailsViewRepository = projectDetailsViewRepository;
    }

    @Override
    public List<ProjectDetailsView> findAll() {
        return this.projectDetailsViewRepository.findAll();
    }

//    @Override
//    public ProjectDetailsView findByProjectName(String name) {
//        return this.projectDetailsViewRepository.findByPr_name(name);
//    }
}
