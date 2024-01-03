package com.example.project_management.repository;

import com.example.project_management.models.CompositeKeysModels.EmployeeWorksWithTechnologyKey;
import com.example.project_management.models.EmployeeWorksWithTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmployeeWorksWithTechnologyRepository extends JpaRepository<EmployeeWorksWithTechnology, EmployeeWorksWithTechnologyKey> {

    @Modifying
    @Transactional
    @Query(value = "call add_employee_works_with_technology(?1, ?2)", nativeQuery = true)
    void addEmployeeWorksWithTechnology(Integer employeeId, Integer technologyId);
}
