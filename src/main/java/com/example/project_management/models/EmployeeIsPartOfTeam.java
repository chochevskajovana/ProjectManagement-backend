package com.example.project_management.models;

import com.example.project_management.models.CompositeKeysModels.EmployeeIsPartOfTeamKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "employee_is_part_of_team")
public class EmployeeIsPartOfTeam {

    @EmbeddedId
    EmployeeIsPartOfTeamKey id;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @MapsId("teamId")
    @JoinColumn(name = "team_id")
    private Team team;

    @Column(name = "date_started")
    private Date dateStarted;

    @Column(name = "date_ended")
    private Date dateEnded;
}
