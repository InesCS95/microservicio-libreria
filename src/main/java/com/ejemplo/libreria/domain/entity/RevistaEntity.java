package com.ejemplo.libreria.domain.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entidad que representa una revista.
 */
@Entity
@Table(name = "REVISTA")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RevistaEntity {

	@Id
	@Column(name = "ISSN")
	/**
	 * ISSN de la revista.
	 *
	 * Es la clave primaria de la entidad.
	 * Identificador único del registro en base de datos.
	 */
	private String issn;

    private String autor;

    private String tematica;

    private String titulo;

    private Integer tirada;
}