package com.example.project_management.models.reports;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "employees_that_currently_work_in_team")
public class EmployeesThatCurrentlyWorkInTeam {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_surname")
    private String employeeSurname;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "date_started")
    private Date dateStarted;

    @Column(name = "date_ended")
    private Date dateEnded;


}
