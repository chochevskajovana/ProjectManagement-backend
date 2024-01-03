package com.example.project_management.service.implementations;

import com.example.project_management.models.Team;
import com.example.project_management.repository.TeamRepository;
import com.example.project_management.service.interfaces.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public List<Team> findAll() {
        return this.teamRepository.findAll();
    }
}
