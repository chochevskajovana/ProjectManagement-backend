package com.example.project_management.controllers;

import com.example.project_management.models.views.ProjectDetailsView;
import com.example.project_management.service.interfaces.ProjectDetailsViewService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/project-details")
public class ProjectDetailsViewController {

    private final ProjectDetailsViewService projectDetailsViewService;

    public ProjectDetailsViewController(ProjectDetailsViewService projectDetailsViewService) {
        this.projectDetailsViewService = projectDetailsViewService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<ProjectDetailsView> getAll(){
        return this.projectDetailsViewService.findAll();
    }

//    @Transactional(rollbackFor = Exception.class)
//    @GetMapping("/getProject/{name}")
//    public ProjectDetailsView getProject(@PathVariable String name){
//        return this.projectDetailsViewService.findByProjectName(name);
//    }

}
