package com.uch.citamedica.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "clinica")
public class Clinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clinica")
    private Integer idClinica;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "email", length = 100)
    private String email;

    @OneToMany(mappedBy = "clinica")
    private Set<Consultorio> consultorios;

    @OneToMany(mappedBy = "clinica")
    private Set<Medico> medicos;
}