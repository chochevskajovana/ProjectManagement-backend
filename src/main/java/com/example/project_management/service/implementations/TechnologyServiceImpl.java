package com.example.project_management.service.implementations;

import com.example.project_management.models.Technology;
import com.example.project_management.repository.TechnologyRepository;
import com.example.project_management.service.interfaces.TechnologyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyServiceImpl implements TechnologyService {

    private final TechnologyRepository technologyRepository;

    public TechnologyServiceImpl(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    @Override
    public List<Technology> findAll() {
        return this.technologyRepository.findAll();
    }
}
