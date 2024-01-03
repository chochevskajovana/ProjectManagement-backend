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
@Table(name = "project_details")
public class ProjectDetailsView {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "technology")
    private String technologyName;

    @Column(name = "type")
    private String typeName;

    @Column(name = "team_name")
    private String teamName;
}
