package com.noor.esmt.entrevoisins.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Voisin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String adresse;
    private String about;

    @OneToMany()
    private List<Voisin> favoris=new ArrayList<>();

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Voisin> getFavoris() {
        return favoris;
    }

    public void setFavoris(List<Voisin> favoris) {
        this.favoris = favoris;
    }
}
