package com.ejemplo.libreria.service.base;

import java.util.List;

import com.ejemplo.libreria.dto.PeriodicoDTO;

/**
 * Interfaz que define el contrato del servicio de CRUD de cualquier objeto con un campo titulo.
 *
 * Esta capa representa la lógica de negocio de la aplicación.
 *
 * Definir una interfaz permite:
 * - Cambiar la implementación fácilmente
 * - Facilitar testing con mocks
 * - Desacoplar el controlador de la implementación
 */
public interface PeriodicoService extends CRUDService<PeriodicoDTO> {
	
	  PeriodicoDTO obtenerPorFecha(String fechaPublicacion);
}