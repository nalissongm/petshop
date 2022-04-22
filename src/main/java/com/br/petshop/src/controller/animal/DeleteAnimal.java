package com.br.petshop.src.controller.animal;

import com.br.petshop.src.model.Animal;
import com.br.petshop.src.repositories.AnimalsRepository;

public class DeleteAnimal {
  public static String execute(String id) {
    AnimalsRepository animalsRepository = AnimalsRepository.getInstace();

    int idAnimal = Integer.parseInt(id);

    Animal animal = animalsRepository.findAnimalById(idAnimal);

    animalsRepository.remove(animal);

    return "redirect:/animals";
  }
}
