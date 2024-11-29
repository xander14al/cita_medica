package com.uch.citamedica.services;

import com.uch.citamedica.dto.MedicoDto;
import com.uch.citamedica.entities.Especialidad;
import com.uch.citamedica.entities.Medico;
import com.uch.citamedica.repository.ClinicaRepository;
import com.uch.citamedica.repository.MedicoRepository;
import com.uch.citamedica.util.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicoServiceImpl implements MedicoService {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    ClinicaRepository clinicaRepository;

    @Override
    public List<MedicoDto> listarMedicos() {
        return medicoRepository.findAll().stream()
                .map(objectMapper::medicoToMedicoDto)
                .collect(Collectors.toList());
    }

    @Override
    public void guardarMedico(MedicoDto medicoDto) {
        System.out.println(medicoDto.toString());
        Medico medico = objectMapper.medicoDtoToMedico(medicoDto);
        // Clínica por defecto 1
        medico.setClinica(clinicaRepository.findById(1).orElse(null));
        medicoRepository.save(medico);
    }

    @Override
    public MedicoDto buscarPorId(Integer id) {
        Medico medico = medicoRepository.findById(id).orElse(null);
        return objectMapper.medicoToMedicoDto(medico);
    }

    @Override
    public void eliminarMedico(Integer id) {
        medicoRepository.deleteById(id);
    }
}
