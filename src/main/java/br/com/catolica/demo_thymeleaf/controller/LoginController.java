package br.com.catolica.demo_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.catolica.demo_thymeleaf.service.LoginService;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/")
    public String exibirLogin(Model model) {
        model.addAttribute("erro", false);
        return "login";
    }

    @PostMapping("/login")
    public String fazerLogin(@RequestParam String usuario,
                             @RequestParam String senha,
                             HttpSession session,
                             Model model) {

        if (loginService.validarLogin(usuario, senha)) {
            session.setAttribute("usuarioLogado", usuario);
            return "redirect:/produtos";
        } else {
            model.addAttribute("erro", true);
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}