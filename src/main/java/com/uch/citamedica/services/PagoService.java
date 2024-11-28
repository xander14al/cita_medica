package com.uch.citamedica.services;

import java.util.List;

import com.uch.citamedica.entities.Pago;

public interface PagoService {

    List<Pago> listarPagos();

    Pago buscarPorId(Integer id);

    void guardarPago(Pago pago);

    void eliminarPago(Integer id);

}
