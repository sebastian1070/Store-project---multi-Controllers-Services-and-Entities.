package com.example.tiendaropa.controllers;



import com.example.tiendaropa.entities.PantalonEntity;
import com.example.tiendaropa.services.PantalonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pantalon")
public class PantalonController {

    private final PantalonService pantalonService;

    public PantalonController(PantalonService pantalonService) {
        this.pantalonService = pantalonService;
    }

    @GetMapping
    public List<PantalonEntity> getAllPantalon() {
        return pantalonService.findAll();
    }

    @PostMapping
    public PantalonEntity createPantalon(@RequestBody PantalonEntity pantalon) {
        return pantalonService.save(pantalon);
    }

    @DeleteMapping("/{id}")
    public void deletePantalon(@PathVariable UUID id) {
        pantalonService.delete(id);
    }
}