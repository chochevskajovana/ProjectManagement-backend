package com.example.project_management.service.implementations;

import com.example.project_management.models.Client;
import com.example.project_management.repository.ClientRepository;
import com.example.project_management.service.interfaces.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> findAll() {
        return this.clientRepository.findAll();
    }
}
