package com.br.petshop.src.utils;

public class SerializerId {
  private int id;

  public SerializerId() {
    this.id = 0;
  }

  public int createNewId() {
    this.id = this.id + 1;

    return this.id;
  }
}
