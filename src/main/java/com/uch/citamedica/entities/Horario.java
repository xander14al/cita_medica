package com.uch.citamedica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
@Entity
@Table(name = "horario")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private Integer idHorario;

    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "id_consultorio")
    private Consultorio consultorio;

    @Enumerated(EnumType.STRING)
    @Column(name = "dia_semana")
    private DiaSemana diaSemana;

    @Column(name = "hora_inicio")
    private LocalTime horaInicio;

    @Column(name = "hora_fin")
    private LocalTime horaFin;

    @JsonIgnore
    @OneToMany(mappedBy = "horario", fetch = FetchType.LAZY)
    private List<Cita> citas;

    @Override
    public String toString() {
        return "Horario{" +
                "idHorario=" + idHorario +
                ", medico=" + medico +
                ", consultorio=" + consultorio +
                ", diaSemana=" + diaSemana +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                '}';
    }
}
