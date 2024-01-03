package com.example.project_management.repository;

import com.example.project_management.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDate;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

    @Modifying
    @Transactional
    @Query(value = "call insert_new_project(?1, ?2, ?3, ?4, ?5, ?6, ?7)", nativeQuery = true)
    void addNewProject(String name, String description, Date dateStarted, Date dateFinished, Boolean isActive, String Image, Integer clientId);
}
