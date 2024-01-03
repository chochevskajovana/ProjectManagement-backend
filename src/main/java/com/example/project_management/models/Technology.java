package com.example.project_management.models;

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
@Table(name = "technology")
public class Technology {
    @Id
    @Column(name = "technology_id")
    private Integer technologyId;

    @Column(name = "te_name")
    private String teName;

    @Column(name = "te_type")
    private String teType;

    @OneToMany(mappedBy = "technology")
    @JsonIgnore
    List<EmployeeWorksWithTechnology> employeeWorksWithTechnologyList;

    @OneToMany(mappedBy = "technology")
    @JsonIgnore
    List<ProjectUsesTechnology> projectUsesTechnologyList;
}
