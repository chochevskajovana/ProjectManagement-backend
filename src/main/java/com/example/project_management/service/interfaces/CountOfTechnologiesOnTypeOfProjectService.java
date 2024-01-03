package com.example.project_management.service.interfaces;
import com.example.project_management.models.reports.CountOfTechnologiesOnTypeOfProject;

import java.util.List;

public interface CountOfTechnologiesOnTypeOfProjectService {

    List<CountOfTechnologiesOnTypeOfProject> findAll();
}
