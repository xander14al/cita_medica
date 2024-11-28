package com.uch.citamedica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.citamedica.entities.TipoMoneda;
import com.uch.citamedica.repository.TipoMonedaRepository;

@Service
public class TipoMonedaServiceImpl implements TipoMonedaService {

    @Autowired
    TipoMonedaRepository tipoMonedaRepository;

    @Override
    public List<TipoMoneda> listarTipoMonedas() {
        return tipoMonedaRepository.findAll();
    }

    @Override
    public TipoMoneda buscarPorId(Integer id) {
        return tipoMonedaRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarTipoMoneda(TipoMoneda tipoMoneda) {
        tipoMonedaRepository.save(tipoMoneda);
    }

    @Override
    public void eliminarTipoMoneda(Integer id) {
        tipoMonedaRepository.deleteById(id);
    }
}
