package com.example.project_management.models.CompositeKeysModels;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class TeamWorksOnProjectKey implements Serializable {

    @Column(name = "project_id")
    Integer projectId;

    @Column(name = "team_id")
    Integer teamId;
}
