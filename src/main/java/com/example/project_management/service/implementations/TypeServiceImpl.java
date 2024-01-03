package com.example.project_management.service.implementations;

import com.example.project_management.models.Type;
import com.example.project_management.repository.TypeRepository;
import com.example.project_management.service.interfaces.TypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    private final TypeRepository typeRepository;

    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public List<Type> findAll() {
        return this.typeRepository.findAll();
    }
}
