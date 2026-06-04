package com.ejemplo.libreria.domain.service.base;

import java.util.List;

/**
 * Servicio de dominio genérico.
 *
 * Contiene la lógica de negocio pura, desacoplada de Spring.
 */
public interface LibreriaDomainService<T> {

    List<T> obtenerTodo();

    List<T> obtenerPorTitulo(String titulo);

    T crear(T entity);
    

    /**
     * Actualiza un elemento existente.
     */
    T actualizar(String id, T entity);
    

    /**
     * Elimina un elemento por su identificador.
     */
    void eliminar(String id);
}