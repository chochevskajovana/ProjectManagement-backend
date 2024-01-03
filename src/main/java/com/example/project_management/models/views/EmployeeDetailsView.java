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
@Table(name = "employee_details")
public class EmployeeDetailsView {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "technology")
    private String technology;

    @Column(name = "role")
    private String role;

    @Column(name = "team")
    private String team;
}
