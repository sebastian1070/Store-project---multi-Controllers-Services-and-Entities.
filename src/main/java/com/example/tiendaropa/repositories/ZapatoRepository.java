package com.example.tiendaropa.repositories;



import com.example.tiendaropa.entities.ZapatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ZapatoRepository extends JpaRepository<ZapatoEntity, UUID> {
}
