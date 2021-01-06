package folknews.repositories;

import java.util.ArrayList;

import folknews.entities.Utilizador;

public class RepositorioUtilizadores {
  private ArrayList<Utilizador> arrayUtilizadores = new ArrayList<>();  // Lista de Users

  public RepositorioUtilizadores() {  // Constructor
  }

  public void addUtilizador(Utilizador user) { // Regista Utilizador
    this.arrayUtilizadores.add(user);
  }

  public int existeEmail(Utilizador user) {
    return this.arrayUtilizadores.indexOf(user);
  }

  public Utilizador getUtilizadorPorEmail(int pos) {
    return this.arrayUtilizadores.get(pos);
  }

  public Utilizador getUtilizadorPorEmail(Utilizador email) {
    int pos;
    pos = this.arrayUtilizadores.indexOf(email);
    return this.arrayUtilizadores.get(pos);
  }

  // public void removeUtilizador(Utilizador email) {
  //   this.arrayUtilizadores.remove(email);
  // }

  // Receber Lista de todos os Users registados
  @Override
  public String toString() {
    return "{" +
      " Todos os Utilizadores ='" + arrayUtilizadores + "'" +
      "}";
  }

}
