package com.example.fixapp.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

@RestController
public class ProfissionalController {

    private static final List<Map<String, String>> profissionais = new ArrayList<>(Arrays.asList(
            Map.of("name", "Profissional 1", "imageUrl", "https://encurtador.com.br/HSSy5"),
            Map.of("name", "Profissional 2", "imageUrl", "https://encurtador.com.br/HSSy5")
    ));

    @CrossOrigin(origins = "*")
    @GetMapping("/api/profissionais")
    public List<Map<String, String>> getProfissionais() {
        return profissionais;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/api/addprofissional")
    public Map<String, String> addProfissional(@RequestBody Map<String, String> profissional) {
        profissionais.add(profissional);
        return profissional;  
    }
}
