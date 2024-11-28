package com.uch.citamedica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.citamedica.entities.MetodoPago;
import com.uch.citamedica.repository.MetodoPagoRepository;

@Service
public class MetodoPagoServiceImpl implements MetodoPagoService {

    @Autowired
    MetodoPagoRepository metodoPagoRepository;

    @Override
    public List<MetodoPago> listarMetodosPago() {
        return metodoPagoRepository.findAll();
    }

    @Override
    public MetodoPago buscarPorId(Integer id) {
        return metodoPagoRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarMetodoPago(MetodoPago metodoPago) {
        metodoPagoRepository.save(metodoPago);
    }

    @Override
    public void eliminarMetodoPago(Integer id) {
        metodoPagoRepository.deleteById(id);
    }
}
