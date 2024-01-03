package com.example.project_management.service.implementations;

import com.example.project_management.models.views.TeamDetailsView;
import com.example.project_management.repository.TeamDetailsViewRepository;
import com.example.project_management.service.interfaces.TeamDetailsViewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamDetailsViewServiceImpl implements TeamDetailsViewService {

    private final TeamDetailsViewRepository teamDetailsViewRepository;

    public TeamDetailsViewServiceImpl(TeamDetailsViewRepository repository) {
        this.teamDetailsViewRepository = repository;
    }

    @Override
    public List<TeamDetailsView> findAll() {
        return this.teamDetailsViewRepository.findAll();
    }
}
