package org.example.services;

import org.example.models.Emploi;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmploiService {
    Emploi saveEmploi(Emploi emploi);

    Emploi updateEmploi(Emploi emploi);

    Emploi getEmploi(Long id);

    List<Emploi> getAllEmplois();

    void deleteEmploiById(Long id);

    void deleteAllEmplois();
}

