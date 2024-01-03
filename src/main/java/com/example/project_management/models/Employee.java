package com.example.project_management.models;

import com.example.project_management.models.CompositeKeysModels.EmployeeWorksWithTechnologyKey;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "em_name")
    private String emName;

    @Column(name = "em_surname")
    private String emSurname;

    @Column(name = "em_email")
    private String emEmail;

    @Column(name = "experience")
    private Integer experience;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private EmployeeRole roleId;

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    List<EmployeeIsPartOfTeam> employeeIsPartOfTeamList;

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    List<EmployeeWorksWithTechnology> employeeWorksWithTechnologyKeyList;
}
