package com.example.project_management.models.reports;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "count_of_technologies_on_type_of_project")
public class CountOfTechnologiesOnTypeOfProject {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "type_id")
    private Integer typeId;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "technologies_on_project_type_count")
    private Long technologiesOnProjectTypeCount;
}
