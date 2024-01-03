package com.example.project_management.service.interfaces;

import com.example.project_management.models.EmployeeIsPartOfTeam;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EmployeeIsPartOfTeamService {

    List<EmployeeIsPartOfTeam> findAll();

    void addEmployeeToTeam(Long employeeId, Long teamId, Date dateStarted, Date dateEnded);
}
