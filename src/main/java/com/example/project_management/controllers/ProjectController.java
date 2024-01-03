package com.example.project_management.controllers;

import com.example.project_management.helpers.ProjectHelper;
import com.example.project_management.models.Project;
import com.example.project_management.service.interfaces.ProjectService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/project")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<Project> getAll(){
        return this.projectService.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/add")
    public void addNewProject(@RequestBody ProjectHelper projectHelper){
        this.projectService.addNewProject(projectHelper.getName(), projectHelper.getDescription(), projectHelper.getDateStarted(), projectHelper.getDateFinished(), projectHelper.getIsActive(), projectHelper.getImage(), projectHelper.getClientId());
    }
}
