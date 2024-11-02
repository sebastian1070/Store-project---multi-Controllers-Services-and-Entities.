package com.example.tiendaropa.controllers;



import com.example.tiendaropa.entities.CamisaEntity;
import com.example.tiendaropa.services.CamisaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/camisa")
public class CamisaController {

    private final CamisaService camisaService;

    public CamisaController(CamisaService camisaService) {
        this.camisaService = camisaService;
    }

    @GetMapping
    public List<CamisaEntity> getAllCamisa() {
        return camisaService.findAll();
    }

    @PostMapping
    public CamisaEntity createCamisa(@RequestBody CamisaEntity camisa) {
        return camisaService.save(camisa);
    }

    @DeleteMapping("/{id}")
    public void deleteCamisa(@PathVariable UUID id) {
        camisaService.delete(id);
    }
}
