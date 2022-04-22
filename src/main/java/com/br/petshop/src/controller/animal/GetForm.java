package com.br.petshop.src.controller.animal;

import com.br.petshop.src.model.Animal;

import org.springframework.ui.Model;

public class GetForm {
  public static String execute(Model model) {
    Animal animal = new Animal();
    model.addAttribute("animal", animal);

    return "pages/animals/create";
  }
}
