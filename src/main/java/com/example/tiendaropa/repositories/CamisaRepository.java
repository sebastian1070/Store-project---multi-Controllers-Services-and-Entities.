package com.example.tiendaropa.repositories;



import com.example.tiendaropa.entities.CamisaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CamisaRepository extends JpaRepository<CamisaEntity, UUID> {
}
