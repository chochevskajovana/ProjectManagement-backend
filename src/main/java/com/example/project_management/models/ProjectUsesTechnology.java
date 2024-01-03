package com.example.project_management.models;

import com.example.project_management.models.CompositeKeysModels.ProjectUsesTechnologyKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "project_uses_technology")
public class ProjectUsesTechnology {

    @EmbeddedId
    ProjectUsesTechnologyKey id;

    @ManyToOne
    @MapsId("projectId")
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @MapsId("technologyId")
    @JoinColumn(name = "technology_id")
    private Technology technology;

}
