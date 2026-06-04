package com.ejemplo.libreria.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad que representa un libro en la base de datos.
 */
@Entity
@Table(name = "LIBRO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LibroEntity {

	 /** ISBN del libro (clave primaria).
     *
     * Identificador único del libro en el sistema.*/
    @Id
    @Column(name = "ISBN")
    private String isbn;

    /** Autor del libro */
    private String autor;

    /** Temática */
    private String tematica;

    /** Título único */
    private String titulo;
    
    /** Editorial */
    private String editorial;
}
