package com.example.project_management.helpers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectUsesTechnologyHelper {

    private Integer projectId;
    private Integer technologyId;
}
