package com.example.project_management.controllers;

import com.example.project_management.helpers.TeamWorksOnProjectHelper;
import com.example.project_management.models.TeamWorksOnProject;
import com.example.project_management.service.interfaces.TeamWorksOnProjectService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/team-works-on-project")
public class TeamWorksOnProjectController {

    private final TeamWorksOnProjectService teamWorksOnProjectService;

    public TeamWorksOnProjectController(TeamWorksOnProjectService teamWorksOnProjectService) {
        this.teamWorksOnProjectService = teamWorksOnProjectService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<TeamWorksOnProject> getAll(){
        return this.teamWorksOnProjectService.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/add")
    void addTeamWorksOnProject(@RequestBody TeamWorksOnProjectHelper teamWorksOnProjectHelper){
        this.teamWorksOnProjectService.addTeamWorksOnProject(teamWorksOnProjectHelper.getProjectId(), teamWorksOnProjectHelper.getTeamId());
    }
}
