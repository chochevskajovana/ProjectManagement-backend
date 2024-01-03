package com.example.project_management.helpers;

import com.example.project_management.models.Client;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectHelper {

    private String name;
    private String description;
    private Date dateStarted;
    private Date dateFinished;
    private Boolean isActive;
    private String image;
    private Integer clientId;
}
