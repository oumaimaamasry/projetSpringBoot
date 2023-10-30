package org.example.services;


import org.example.models.Emploi;
import org.example.models.TypeEmploi;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeEmploiService {
    TypeEmploi saveTypeEmploi(TypeEmploi typeEmploi);

    TypeEmploi updateTypeEmploi(TypeEmploi typeEmploi);

    TypeEmploi getTypeEmploi(Long id);

    List<TypeEmploi> getAllTypeEmplois();

    void deleteTypeEmploiById(Long id);

    void deleteAllTypeEmplois();
    List<Emploi> getAllEmplois();

}
