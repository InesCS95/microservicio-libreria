package com.ejemplo.libreria.service.base;

import com.ejemplo.libreria.dto.LibroDTO;

import java.util.List;

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
public interface LibroService {

    /**
     * Obtiene todos los libros.
     *
     * @return lista de libros
     */
    List<LibroDTO> obtenerLibros();

    /**
     * Obtiene un libro por su título.
     *
     * @param titulo título del libro
     * @return libro encontrado
     */
    LibroDTO obtenerLibroPorTitulo(String titulo);

    /**
     * Crea un nuevo libro.
     *
     * @param libroDTO datos del libro a crear
     */
    void crearLibro(LibroDTO libroDTO);

    /**
     * Actualiza un libro existente.
     *
     * @param titulo título del libro a actualizar
     * @param libroDTO datos nuevos
     */
    void actualizarLibro(String titulo, LibroDTO libroDTO);

    /**
     * Elimina un libro por su título.
     *
     * @param titulo título del libro a eliminar
     */
    void eliminarLibro(String titulo);

}