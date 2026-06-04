package com.ejemplo.libreria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object (DTO) que representa un periódico.
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
public class PeriodicoDTO {
	
	 /**
     * ISSN del periódico.
     *
     * Identificador único del periódico.
     */
    private String issn;

    /**
     * Titulo del periódico.
     */
    private String titulo;

    /**
     * Fecha publicación periódico.
     */
    private String fechaPublicacion;
   
}