package com.example.project_management.service.implementations;

import com.example.project_management.models.reports.CountOfTechnologiesOnTypeOfProject;
import com.example.project_management.repository.CountOfTechnologiesOnTypeOfProjectRepository;
import com.example.project_management.service.interfaces.CountOfTechnologiesOnTypeOfProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountOfTechnologiesOnTypeOfProjectServiceImpl implements CountOfTechnologiesOnTypeOfProjectService {

    private final CountOfTechnologiesOnTypeOfProjectRepository countOfTechnologiesOnTypeOfProjectRepository;

    public CountOfTechnologiesOnTypeOfProjectServiceImpl(CountOfTechnologiesOnTypeOfProjectRepository countOfTechnologiesOnTypeOfProjectRepository) {
        this.countOfTechnologiesOnTypeOfProjectRepository = countOfTechnologiesOnTypeOfProjectRepository;
    }

    @Override
    public List<CountOfTechnologiesOnTypeOfProject> findAll() {
        return this.countOfTechnologiesOnTypeOfProjectRepository.findAll();
    }
}
