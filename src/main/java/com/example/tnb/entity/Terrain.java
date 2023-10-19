package com.example.tnb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Terrain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double surface;

    @ManyToOne
    @JoinColumn(name = "redevable_id")
    private Redevable redevable;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categrie categorie;

    @OneToMany(mappedBy = "terrain", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Taxe> taxes;

    public Terrain() {
    }

    public Long getId() {
        return id;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Categrie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categrie categorie) {
        this.categorie = categorie;
    }

    public List<Taxe> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Taxe> taxes) {
        this.taxes = taxes;
    }
}
