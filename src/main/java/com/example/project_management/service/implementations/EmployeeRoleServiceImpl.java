package com.example.project_management.service.implementations;

import com.example.project_management.models.EmployeeRole;
import com.example.project_management.repository.EmployeeRoleRepository;
import com.example.project_management.service.interfaces.EmployeeRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeRoleServiceImpl implements EmployeeRoleService {

    private final EmployeeRoleRepository employeeRoleRepository;

    public EmployeeRoleServiceImpl(EmployeeRoleRepository employeeRoleRepository) {
        this.employeeRoleRepository = employeeRoleRepository;
    }

    @Override
    public List<EmployeeRole> findAll() {
        return this.employeeRoleRepository.findAll();
    }
}
