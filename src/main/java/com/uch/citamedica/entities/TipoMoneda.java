/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uch.citamedica.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tipo_moneda")
@NamedQueries({
    @NamedQuery(name = "TipoMoneda.findAll", query = "SELECT t FROM TipoMoneda t"),
    @NamedQuery(name = "TipoMoneda.findByIdMoneda", query = "SELECT t FROM TipoMoneda t WHERE t.idMoneda = :idMoneda"),
    @NamedQuery(name = "TipoMoneda.findByCodigo", query = "SELECT t FROM TipoMoneda t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TipoMoneda.findByDescripcion", query = "SELECT t FROM TipoMoneda t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TipoMoneda.findBySimbolo", query = "SELECT t FROM TipoMoneda t WHERE t.simbolo = :simbolo"),
    @NamedQuery(name = "TipoMoneda.findByCodigoIso", query = "SELECT t FROM TipoMoneda t WHERE t.codigoIso = :codigoIso"),
    @NamedQuery(name = "TipoMoneda.findByNombre", query = "SELECT t FROM TipoMoneda t WHERE t.nombre = :nombre")})
public class TipoMoneda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_moneda")
    private Integer idMoneda;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "simbolo")
    private String simbolo;
    @Basic(optional = false)
    @Column(name = "codigo_iso")
    private String codigoIso;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "idMoneda", fetch = FetchType.LAZY)
    private List<Pago> pagoList;

    public TipoMoneda() {
    }

    public TipoMoneda(Integer idMoneda) {
        this.idMoneda = idMoneda;
    }

    public TipoMoneda(Integer idMoneda, String codigo, String codigoIso, String nombre) {
        this.idMoneda = idMoneda;
        this.codigo = codigo;
        this.codigoIso = codigoIso;
        this.nombre = nombre;
    }

    public Integer getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(Integer idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pago> getPagoList() {
        return pagoList;
    }

    public void setPagoList(List<Pago> pagoList) {
        this.pagoList = pagoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMoneda != null ? idMoneda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMoneda)) {
            return false;
        }
        TipoMoneda other = (TipoMoneda) object;
        if ((this.idMoneda == null && other.idMoneda != null) || (this.idMoneda != null && !this.idMoneda.equals(other.idMoneda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uch.citamedica.entities.TipoMoneda[ idMoneda=" + idMoneda + " ]";
    }
    
}
