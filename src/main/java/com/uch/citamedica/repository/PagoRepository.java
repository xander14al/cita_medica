package com.uch.citamedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uch.citamedica.entities.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {

}
