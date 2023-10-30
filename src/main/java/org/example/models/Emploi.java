package org.example.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Emploi {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nom;
    @OneToMany(mappedBy = "emploi")
    private List<TypeEmploi> typeEmplois ;

    public Emploi(){}

    public Emploi(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
