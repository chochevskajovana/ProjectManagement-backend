package com.example.project_management.repository;

import com.example.project_management.models.reports.CountOfTechnologiesOnTypeOfProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountOfTechnologiesOnTypeOfProjectRepository extends JpaRepository<CountOfTechnologiesOnTypeOfProject, Long> {
}
