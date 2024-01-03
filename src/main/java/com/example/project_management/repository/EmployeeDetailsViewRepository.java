package com.example.project_management.repository;

import com.example.project_management.models.views.EmployeeDetailsView;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsViewRepository extends ReadOnlyRepository<EmployeeDetailsView, Integer>{
}
