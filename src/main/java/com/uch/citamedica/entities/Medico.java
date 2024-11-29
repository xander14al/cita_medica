package com.uch.citamedica.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "medico")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idMedico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico")
    private Integer idMedico;

    @Column(name = "dni", nullable = false, length = 8)
    private String dni;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 100)
    private String apellidos;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "numero_colegio", length = 8)
    private String numeroColegio;

    @Column(name = "email", length = 100)
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_clinica")
    private Clinica clinica;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_especialidad")
    private Especialidad especialidad;

    @OneToMany(mappedBy = "medico")
    private List<Horario> horarios;

    @OneToMany(mappedBy = "medico")
    private List<Cita> citas;

    @Override
    public String toString() {
        return "Medico{" +
                "idMedico=" + idMedico +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
