package com.example.tiendaropa.services;


import com.example.tiendaropa.entities.CamisaEntity;
import com.example.tiendaropa.repositories.CamisaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class CamisaService {

    private final CamisaRepository camisaRepository;

    public CamisaService(CamisaRepository camisaRepository) {
        this.camisaRepository = camisaRepository;
    }

    public List<CamisaEntity> findAll() {
        return camisaRepository.findAll();
    }

    public CamisaEntity save(CamisaEntity camisa) {
        camisa.setId(UUID.randomUUID());
        return camisaRepository.save(camisa);
    }

    public void delete(UUID id) {
        camisaRepository.deleteById(id);
    }
}
