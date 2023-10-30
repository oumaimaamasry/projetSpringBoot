package org.example.repositories;

import org.example.models.TypeEmploi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TypeEmploiRepository extends JpaRepository<TypeEmploi,Long> {
}
