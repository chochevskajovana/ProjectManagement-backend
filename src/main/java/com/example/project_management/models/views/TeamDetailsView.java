package com.example.project_management.models.views;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "teams_details")
public class TeamDetailsView {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_surname")
    private String employeeSurname;

    @Column(name = "project_name")
    private String projectName;
}
