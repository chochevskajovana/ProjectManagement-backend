package com.example.project_management.repository;

import com.example.project_management.models.reports.CountOfEmployeesInTeamsPerProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountOfEmployeesInTeamsPerProjectRepository extends JpaRepository<CountOfEmployeesInTeamsPerProject, Long> {
}
