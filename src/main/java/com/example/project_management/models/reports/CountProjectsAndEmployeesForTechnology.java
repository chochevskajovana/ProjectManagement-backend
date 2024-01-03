package com.example.project_management.models.reports;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "count_projects_and_employees_that_use_technology")
public class CountProjectsAndEmployeesForTechnology {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "technology_id")
    private Integer technologyId;

    @Column(name = "technology_name")
    private String technologyName;

    @Column(name = "project_uses_technology_count")
    private Long projectUsesTechnologyCount;

    @Column(name = "employees_use_technology_count")
    private Long employeesUseTechnologyCount;
}
