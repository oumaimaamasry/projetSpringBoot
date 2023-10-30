package org.example.services;

import org.example.models.Technicien;
import org.example.models.TypeEmploi;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TecnicienService {
    Technicien saveTechnicien(Technicien technicien);

    Technicien updateTechnicien(Technicien technicien);

    Technicien getTechnicien(Long id);

    List<Technicien> getAllTechniciens();

    void deleteTechnicienById(Long id);

    void deleteAllTechnicien();
    List<TypeEmploi> getAllTypeEmplois();
}
