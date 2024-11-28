package com.uch.citamedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.citamedica.entities.Horario;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Integer> {

}
