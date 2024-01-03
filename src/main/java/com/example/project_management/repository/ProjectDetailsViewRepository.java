package com.example.project_management.repository;

import com.example.project_management.models.views.ProjectDetailsView;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDetailsViewRepository extends ReadOnlyRepository<ProjectDetailsView, Integer>{
//    ProjectDetailsView findByPr_name(String name);
}
