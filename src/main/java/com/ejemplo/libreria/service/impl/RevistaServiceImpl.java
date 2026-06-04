package com.ejemplo.libreria.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ejemplo.libreria.dto.RevistaDTO;
import com.ejemplo.libreria.service.base.RevistaService;

import lombok.extern.slf4j.Slf4j;

/**
 * Implementación del servicio de revistas.
 *
 * Aquí se implementará la lógica de negocio
 * relacionada con la gestión de revistas.
 *
 * En el futuro este servicio se conectará con
 * un repositorio para acceder a base de datos.
 */
@Service
@Slf4j
public class RevistaServiceImpl implements RevistaService {

    /**
     * Obtiene todos los revistas.
     *
     * Actualmente devuelve una lista vacía ya que
     * aún no existe conexión con base de datos.
     *
     * @return lista de revistas
     */
    @Override
    public List<RevistaDTO> obtenerTodo() {
        return List.of();
    }

    /**
     * Obtiene un revista por su título.
     *
     * @param titulo título del revista
     * @return revista encontrado
     */
    @Override
    public List<RevistaDTO> obtenerPorTitulo(String titulo) {
    		
        // Lógica futura de recuperación
    	return new ArrayList<RevistaDTO>();
    }

    /**
     * Crea una nueva revista.
     *
     * @param revistaDTO datos de la revista
     */
    @Override
    public void crear(RevistaDTO revistaDTO) {
        // Lógica futura de creación
    }

	@Override
	public RevistaDTO obtenerRevistaPorTirada(Integer tirada) {
		// TODO Auto-generated method stub
		return null;
	}
}