package com.example.project_management.service.interfaces;

import com.example.project_management.models.views.ProjectDetailsView;

import java.util.List;

public interface ProjectDetailsViewService {

    List<ProjectDetailsView> findAll();

//    ProjectDetailsView findByProjectName(String name);
}
