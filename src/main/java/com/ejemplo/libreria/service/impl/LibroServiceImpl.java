package com.ejemplo.libreria.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ejemplo.libreria.domain.entity.LibroEntity;
import com.ejemplo.libreria.domain.service.base.LibroDomainService;
import com.ejemplo.libreria.dto.LibroDTO;
import com.ejemplo.libreria.service.base.LibroService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Implementación del servicio de libros.
 *
 * Aquí se implementa la lógica de negocio
 * relacionada con la gestión de libros.
 */
@Service
@Slf4j
@AllArgsConstructor
public class LibroServiceImpl implements LibroService {

    private final LibroDomainService libroDomainService;

    /**
     * Obtiene todos los libros.
     */
    @Override
    public List<LibroDTO> obtenerTodo() {
        return libroDomainService.obtenerTodo()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    /**
     * Obtiene libros por título.
     */
    @Override
    public List<LibroDTO> obtenerPorTitulo(String titulo) {
        return libroDomainService.obtenerPorTitulo(titulo)
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    /**
     * Crea un nuevo libro.
     */
    @Override
    public void crear(LibroDTO libroDTO) {
        libroDomainService.crear(toEntity(libroDTO));
    }

    /**
     * Actualiza un libro existente usando ISBN.
     */
    @Override
    public LibroDTO actualizar(String isbn, LibroDTO libroDTO) {
        LibroEntity entity = toEntity(libroDTO);
        entity.setIsbn(isbn);

        LibroEntity actualizado = libroDomainService.actualizar(isbn, entity);

        return toDTO(actualizado);
    }

    /**
     * Elimina un libro por ISBN.
     */
    @Override
    public void eliminar(String isbn) {
        libroDomainService.eliminar(isbn);
    }

    /* ================= MAPPERS ================= */

    /**
     * Entity → DTO
     */
    private LibroDTO toDTO(LibroEntity entity) {
        return new LibroDTO(
                entity.getIsbn(),
                entity.getAutor(),
                entity.getTematica(),
                entity.getTitulo(),
                entity.getEditorial()
        );
    }

    /**
     * DTO → Entity
     */
    private LibroEntity toEntity(LibroDTO dto) {
        return LibroEntity.builder()
                .isbn(dto.getIsbn())
                .autor(dto.getAutor())
                .tematica(dto.getTematica())
                .titulo(dto.getTitulo())
                .editorial(dto.getEditorial())
                .build();
    }
}