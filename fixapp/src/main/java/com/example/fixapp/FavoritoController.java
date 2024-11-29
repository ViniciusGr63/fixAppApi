package com.example.fixapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class FavoritoController {

    private static final List<Map<String, String>> favoritos = Arrays.asList(
            Map.of("name", "Favorito 1", "imageUrl", "https://encurtador.com.br/ggAuw"),
            Map.of("name", "Favorito 2", "imageUrl", "https://encurtador.com.br/ggAuw"),
            Map.of("name", "Favorito 3", "imageUrl", "https://encurtador.com.br/ggAuw")
    );

    // Configuração de CORS específica para este método
    @CrossOrigin(origins = "*") // Permite qualquer origem
    @GetMapping("/api/favoritos")
    public List<Map<String, String>> getFavoritos() {
        return favoritos;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/api/profissionais")
    public List<Map<String, String>> getProfissionais() {
        List<Map<String, String>> profissionais = Arrays.asList(
                Map.of("name", "Profissional 1", "imageUrl", "https://encurtador.com.br/HSSy5"),
                Map.of("name", "Profissional 2", "imageUrl", "https://encurtador.com.br/HSSy5")
        );
        return profissionais;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/api/categorias")
    public List<Map<String, String>> getCategorias() {
        List<Map<String, String>> categorias = Arrays.asList(
                Map.of("name", "Categoria_exemplo 1", "imageUrl", "https://encurtador.com.br/Wvfd5"),
                Map.of("name", "Categoria_exemplo 2", "imageUrl", "https://encurtador.com.br/Wvfd5")
        );
        return categorias;
    }
}
