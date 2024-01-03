package com.example.project_management.models.reports;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.math.BigInteger;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Immutable
@Table(name = "count_of_employees_in_teams_per_project")
public class CountOfEmployeesInTeamsPerProject {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "employees_in_teams_on_project_count")
    private Long employeesInTeamsOnProjectCount;
}
