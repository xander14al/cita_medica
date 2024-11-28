package com.uch.citamedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.citamedica.entities.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer> {

}
