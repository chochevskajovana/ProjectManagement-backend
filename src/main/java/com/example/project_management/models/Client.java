package com.example.project_management.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "client")
public class Client {
    @Id
    @Column(name = "client_id")
    private int clientId;

    @Column(name = "cl_name")
    private String clName;

    @Column(name = "cl_description")
    private String clDescription;

    @Column(name = "cl_email")
    private String clEmail;
}
