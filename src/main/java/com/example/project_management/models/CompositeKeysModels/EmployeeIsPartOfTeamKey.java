package com.example.project_management.models.CompositeKeysModels;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class EmployeeIsPartOfTeamKey implements Serializable {

    @Column(name = "employee_id")
    Integer employeeId;

    @Column(name = "team_id")
    Integer teamId;
}
