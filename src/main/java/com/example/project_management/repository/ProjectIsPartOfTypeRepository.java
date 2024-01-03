package com.example.project_management.repository;

import com.example.project_management.models.CompositeKeysModels.ProjectIsPartOfTypeKey;
import com.example.project_management.models.ProjectIsPartOfType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectIsPartOfTypeRepository extends JpaRepository<ProjectIsPartOfType, ProjectIsPartOfTypeKey> {
}
