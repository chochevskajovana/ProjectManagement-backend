package com.example.project_management.controllers;

import com.example.project_management.models.views.TeamDetailsView;
import com.example.project_management.service.interfaces.TeamDetailsViewService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/team-details")
public class TeamDetailsViewController {

    private final TeamDetailsViewService teamDetailsViewService;

    public TeamDetailsViewController(TeamDetailsViewService teamDetailsViewService) {
        this.teamDetailsViewService = teamDetailsViewService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<TeamDetailsView> getAll(){
        return this.teamDetailsViewService.findAll();
    }
}
