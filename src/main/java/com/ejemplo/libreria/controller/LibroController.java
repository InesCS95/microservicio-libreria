package com.ejemplo.libreria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.libreria.dto.LibroDTO;
import com.ejemplo.libreria.service.base.LibroService;

/**
 * Controlador REST que expone los endpoints
 * para gestionar libros.
 *
 * En este caso cada operación tiene su propio endpoint
 * específico en lugar de utilizar el patrón REST clásico.
 */
@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroService libroService;

    /**
     * Constructor con inyección de dependencias.
     *
     * @param libroService servicio de gestión de libros
     */
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    /**
     * Recupera todos los libros registrados.
     *
     * Endpoint:
     * GET /libros/recuperarLibros
     *
     * @return lista de libros
     */
    @GetMapping("/recuperarLibros")
    public List<LibroDTO> recuperarLibros() {
        return libroService.obtenerLibros();
    }

    /**
     * Recupera un libro a partir de su título.
     *
     * Endpoint:
     * GET /libros/recuperarLibro/{titulo}
     *
     * @param titulo título del libro
     * @return libro encontrado
     */
    @GetMapping("/recuperarLibro/{titulo}")
    public LibroDTO recuperarLibro(@PathVariable String titulo) {    	
    	
        return libroService.obtenerLibroPorTitulo(titulo);
    }
    
    /**
     * Crea un nuevo libro.
     *
     * Endpoint:
     * POST /libros/crearLibro
     *
     * @param libroDTO datos del libro a crear
     */
    @PostMapping("/crearLibro")
    public void crearLibro(@RequestBody LibroDTO libroDTO) {
        libroService.crearLibro(libroDTO);
    }

    /**
     * Actualiza un libro existente.
     *
     * Endpoint:
     * PUT /libros/actualizarLibro/{titulo}
     *
     * @param titulo título del libro
     * @param libroDTO datos actualizados
     */
    @PutMapping("/actualizarLibro/{titulo}")
    public void actualizarLibro(@PathVariable String titulo,
                                @RequestBody LibroDTO libroDTO) {
        libroService.actualizarLibro(titulo, libroDTO);
    }

    /**
     * Elimina un libro por su título.
     *
     * Endpoint:
     * DELETE /libros/borrarLibro/{titulo}
     *
     * @param titulo título del libro a eliminar
     */
    @DeleteMapping("/borrarLibro/{titulo}")
    public void borrarLibro(@PathVariable String titulo) {
        libroService.eliminarLibro(titulo);
    }
}