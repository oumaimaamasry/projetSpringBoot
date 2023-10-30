package org.example.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TypeEmploi {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nom;
    @ManyToOne
    private Emploi emploi;
    @OneToMany(mappedBy = "typeEmploi")
    private List<Technicien> techniciens;
    public TypeEmploi(){}

    public TypeEmploi(Long id, String nom) {
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

    public Emploi getEmploi() {
        return emploi;
    }

    public void setEmploi(Emploi emploi) {
        this.emploi = emploi;
    }
}
