package com.novatronic.soporte.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroController {

    @GetMapping("/cliente/registro")
    public String mostrarFormularioRegistroCliente() {
        return "registroCliente";
    }

    @GetMapping("/admin/registro")
    public String mostrarFormularioRegistroAdmin() {
        return "registroAdmin"; 
    }
}