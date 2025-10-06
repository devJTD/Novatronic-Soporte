package com.novatronic.soporte.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/admin/dashboard")
    public String mostrarDashboardAdmin() {
        return "dashboardAdmin";
    }

    @GetMapping("/cliente/dashboard")
    public String mostrarDashboardCliente() {
        return "dashboardCliente";
    }
}