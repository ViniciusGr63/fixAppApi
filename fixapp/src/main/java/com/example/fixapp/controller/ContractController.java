
package com.example.fixapp.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class ContractController {

    private static final List<Map<String, String>> contract = new ArrayList<>(Arrays.asList(
            Map.of("title", "Categoria_exemplo 1", "imageUrl", "https://encurtador.com.br/Wvfd5"),
            Map.of("title", "Categoria_exemplo 2", "imageUrl", "https://encurtador.com.br/Wvfd5")
    ));

    @CrossOrigin(origins = "*")
    @GetMapping("/contract")
    public List<Map<String, String>> getcontract() {
        return contract;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/add/categoria")
    public Map<String, String> addCategoria(@RequestBody Map<String, String> categoria) {
        categorias.add(categoria);
        return categoria; 
    }
}
