package org.example.services;


import org.example.models.Emploi;
import org.example.models.TypeEmploi;
import org.example.repositories.EmploiRepository;
import org.example.repositories.TypeEmploiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeEmploiServiceImplem implements TypeEmploiService {
    @Autowired
    TypeEmploiRepository typeEmploiRepository;
    @Autowired
    EmploiRepository emploiRepository;
    @Override
    public TypeEmploi saveTypeEmploi(TypeEmploi typeEmploi) {
        return typeEmploiRepository.save(typeEmploi);
    }
    @Override
    public TypeEmploi updateTypeEmploi(TypeEmploi typeEmploi) {
        return typeEmploiRepository.save(typeEmploi);
    }
    @Override
    public TypeEmploi getTypeEmploi(Long id) {
        return typeEmploiRepository.findById(id).get();
    }
    @Override
    public List<TypeEmploi> getAllTypeEmplois() {
        return typeEmploiRepository.findAll();
    }
    @Override
    public void deleteTypeEmploiById(Long id) {
        typeEmploiRepository.deleteById(id);
    }
    @Override
    public void deleteAllTypeEmplois() {
        typeEmploiRepository.deleteAll();
    }
    @Override
    public List<Emploi> getAllEmplois() {
        return emploiRepository.findAll();
    }
}
