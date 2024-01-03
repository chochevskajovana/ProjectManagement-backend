package com.example.project_management.repository;

import com.example.project_management.models.CompositeKeysModels.EmployeeIsPartOfTeamKey;
import com.example.project_management.models.EmployeeIsPartOfTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;

@Repository
public interface EmployeeIsPartOfTeamRepository extends JpaRepository<EmployeeIsPartOfTeam, EmployeeIsPartOfTeamKey> {

    @Modifying
    @Transactional
    @Query(value = "call add_employee_to_team(?1, ?2, ?3, ?4)", nativeQuery = true)
    void addEmployeeToTeam(Integer employeeId, Integer teamId, Date dateStarted, Date dateEnded);
}
