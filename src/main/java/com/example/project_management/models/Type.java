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
@Table(name = "type")
public class Type {
    @Id
    @Column(name = "type_id")
    private Integer typeId;

    @Column(name = "ty_name")
    private String tyName;

    @Column(name = "ty_description")
    private String tyDescription;

    @OneToMany(mappedBy = "type")
    @JsonIgnore
    List<ProjectIsPartOfType> projectIsPartOfTypeList;
}
