package com.ejemplo.libreria.service.base;

import com.ejemplo.libreria.dto.LibroDTO;

/**
 * Interfaz que define el contrato del servicio de libros.
 *
 * Esta capa representa la lógica de negocio de la aplicación.
 *
 * Definir una interfaz permite:
 * - Cambiar la implementación fácilmente
 * - Facilitar testing con mocks
 * - Desacoplar el controlador de la implementación
 */
public interface LibroService extends CRUDService<LibroDTO> {

    /**
     * Actualiza un libro existente usando el ISBN.
     */
    LibroDTO actualizar(String isbn, LibroDTO libroDTO);

    /**
     * Elimina un libro por ISBN.
     */
    void eliminar(String isbn);
}