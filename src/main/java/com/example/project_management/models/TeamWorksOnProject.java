package com.example.project_management.models;

import com.example.project_management.models.CompositeKeysModels.TeamWorksOnProjectKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "team_works_on_project")
public class TeamWorksOnProject {

    @EmbeddedId
    TeamWorksOnProjectKey id;

    @ManyToOne
    @MapsId("projectId")
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @MapsId("teamId")
    @JoinColumn(name = "team_id")
    private Team team;

}
