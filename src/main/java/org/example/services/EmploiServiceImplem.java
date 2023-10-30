package org.example.services;


import org.example.models.Emploi;
import org.example.repositories.EmploiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploiServiceImplem implements EmploiService {
    @Autowired
    EmploiRepository emploiRepository;

    @Override
    public Emploi saveEmploi(Emploi emploi) {
        return emploiRepository.save(emploi);
    }

    @Override
    public Emploi updateEmploi(Emploi emploi) {
        return emploiRepository.save(emploi);
    }

    @Override
    public Emploi getEmploi(Long id) {
        return emploiRepository.findById(id).get();
    }

    @Override
    public List<Emploi> getAllEmplois() {
        return emploiRepository.findAll();
    }

    @Override
    public void deleteEmploiById(Long id) {
        emploiRepository.deleteById(id);
    }

    @Override
    public void deleteAllEmplois() {
        emploiRepository.deleteAll();
    }
}
