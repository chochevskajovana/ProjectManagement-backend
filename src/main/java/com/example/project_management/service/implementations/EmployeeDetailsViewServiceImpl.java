package com.example.project_management.service.implementations;

import com.example.project_management.models.views.EmployeeDetailsView;
import com.example.project_management.repository.EmployeeDetailsViewRepository;
import com.example.project_management.service.interfaces.EmployeeDetailsViewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDetailsViewServiceImpl implements EmployeeDetailsViewService {

    private final EmployeeDetailsViewRepository employeeDetailsViewRepository;

    public EmployeeDetailsViewServiceImpl(EmployeeDetailsViewRepository employeeDetailsViewRepository) {
        this.employeeDetailsViewRepository = employeeDetailsViewRepository;
    }

    @Override
    public List<EmployeeDetailsView> findAll() {
        return this.employeeDetailsViewRepository.findAll();
    }
}
