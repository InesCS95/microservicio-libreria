package com.ejemplo.libreria.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ejemplo.libreria.dto.LibroDTO;
import com.ejemplo.libreria.service.base.LibroService;

import lombok.extern.slf4j.Slf4j;

/**
 * Implementación del servicio de libros.
 *
 * Aquí se implementará la lógica de negocio
 * relacionada con la gestión de libros.
 *
 * En el futuro este servicio se conectará con
 * un repositorio para acceder a base de datos.
 */
@Service
@Slf4j
public class LibroServiceImpl implements LibroService {

    /**
     * Obtiene todos los libros.
     *
     * Actualmente devuelve una lista vacía ya que
     * aún no existe conexión con base de datos.
     *
     * @return lista de libros
     */
    @Override
    public List<LibroDTO> obtenerLibros() {
        return List.of();
    }

    /**
     * Obtiene un libro por su título.
     *
     * @param titulo título del libro
     * @return libro encontrado
     */
    @Override
    public LibroDTO obtenerLibroPorTitulo(String titulo) {
    		
    	//TODO Mock libro
    	String autorLibro = "Jane Austen";
    	String tituloLibro = "Orgullo y Prejuicio";
    	String tematicaLibro = "Peñazo";
    	
    	LibroDTO libroMock = new LibroDTO();
    	LibroDTO libroMock2 = new LibroDTO(autorLibro, tituloLibro, tematicaLibro);
    	LibroDTO libroMock3 = new LibroDTO("Jane Austen", "Muy peñazo", "Emma");
    	LibroDTO libroMock4 = new LibroDTO();
    	LibroDTO libroMock5 = new LibroDTO(null, null, titulo);
    	
    	// TODO Hacer libroMock6 con un constructor que solo tenga de parametro de entrada titulo
    	
    	libroMock.setAutor(autorLibro);
    	libroMock.setTematica(tematicaLibro);
    	libroMock.setTitulo(tituloLibro);
    	
    	libroMock4.setTitulo(titulo);
    	log.info("El título del libro es " + libroMock4.getTitulo() );
        return libroMock3;
    }

    /**
     * Crea un nuevo libro.
     *
     * @param libroDTO datos del libro
     */
    @Override
    public void crearLibro(LibroDTO libroDTO) {
        // Lógica futura de creación
    }

    /**
     * Actualiza un libro existente.
     *
     * @param titulo título del libro
     * @param libroDTO datos nuevos
     */
    @Override
    public void actualizarLibro(String titulo, LibroDTO libroDTO) {
        // Lógica futura de actualización
    }

    /**
     * Elimina un libro por su título.
     *
     * @param titulo título del libro
     */
    @Override
    public void eliminarLibro(String titulo) {
        // Lógica futura de eliminación
    }
}