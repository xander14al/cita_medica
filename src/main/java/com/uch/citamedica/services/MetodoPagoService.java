package com.uch.citamedica.services;

import java.util.List;

import com.uch.citamedica.entities.MetodoPago;

public interface MetodoPagoService {
    
    List<MetodoPago> listarMetodosPago();

    MetodoPago buscarPorId(Integer id);

    void guardarMetodoPago(MetodoPago metodoPago);

    void eliminarMetodoPago(Integer id);

}
