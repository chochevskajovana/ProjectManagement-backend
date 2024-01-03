package com.example.project_management.service.implementations;

import com.example.project_management.models.TeamWorksOnProject;
import com.example.project_management.repository.TeamWorksOnProjectRepository;
import com.example.project_management.service.interfaces.TeamWorksOnProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamWorksOnProjectServiceImpl implements TeamWorksOnProjectService {

    private final TeamWorksOnProjectRepository teamWorksOnProjectRepository;

    public TeamWorksOnProjectServiceImpl(TeamWorksOnProjectRepository teamWorksOnProjectRepository) {
        this.teamWorksOnProjectRepository = teamWorksOnProjectRepository;
    }

    @Override
    public List<TeamWorksOnProject> findAll() {
        return this.teamWorksOnProjectRepository.findAll();
    }

    @Override
    public void addTeamWorksOnProject(Long projectId, Long teamId) {
        this.teamWorksOnProjectRepository.addTeamWorksOnProject(projectId.intValue(), teamId.intValue());
    }
}
