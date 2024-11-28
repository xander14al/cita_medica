package com.uch.citamedica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.citamedica.entities.Pago;
import com.uch.citamedica.repository.PagoRepository;

@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    PagoRepository pagoRepository;

    @Override
    public List<Pago> listarPagos() {
        return pagoRepository.findAll();
    }

    @Override
    public Pago buscarPorId(Integer id) {
        return pagoRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarPago(Pago pago) {
        pagoRepository.save(pago);
    }

    @Override
    public void eliminarPago(Integer id) {
        pagoRepository.deleteById(id);
    }
}
