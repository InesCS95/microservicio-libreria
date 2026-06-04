package com.ejemplo.libreria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.ejemplo.libreria.dto.LibroDTO;
import com.ejemplo.libreria.service.impl.LibroServiceImpl;

/**
 * Controlador REST que expone los endpoints
 * para gestionar libros.
 *
 * Cada operación tiene su propio endpoint.
 */
@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroServiceImpl libroService;

    /**
     * Constructor con inyección de dependencias.
     *
     * @param libroService servicio de gestión de libros
     */
    public LibroController(LibroServiceImpl libroService) {
        this.libroService = libroService;
    }
    
    
    /**
     * Petición GET para recuperar todos los libros.
     *  Recupera todos los libros registrados.
     *  GET /libros/recuperarLibros
     */
    @GetMapping("/recuperarLibros")
    public List<LibroDTO> recuperarLibros() {
        return libroService.obtenerTodo();
    }

    /**
     * Recupera libros por título.
     *
     * GET /libros/recuperarLibro/{titulo}
     */
    @GetMapping("/recuperarLibro/{titulo}")
    public List<LibroDTO> recuperarLibro(@PathVariable String titulo) {
        return libroService.obtenerPorTitulo(titulo);
    }

    /**
     * Crea un nuevo libro.
     *
     * POST /libros/crearLibro
     */
    @PostMapping("/crearLibro")
    public void crearLibro(@RequestBody LibroDTO libroDTO) {
        libroService.crear(libroDTO);
    }

    /**
     * Actualiza un libro existente por ISBN.
     *
     * PUT /libros/actualizarLibro/{isbn}
     */
    @PutMapping("/actualizarLibro/{isbn}")
    public LibroDTO actualizarLibro(@PathVariable String isbn,
                                    @RequestBody LibroDTO libroDTO) {
        return libroService.actualizar(isbn, libroDTO);
    }

    /**
     * Elimina un libro por ISBN.
     *
     * DELETE /libros/borrarLibro/{isbn}
     */
    @DeleteMapping("/borrarLibro/{isbn}")
    public void borrarLibro(@PathVariable String isbn) {
        libroService.eliminar(isbn);
    }
}