package com.example.project_management.service.interfaces;

import com.example.project_management.models.Project;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface ProjectService {

    List<Project> findAll();

    void addNewProject(String name, String description, Date dateStarted, Date dateFinished, Boolean isActive, String Image, Integer clientId);
}
