package com.novatronic.soporte.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/dashboard")
    public String obtenerDashboardCliente(Model modelo) {
        return "dashboardCliente";
    }

    @GetMapping("/registro-ticket")
    public String obtenerRegistroTicketCliente() {
        return "registroCliente";
    }

    @GetMapping("/lista-tickets")
    public String obtenerListaTicketsCliente(Model modelo) {
        return "listaTicketsCliente";
    }

    @GetMapping("/detalle-ticket/{ticketId}")
    public String obtenerDetalleTicketCliente(@PathVariable String ticketId, Model modelo) {
        return "detalleTicketCliente";
    }
}