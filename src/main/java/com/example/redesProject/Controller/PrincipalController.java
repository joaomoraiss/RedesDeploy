package com.example.redesProject.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrincipalController {
    @GetMapping
    public String hello(){
        return "Helloworld";
    }

    @GetMapping("/sayDisciplina")
    public String sayDisciplina(@RequestParam String professor) {
        switch (professor){
            case "Daniel": return "Redes de Internet";
            case "Iago": return "Programação orientada a objetos";
            case "Gabriel": return "Front-End";
            case "Renan": return "Gestão de projetos";
            default: return "Não encontrado";
            }
    }
}

