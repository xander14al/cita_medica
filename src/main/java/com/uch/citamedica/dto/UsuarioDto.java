package com.uch.citamedica.dto;

import com.uch.citamedica.entities.Rol;
import com.uch.citamedica.entities.Usuario;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UsuarioDto {

    private String username;
    private String password;
    private String passwordTemp;
    private String dni;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String direccion;
    private Usuario.Genero genero;
    private String email;
    private String estado;
    private Rol rol;

}
