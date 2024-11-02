package com.example.tiendaropa.repositories;



import com.example.tiendaropa.entities.PantalonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PantalonRepository extends JpaRepository<PantalonEntity, UUID> {
}
