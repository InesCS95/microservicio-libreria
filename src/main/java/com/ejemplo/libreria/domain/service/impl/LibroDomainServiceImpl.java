package com.ejemplo.libreria.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ejemplo.libreria.domain.entity.LibroEntity;
import com.ejemplo.libreria.domain.repository.LibroRepository;
import com.ejemplo.libreria.domain.service.base.LibroDomainService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Implementación del servicio de dominio para Libro.
 */
@Service
@Slf4j
@AllArgsConstructor
public class LibroDomainServiceImpl implements LibroDomainService {
	
    private final LibroRepository libroRepository;	
    
    /**
     * Obtiene todos los libros.
     *
     * @return lista de libros
     */
    @Override
    public List<LibroEntity> obtenerTodo() {
        return libroRepository.findAll();
    }

    /**
     * Obtiene un listado de libros por su título.
     *
     * @param titulo título del libro
     * @return libro encontrado
     */
    @Override
    public List<LibroEntity> obtenerPorTitulo(String titulo) {
    	return libroRepository.findByTitulo(titulo);

    }

    /**
     * Crea un nuevo libro.
     *
     * @param libroDTO datos del libro
     */
    @Override
    public LibroEntity crear(LibroEntity libroEntity) {
    	LibroEntity libroGuardado = libroRepository.save(libroEntity);
    	return libroGuardado;
    }
    
    /**
     * Actualiza un libro existente usando el ISBN.
     */
    @Override
    public LibroEntity actualizar(String isbn, LibroEntity entity) {
        entity.setIsbn(isbn);
        return libroRepository.save(entity);
    }

    /**
     * Elimina un libro por ISBN.
     */
    @Override
    public void eliminar(String isbn) {
        libroRepository.deleteById(isbn);
    }
   
}