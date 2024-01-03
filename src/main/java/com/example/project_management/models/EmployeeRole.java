package com.example.project_management.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "employee_role")
public class EmployeeRole {
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "ro_name")
    private String roName;
}
