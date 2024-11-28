package com.uch.citamedica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.citamedica.entities.Consultorio;
import com.uch.citamedica.repository.ConsultorioRepository;

@Service
public class ConsultorioServiceImpl implements ConsultorioService {

    @Autowired
    ConsultorioRepository consultorioRepository;

    @Override
    public List<Consultorio> listarConsultorios() {
        return consultorioRepository.findAll();
    }

    @Override
    public Consultorio buscarPorId(Integer id) {
        return consultorioRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarConsultorio(Consultorio consultorio) {
        consultorioRepository.save(consultorio);
    }

    @Override
    public void eliminarConsultorio(Integer id) {
        consultorioRepository.deleteById(id);
    }
}
