package com.example.project_management.service.interfaces;

import com.example.project_management.models.TeamWorksOnProject;

import java.util.List;

public interface TeamWorksOnProjectService {

    List<TeamWorksOnProject> findAll();

    void addTeamWorksOnProject(Long projectId, Long teamId);
}
