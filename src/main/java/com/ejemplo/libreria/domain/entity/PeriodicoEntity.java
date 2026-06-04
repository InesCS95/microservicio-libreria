package com.ejemplo.libreria.domain.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entidad que representa un periódico.
 */
@Entity
@Table(name = "PERIODICO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PeriodicoEntity {

	  /**
     * ISSN del periódico.
     *
     * Identificador único y clave primaria.
     * Sustituye al ID autogenerado.
     */
    @Id
    @Column(name = "ISSN")
    private String issn;

    private String titulo;

    @Column(name = "FECHA_PUBLICACION")
    private String fechaPublicacion;
}