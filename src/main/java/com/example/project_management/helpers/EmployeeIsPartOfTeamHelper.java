package com.example.project_management.helpers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeIsPartOfTeamHelper {

    private Long employeeId;
    private Long teamId;
    private Date dateStarted;
    private Date dateEnded;
}
