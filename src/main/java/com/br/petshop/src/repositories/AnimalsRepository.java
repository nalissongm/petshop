package com.br.petshop.src.repositories;

import java.util.ArrayList;
import java.util.List;

import com.br.petshop.src.model.Animal;
import com.br.petshop.src.utils.SerializerId;

public class AnimalsRepository {
  private List<Animal> animals;
  private SerializerId id;

  private static AnimalsRepository instance;

  private AnimalsRepository() {
    this.animals = new ArrayList<>();
    this.id = new SerializerId();
  }

  public static AnimalsRepository getInstace() {
    if (AnimalsRepository.instance == null) {
      AnimalsRepository.instance = new AnimalsRepository();
    }

    return AnimalsRepository.instance;
  }

  public void add(String name, String race, String specie) {
    Animal animal = new Animal(name, race, specie);

    if (animal.getId() == 0) {
      animal.setId(id.createNewId());
    }

    this.animals.add(animal);
  }

  public List<Animal> get() {
    return this.animals;
  }

  public Animal findAnimalById(int id) {
    for (Animal animal : this.animals) {
      if (animal.getId() == id) {
        return animal;
      }
    }

    return null;
  }

  public void remove(Animal animal) {
    this.animals.remove(animal);
  }
}