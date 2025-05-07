package com.examplo.meu_backend.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/LoginProject")
public class LoginController {
    @GetMapping
    public String Login(){
        return "Login";
    }

    @PostMapping("")
    public String processLogin(@RequestParam("email") String email, @RequestParam("senha") String senha){
        if (autenticarUsuario(email, senha)) {
            // Cria a sessão para o usuário logado
            session.setAttribute("usuarioLogado", email);
            return "redirect:/home"; // Redireciona para a página principal
        } else {
            model.addAttribute("error", "Nome de usuário ou senha incorretos.");
            return "login"; // Retorna para a página de login
        }
        // Método auxiliar para autenticar o usuário (implementação a ser ajustada)
        private boolean autenticarUsuario(String email, String senha) {
            // Implemente a verificação das credenciais no banco de dados ou outro sistema de autenticação
            return true; // Substitua por sua lógica de autenticação
        }
    }
    }
}

