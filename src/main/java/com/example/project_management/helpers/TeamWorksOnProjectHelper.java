package com.example.project_management.helpers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamWorksOnProjectHelper {

    private Long projectId;
    private Long teamId;
}
