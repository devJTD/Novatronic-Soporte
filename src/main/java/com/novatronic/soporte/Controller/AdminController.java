package com.novatronic.soporte.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String obtenerDashboardAdmin(Model modelo) {
        return "dashboardAdmin";
    }

    @GetMapping("/tickets-nuevos")
    public String obtenerTicketsNuevos(Model modelo) {
        return "ticketsAdmin";
    }

    @GetMapping("/tickets-revisados")
    public String obtenerTicketsRevisados(Model modelo) {
        return "ticketsRevisadosAdmin";
    }
    
    @GetMapping("/detalles-ticket/{ticketId}")
    public String obtenerDetalleTicketAdmin(@PathVariable String ticketId, Model modelo) {
        return "detalleTicketAdmin";
    }

    @GetMapping("/registro-ticket")
    public String obtenerRegistroTicketAdmin() {
        return "registroAdmin";
    }

    @GetMapping("/reportes")
    public String obtenerReportesAdmin() {
        return "reportesAdmin";
    }
}