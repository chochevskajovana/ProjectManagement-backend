package com.example.project_management.service.interfaces;

import com.example.project_management.models.ProjectUsesTechnology;

import java.util.List;

public interface ProjectUsesTechnologyService {

    void addProjectUsesTechnology(Integer projectId, Integer technologyId);

    List<ProjectUsesTechnology> findAll();
}
