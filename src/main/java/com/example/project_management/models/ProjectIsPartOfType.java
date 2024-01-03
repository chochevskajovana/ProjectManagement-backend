package com.example.project_management.models;

import com.example.project_management.models.CompositeKeysModels.ProjectIsPartOfTypeKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "project_is_part_of_type")
public class ProjectIsPartOfType {

    @EmbeddedId
    ProjectIsPartOfTypeKey id;

    @ManyToOne
    @MapsId("projectId")
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @MapsId("typeId")
    @JoinColumn(name = "type_id")
    private Type type;
}
