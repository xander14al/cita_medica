package com.uch.citamedica.dto;

import com.uch.citamedica.entities.Rol;

import java.util.Date;

public class UsuarioDto {

    private String username;
    private String password;
    private String passwordTemp;
    private String dni;
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String telefono;
    private String direccion;
    private String genero;
    private String email;
    private String estado;
    private Rol idRol;

    public UsuarioDto() {
    }

    public UsuarioDto(String username, String password, String passwordTemp, String dni, String nombre, String apellidos, Date fechaNacimiento, String telefono, String direccion, String genero, String email, String estado, Rol idRol) {
        this.username = username;
        this.password = password;
        this.passwordTemp = passwordTemp;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
        this.email = email;
        this.estado = estado;
        this.idRol = idRol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordTemp() {
        return passwordTemp;
    }

    public void setPasswordTemp(String passwordTemp) {
        this.passwordTemp = passwordTemp;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }

    @Override
    public String toString() {
        return "UsuarioDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", passwordTemp='" + passwordTemp + '\'' +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", genero='" + genero + '\'' +
                ", email='" + email + '\'' +
                ", estado='" + estado +
                ", idRol=" + idRol +
                '}';
    }
}
