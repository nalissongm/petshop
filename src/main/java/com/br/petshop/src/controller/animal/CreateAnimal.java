package com.br.petshop.src.controller.animal;

import java.util.List;

import com.br.petshop.src.model.Animal;
import com.br.petshop.src.repositories.AnimalsRepository;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public class CreateAnimal {
  public static String execute(@ModelAttribute("animal") Animal animal, Model model) {
    AnimalsRepository animalsRepository = AnimalsRepository.getInstace();

    animalsRepository.add(animal.getName(), animal.getRace(), animal.getSpecie());

    List<Animal> animals = animalsRepository.get();
    model.addAttribute("animals", animals);

    return "redirect:/animals";
  }
}
