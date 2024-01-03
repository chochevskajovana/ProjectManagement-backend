package com.example.project_management.service.implementations;

import com.example.project_management.models.EmployeeWorksWithTechnology;
import com.example.project_management.repository.EmployeeWorksWithTechnologyRepository;
import com.example.project_management.service.interfaces.EmployeeWorksWithTechnologyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeWorksWithTechnologyServiceImpl implements EmployeeWorksWithTechnologyService {

    private final EmployeeWorksWithTechnologyRepository employeeWorksWithTechnologyRepository;

    public EmployeeWorksWithTechnologyServiceImpl(EmployeeWorksWithTechnologyRepository employeeWorksWithTechnologyRepository) {
        this.employeeWorksWithTechnologyRepository = employeeWorksWithTechnologyRepository;
    }

    @Override
    public List<EmployeeWorksWithTechnology> findAll() {
        return this.employeeWorksWithTechnologyRepository.findAll();
    }

    @Override
    public void addEmployeeWorksWithTechnology(Long employeeId, Long technologyId) {
        this.employeeWorksWithTechnologyRepository.addEmployeeWorksWithTechnology(employeeId.intValue(), technologyId.intValue());
    }
}
