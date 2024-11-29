package com.uch.citamedica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "consultorio")
public class Consultorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consultorio")
    private Integer idConsultorio;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_clinica")
    private Clinica clinica;

    @JsonIgnore
    @OneToMany(mappedBy = "consultorio")
    private List<Horario> horarios;

    @JsonIgnore
    @OneToMany(mappedBy = "consultorio")
    private List<Cita> citas;

    @Override
    public String toString() {
        return "Consultorio{" +
                "idConsultorio=" + idConsultorio +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}