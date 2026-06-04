package com.ejemplo.libreria.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.libreria.domain.entity.RevistaEntity;

/**
 * Repositorio JPA para Revista.
 */
public interface RevistaRepository extends JpaRepository<RevistaEntity, String> {
    Optional<RevistaEntity> findByTitulo(String titulo);
    Optional<RevistaEntity> findByTirada(Integer tirada);
    void deleteByTitulo(String titulo);
}