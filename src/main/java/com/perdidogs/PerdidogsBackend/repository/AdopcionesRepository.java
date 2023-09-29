package com.perdidogs.PerdidogsBackend.repository;

import com.perdidogs.PerdidogsBackend.model.dto.AdopcionesDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdopcionesRepository extends JpaRepository<AdopcionesDTO, Integer> {
}
