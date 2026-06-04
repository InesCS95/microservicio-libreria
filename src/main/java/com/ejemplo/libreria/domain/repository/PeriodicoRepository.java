package com.ejemplo.libreria.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.libreria.domain.entity.PeriodicoEntity;

/**
 * Repositorio JPA para Periodico.
 */
public interface PeriodicoRepository extends JpaRepository<PeriodicoEntity, String> {
	
    List<PeriodicoEntity> findByTitulo(String titulo);
    List<PeriodicoEntity> findByFechaPublicacion(String fechaPublicacion);
    void deleteByTitulo(String titulo);
    
}