package org.example.services;

import org.example.models.Technicien;
import org.example.models.TypeEmploi;
import org.example.repositories.TechnicienRepository;
import org.example.repositories.TypeEmploiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicienServiceImplem  implements TecnicienService{

    @Autowired
    TechnicienRepository technicienRepository;
    @Autowired
    TypeEmploiRepository typeEmploiRepository;
    @Override
    public Technicien saveTechnicien(Technicien technicien) {
        System.out.println(technicien.getNom());
        System.out.println(technicien.getPrenom());
        return technicienRepository.save(technicien);
    }

    @Override
    public Technicien updateTechnicien(Technicien technicien) {
        return technicienRepository.save(technicien);
    }

    @Override
    public Technicien getTechnicien(Long id) {
        return technicienRepository.findById(id).get();
    }

    @Override
    public List<Technicien> getAllTechniciens() {
        return technicienRepository.findAll();
    }

    @Override
    public void deleteTechnicienById(Long id) {
        technicienRepository.deleteById(id);
    }

    @Override
    public void deleteAllTechnicien() {
        technicienRepository.deleteAll();

    }

    @Override
    public List<TypeEmploi> getAllTypeEmplois() {
        return typeEmploiRepository.findAll();
    }
}
