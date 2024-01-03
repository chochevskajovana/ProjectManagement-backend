package com.example.project_management.models;

import com.example.project_management.models.CompositeKeysModels.EmployeeWorksWithTechnologyKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "employee_works_with_technology")
public class EmployeeWorksWithTechnology {

    @EmbeddedId
    EmployeeWorksWithTechnologyKey id;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @MapsId("technologyId")
    @JoinColumn(name = "technology_id")
    private Technology technology;
}
