package com.example.project_management.controllers;

import com.example.project_management.helpers.ProjectUsesTechnologyHelper;
import com.example.project_management.models.ProjectUsesTechnology;
import com.example.project_management.service.interfaces.ProjectUsesTechnologyService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/project-uses-technology")
public class ProjectUsesTechnologyController {

    private final ProjectUsesTechnologyService projectUsesTechnologyService;

    public ProjectUsesTechnologyController(ProjectUsesTechnologyService projectUsesTechnologyService) {
        this.projectUsesTechnologyService = projectUsesTechnologyService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<ProjectUsesTechnology> getAll(){
        return this.projectUsesTechnologyService.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("/add")
    public void addProjectUsesTechnology(@RequestBody ProjectUsesTechnologyHelper projectUsesTechnologyHelper){
        this.projectUsesTechnologyService.addProjectUsesTechnology(projectUsesTechnologyHelper.getProjectId(), projectUsesTechnologyHelper.getTechnologyId());
    }

}
