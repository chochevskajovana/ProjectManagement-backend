package com.example.project_management.repository;

import com.example.project_management.models.CompositeKeysModels.TeamWorksOnProjectKey;
import com.example.project_management.models.TeamWorksOnProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TeamWorksOnProjectRepository extends JpaRepository<TeamWorksOnProject, TeamWorksOnProjectKey> {

    @Modifying
    @Transactional
    @Query(value = "call add_team_that_works_on_project(?1, ?2)", nativeQuery = true)
    void addTeamWorksOnProject(Integer projectId, Integer teamId);

}
