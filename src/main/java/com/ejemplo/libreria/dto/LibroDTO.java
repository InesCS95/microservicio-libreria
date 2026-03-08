package com.ejemplo.libreria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object (DTO) que representa un libro.
 *
 * Este objeto se utiliza para transportar datos entre
 * el cliente y el servidor a través de la API REST.
 *
 * Los DTOs permiten desacoplar el modelo interno
 * de la representación expuesta al exterior.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibroDTO {

    /**
     * Autor del libro.
     */
    private String autor;

    /**
     * Temática o categoría del libro.
     */
    private String tematica;

    /**
     * Título del libro.
     */
    private String titulo;
    
}