package com.example.project_management.repository;

import com.example.project_management.models.CompositeKeysModels.ProjectUsesTechnologyKey;
import com.example.project_management.models.ProjectUsesTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProjectUsesTechnologyRepository extends JpaRepository<ProjectUsesTechnology, ProjectUsesTechnologyKey> {

    @Modifying
    @Transactional
    @Query(value = "call add_project_uses_technology(?1, ?2)", nativeQuery = true)
    void addProjectUsesTechnology(Integer projectId, Integer technologyId);

}
