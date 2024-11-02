package com.example.tiendaropa.controllers;



import com.example.tiendaropa.entities.ZapatoEntity;
import com.example.tiendaropa.services.ZapatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/zapatos")
public class ZapatoController {

    private final ZapatoService zapatoService;

    public ZapatoController(ZapatoService zapatoService) {
        this.zapatoService = zapatoService;
    }

    @GetMapping
    public List<ZapatoEntity> getAllZapatos() {
        return zapatoService.findAll();
    }

    @PostMapping
    public ZapatoEntity createZapato(@RequestBody ZapatoEntity zapato) {
        return zapatoService.save(zapato);
    }

    @DeleteMapping("/{id}")
    public void deleteZapato(@PathVariable UUID id) {
        zapatoService.delete(id);
    }
}
