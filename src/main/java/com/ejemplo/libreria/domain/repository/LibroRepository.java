package com.ejemplo.libreria.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.libreria.domain.entity.LibroEntity;

/**
 * Repositorio JPA para Libro.
 */
public interface LibroRepository extends JpaRepository<LibroEntity, String> {
	
    List<LibroEntity> findByTitulo(String titulo);
    List<LibroEntity> findByAutor(String autor);

}