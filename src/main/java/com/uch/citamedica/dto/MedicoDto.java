package com.uch.citamedica.dto;

import lombok.Data;

@Data
public class MedicoDto {
    private Integer idMedico;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private String numeroColegio = "0";
    private String telefono;
    private Integer idClinica = 1;
    private String especialidad;
    private Integer idEspecialidad;

}
