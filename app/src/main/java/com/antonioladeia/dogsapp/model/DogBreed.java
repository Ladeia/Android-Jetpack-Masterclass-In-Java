package com.antonioladeia.dogsapp.model;

public class DogBreed {

    private String breedId;
    private String dogBreed;
    private String lifeSpan;
    private String breedGroup;
    private String bredFor;
    private String temperament;
    private String imageUrl;
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
