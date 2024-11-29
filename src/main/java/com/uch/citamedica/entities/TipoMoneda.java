package com.uch.citamedica.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "tipo_moneda")
public class TipoMoneda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_moneda")
    private Integer idMoneda;

    @Column(name = "codigo", nullable = false, length = 10)
    private String codigo;

    @Column(name = "descripcion", length = 100)
    private String descripcion;

    @Column(name = "simbolo", length = 10)
    private String simbolo;

    @OneToMany(mappedBy = "tipoMoneda")
    private Set<Pago> pagos;
}
