package com.br.petshop.src.controller.animal;

import java.util.List;

import com.br.petshop.src.model.Animal;
import com.br.petshop.src.repositories.AnimalsRepository;

import org.springframework.ui.Model;

public class ListAnimals {
  public static String execute(Model model) {
    AnimalsRepository animalsRepository = AnimalsRepository.getInstace();

    List<Animal> animals = animalsRepository.get();
    model.addAttribute("animals", animals);

    return "pages/animals/index";
  }
}
