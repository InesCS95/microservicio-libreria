package com.ejemplo.libreria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal que inicia la aplicación Spring Boot.
 *
 * La anotación {@link SpringBootApplication} engloba:
 *
 * - @Configuration
 * - @EnableAutoConfiguration
 * - @ComponentScan
 *
 * Esto permite que Spring detecte automáticamente los
 * componentes del proyecto como Controllers, Services, etc.
 */
@SpringBootApplication
public class MicroservicioLibreriaApplication {

    /**
     * Método main que arranca el microservicio.
     *
     * @param args argumentos de entrada de la aplicación
     */
    public static void main(String[] args) {
        SpringApplication.run(MicroservicioLibreriaApplication.class, args);
    }
}