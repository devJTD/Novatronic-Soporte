package com.novatronic.soporte.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListaTicketsController {

    @GetMapping("/cliente/tickets")
    public String mostrarListaTicketsCliente() {
        return "listaTicketsCliente";
    }

    @GetMapping("/admin/tickets-nuevos")
    public String mostrarTicketsPorRevisarAdmin() {
        return "ticketsAdmin";
    }

    @GetMapping("/admin/tickets-revisados")
    public String mostrarTicketsRevisadosAdmin() {
        return "listaTicketsAdmin";
    }
}