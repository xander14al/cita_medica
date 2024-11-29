package com.uch.citamedica.services;

import java.util.ArrayList;
import java.util.List;

import com.uch.citamedica.repository.ConsultorioRepository;
import com.uch.citamedica.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uch.citamedica.entities.Horario;
import com.uch.citamedica.repository.HorarioRepository;

@Service
public class HorarioServiceImpl implements HorarioService {

    @Autowired
    HorarioRepository horarioRepository;

    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    ConsultorioRepository consultorioRepository;

    @Override
    public List<Horario> listarHorarios() {
        return horarioRepository.findAll();
    }

    @Override
    public Horario buscarPorId(Integer id) {
        return horarioRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarHorario(Horario horario) {
        horario.setMedico(medicoRepository.findById(horario.getMedico().getIdMedico()).orElse(null));
        horario.setConsultorio(consultorioRepository.findById(horario.getConsultorio().getIdConsultorio()).orElse(null));
        horarioRepository.save(horario);
    }

    @Override
    public void eliminarHorario(Integer id) {
        horarioRepository.deleteById(id);
    }

    @Override
    public List<String> horasPermitidas() {
        List<String> horasPermitidas = new ArrayList<>();
        for (int hora = 0; hora < 24; hora++) {
            horasPermitidas.add(String.format("%02d:00", hora));
            horasPermitidas.add(String.format("%02d:30", hora));
        }
        return horasPermitidas;
    }
}