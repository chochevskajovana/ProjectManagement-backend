package com.example.project_management.service.interfaces;

import com.example.project_management.models.views.TeamDetailsView;

import java.util.List;

public interface TeamDetailsViewService {

    List<TeamDetailsView> findAll();
}
