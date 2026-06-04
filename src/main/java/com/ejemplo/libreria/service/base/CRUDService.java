package com.ejemplo.libreria.service.base;

import java.util.List;

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
public interface CRUDService<I> {

    /**
     * Obtiene todos los objetos.
     *
     * @return lista de objetos
     */
    List<I> obtenerTodo();

    /**
     * Obtiene un listaod de objetos por su título.
     *
     * @param titulo título del objeto
     * @return objeto encontrado
     */
    List<I> obtenerPorTitulo(String titulo);

    /**
     * Crea un nuevo objeto.
     *
     * @param objetoDTO datos del objeto a crear
     */
    void crear(I objeto);

}