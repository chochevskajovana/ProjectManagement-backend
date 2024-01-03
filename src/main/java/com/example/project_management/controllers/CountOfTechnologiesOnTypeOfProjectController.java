package com.example.project_management.controllers;

import com.example.project_management.models.reports.CountOfTechnologiesOnTypeOfProject;
import com.example.project_management.service.interfaces.CountOfTechnologiesOnTypeOfProjectService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/count_of_technologies_on_type_of_project")
public class CountOfTechnologiesOnTypeOfProjectController {

    private final CountOfTechnologiesOnTypeOfProjectService countOfTechnologiesOnTypeOfProjectService;

    public CountOfTechnologiesOnTypeOfProjectController(CountOfTechnologiesOnTypeOfProjectService countOfTechnologiesOnTypeOfProjectService) {
        this.countOfTechnologiesOnTypeOfProjectService = countOfTechnologiesOnTypeOfProjectService;
    }

    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/getAll")
    public List<CountOfTechnologiesOnTypeOfProject> getAll(){
      return this.countOfTechnologiesOnTypeOfProjectService.findAll();
    }
}
