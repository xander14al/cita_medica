package com.uch.citamedica.services;

import java.util.List;

import com.uch.citamedica.entities.TipoMoneda;

public interface TipoMonedaService {

    List<TipoMoneda> listarTipoMonedas();

    TipoMoneda buscarPorId(Integer id);

    void guardarTipoMoneda(TipoMoneda tipoMoneda);

    void eliminarTipoMoneda(Integer id);

}
