package com.br.petshop.src.model;

public class Animal {
  private int id;
  private String name;
  private String race;
  private String specie;

  public Animal(String name, String race, String specie) {
    this.name = name;
    this.race = race;
    this.specie = specie;
  }

  public Animal() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public String getSpecie() {
    return specie;
  }

  public void setSpecie(String specie) {
    this.specie = specie;
  }
}
