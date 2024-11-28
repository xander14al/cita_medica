package com.uch.citamedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.citamedica.entities.TipoMoneda;  

@Repository
public interface TipoMonedaRepository extends JpaRepository<TipoMoneda, Integer> {

}
