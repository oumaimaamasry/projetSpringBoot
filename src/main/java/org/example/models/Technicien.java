package org.example.models;

import jakarta.persistence.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Entity
public class Technicien {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String telephone;
    private String imageUrl;
   // @Value("${chemin.vers.repertoire}")
    //private String cheminVersRepertoire;




    @ManyToOne
    private TypeEmploi typeEmploi;

    public Technicien(){}

    public Technicien(Long id, String nom, String prenom, String telephone, String imageUrl) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.imageUrl = imageUrl;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public TypeEmploi getTypeEmploi() {
        return typeEmploi;
    }

    public void setTypeEmploi(TypeEmploi typeEmploi) {
        this.typeEmploi = typeEmploi;
    }
}
