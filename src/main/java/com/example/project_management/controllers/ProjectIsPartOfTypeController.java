package com.example.project_management.controllers;

import com.example.project_management.models.ProjectIsPartOfType;
import com.example.project_management.service.interfaces.ProjectIsPartOfTypeService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/project-is-part-of-type")
public class ProjectIsPartOfTypeController {

    private final ProjectIsPartOfTypeService projectIsPartOfTypeService;

    public ProjectIsPartOfTypeController(ProjectIsPartOfTypeService projectIsPartOfTypeService) {
        this.projectIsPartOfTypeService = projectIsPartOfTypeService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<ProjectIsPartOfType> getAll(){
        return this.projectIsPartOfTypeService.findAll();
    }

}
