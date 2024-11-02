package com.example.tiendaropa.services;



import com.example.tiendaropa.entities.ZapatoEntity;
import com.example.tiendaropa.repositories.ZapatoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ZapatoService {

    private final ZapatoRepository zapatoRepository;

    public ZapatoService(ZapatoRepository zapatoRepository) {
        this.zapatoRepository = zapatoRepository;
    }

    public List<ZapatoEntity> findAll() {
        return zapatoRepository.findAll();
    }

    public ZapatoEntity save(ZapatoEntity zapato) {
        zapato.setId(UUID.randomUUID());
        return zapatoRepository.save(zapato);
    }

    public void delete(UUID id) {
        zapatoRepository.deleteById(id);
    }
}
