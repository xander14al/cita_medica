package com.uch.citamedica.dto;

public class MedicoDto {
    private Integer idMedico;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private String numeroColegiatura;
    private String telefono;
    private Integer idClinica;
    private String especialidad;
    private Integer idEspecialidad;

    public MedicoDto() {
    }

    public MedicoDto(Integer idMedico, String nombre, String apellidos, String dni, String email, String numeroColegiatura, String telefono, Integer idClinica, String especialidad, Integer idEspecialidad) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.numeroColegiatura = numeroColegiatura;
        this.telefono = telefono;
        this.idClinica = idClinica;
        this.especialidad = especialidad;
        this.idEspecialidad = idEspecialidad;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroColegiatura() {
        return numeroColegiatura;
    }

    public void setNumeroColegiatura(String numeroColegiatura) {
        this.numeroColegiatura = numeroColegiatura;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(Integer idClinica) {
        this.idClinica = idClinica;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    @Override
    public String toString() {
        return "MedicoDto{" +
                "idMedico=" + idMedico +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", numeroColegiatura='" + numeroColegiatura + '\'' +
                ", telefono='" + telefono + '\'' +
                ", idClinica=" + idClinica +
                ", especialidad='" + especialidad + '\'' +
                ", idEspecialidad=" + idEspecialidad +
                '}';
    }
}
