package com.uch.citamedica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
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

    @JsonIgnore
    @OneToMany(mappedBy = "tipoMoneda")
    private List<Pago> pagos;
}
