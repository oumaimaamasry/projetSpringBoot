package org.example.repositories;

import org.example.models.Emploi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmploiRepository extends JpaRepository<Emploi,Long> {
}
