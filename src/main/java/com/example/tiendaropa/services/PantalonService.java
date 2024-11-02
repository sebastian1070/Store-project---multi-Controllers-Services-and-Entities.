package com.example.tiendaropa.services;



import com.example.tiendaropa.entities.PantalonEntity;
import com.example.tiendaropa.repositories.PantalonRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class PantalonService {

    private final PantalonRepository pantalonRepository;

    public PantalonService(PantalonRepository pantalonRepository) {
        this.pantalonRepository = pantalonRepository;
    }

    public List<PantalonEntity> findAll() {
        return pantalonRepository.findAll();
    }

    public PantalonEntity save(PantalonEntity pantalon) {
        pantalon.setId(UUID.randomUUID());
        return pantalonRepository.save(pantalon);
    }

    public void delete(UUID id) {
        pantalonRepository.deleteById(id);
    }
}
