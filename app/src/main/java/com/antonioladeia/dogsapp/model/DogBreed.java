package com.antonioladeia.dogsapp.model;

public class DogBreed {

    public String breedId;
    public String dogBreed;
    public String lifeSpan;
    public String breedGroup;
    public String bredFor;
    public String temperament;
    public String imageUrl;
    public int uuid;

    public DogBreed(String breedId, String dogBreed, String lifeSpan, String breedGroup, String bredFor, String temperament, String imageUrl) {
        this.breedId = breedId;
        this.dogBreed = dogBreed;
        this.lifeSpan = lifeSpan;
        this.breedGroup = breedGroup;
        this.bredFor = bredFor;
        this.temperament = temperament;
        this.imageUrl = imageUrl;
    }
}
