package com.example.project_management.service.implementations;

import com.example.project_management.models.Employee;
import com.example.project_management.repository.EmployeeRepository;
import com.example.project_management.service.interfaces.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }
}
