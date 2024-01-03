package com.example.project_management.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.sql.Date;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "project")
public class Project {
    @Id
    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "pr_name")
    private String prName;

    @Column(name = "pr_description")
    private String prDescription;

    @Column(name = "date_started")
    private Date dateStarted;

    @Column(name = "date_finished")
    private Date dateFinished;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "pr_image")
    private String prImage;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client clientId;

    @OneToMany(mappedBy = "project")
    @JsonIgnore
    List<ProjectIsPartOfType> projectIsPartOfTypeList;

    @OneToMany(mappedBy = "project")
    @JsonIgnore
    List<ProjectUsesTechnology> projectUsesTechnologyList;

    @OneToMany(mappedBy = "project")
    @JsonIgnore
    List<TeamWorksOnProject> teamWorksOnProjectList;
}
