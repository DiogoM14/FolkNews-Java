package folknews.repositories;

import java.util.ArrayList;

import folknews.entities.Utilizador;

public class RepositorioUtilizadores {
  private ArrayList<Utilizador> arrayUtilizadores = new ArrayList<>();  // Lista de Users

  public RepositorioUtilizadores() {  // Constructor
  }

  public void addUtilizador(Utilizador u) {
    this.arrayUtilizadores.add(u);
  }

  // Receber Lista de todos os Users registados

  @Override
  public String toString() {
    return "{" +
      " Todos os Utilizadores ='" + arrayUtilizadores + "'" +
      "}";
  }

}
