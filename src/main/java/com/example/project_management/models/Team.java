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
@Table(name = "team")
public class Team {
    @Id
    @Column(name = "team_id")
    private Integer teamId;

    @Column(name = "tm_name")
    private String tmName;

    @OneToMany(mappedBy = "team")
    @JsonIgnore
    List<EmployeeIsPartOfTeam> employeeIsPartOfTeamList;

    @OneToMany(mappedBy = "team")
    @JsonIgnore
    List<TeamWorksOnProject> teamWorksOnProjectList;
}
