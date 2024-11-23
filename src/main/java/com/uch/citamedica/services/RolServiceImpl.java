package com.uch.citamedica.services;

import com.uch.citamedica.entities.Rol;
import com.uch.citamedica.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    RolRepository rolRepository;

    public Rol findById(int id) {
        return rolRepository.findById(id).orElse(null);
    }
}
