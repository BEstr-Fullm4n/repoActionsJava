package com.bancoppel.gitactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST principal de la aplicación.
 */
@RestController
public class HelloController {

	/**
     * Endpoint de prueba que retorna saludo.
     * @return Mensaje de bienvenida
     */
    @GetMapping("/hello")
    public String hello(){
        return "Hello World 4 GitHub-Actions v1.4 Test-pullReqest 2.1.6";
    }
}
