package com.ejemplo.libreria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object (DTO) que representa una revista.
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
public class RevistaDTO {

    /**
     * ISSN de la revista.
     *
     * Identificador único de la revista.
     * Sustituye al ID autogenerado de la base de datos.
     */
    private String issn;

    /**
     * Autor de la revista.
     */
    private String autor;

    /**
     * Temática o categoría de la revista.
     */
    private String tematica;

    /**
     * Título de la revista.
     */
    private String titulo;
}