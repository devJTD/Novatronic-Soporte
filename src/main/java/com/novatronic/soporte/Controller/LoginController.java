package com.novatronic.soporte.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String procesarLogin(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
        boolean credencialesValidas = username != null && !username.isBlank() && password != null && !password.isBlank();
        if (!credencialesValidas) {
            return "redirect:/login?error=1";
        }

        boolean esAdmin = username != null && username.toLowerCase().contains("admin");
        if (esAdmin) {
            return "redirect:/admin/dashboard";
        } else {
            return "redirect:/cliente/dashboard";
        }
    }
}