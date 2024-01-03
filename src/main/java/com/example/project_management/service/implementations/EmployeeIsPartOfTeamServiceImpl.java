package com.example.project_management.service.implementations;

import com.example.project_management.models.EmployeeIsPartOfTeam;
import com.example.project_management.repository.EmployeeIsPartOfTeamRepository;
import com.example.project_management.service.interfaces.EmployeeIsPartOfTeamService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeIsPartOfTeamServiceImpl implements EmployeeIsPartOfTeamService {

    private final EmployeeIsPartOfTeamRepository employeeIsPartOfTeamRepository;

    public EmployeeIsPartOfTeamServiceImpl(EmployeeIsPartOfTeamRepository repository) {
        this.employeeIsPartOfTeamRepository = repository;
    }

    @Override
    public List<EmployeeIsPartOfTeam> findAll() {
        return this.employeeIsPartOfTeamRepository.findAll();
    }

    @Override
    public void addEmployeeToTeam(Long employeeId, Long teamId, Date dateStarted, Date dateEnded) {
        this.employeeIsPartOfTeamRepository.addEmployeeToTeam(employeeId.intValue(), teamId.intValue(), dateStarted, dateEnded);
    }

}
