package com.br.petshop.src.routes;

import com.br.petshop.src.controller.animal.CreateAnimal;
import com.br.petshop.src.controller.animal.DeleteAnimal;
import com.br.petshop.src.controller.animal.GetForm;
import com.br.petshop.src.controller.animal.ListAnimals;
import com.br.petshop.src.model.Animal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animals")
public class AnimalRoutes {
  @GetMapping(path = "")
  public String list(Model model) {
    return ListAnimals.execute(model);
  }

  @GetMapping(path = "/create")
  public String formCreate(Model model) {
    return GetForm.execute(model);
  }

  @PostMapping(path = "/create")
  public String list(@ModelAttribute("animal") Animal animal, Model model) {
    return CreateAnimal.execute(animal, model);
  }

  @GetMapping(path = "/delete/{id}")
  public String list(@PathVariable String id) {
    return DeleteAnimal.execute(id);
  }
}
