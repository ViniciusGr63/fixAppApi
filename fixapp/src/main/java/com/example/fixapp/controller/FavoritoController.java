package com.example.fixapp.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

@RestController
public class FavoritoController {

    private static final List<Map<String, String>> favoritos = new ArrayList<>(Arrays.asList(
            Map.of("name", "Favorito 1", "imageUrl", "https://encurtador.com.br/ggAuw"),
            Map.of("name", "Favorito 2", "imageUrl", "https://encurtador.com.br/ggAuw"),
            Map.of("name", "Favorito 3", "imageUrl", "https://encurtador.com.br/ggAuw")
    ));

    @CrossOrigin(origins = "*")
    @GetMapping("/api/favoritos")
    public List<Map<String, String>> getFavoritos() {
        return favoritos;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/api/add/favorito")
    public Map<String, String> addFavorito(@RequestBody Map<String, String> favorito) {
        favoritos.add(favorito);
        return favorito; 
    }
}
