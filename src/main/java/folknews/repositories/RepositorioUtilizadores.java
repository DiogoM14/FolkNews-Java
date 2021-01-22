package folknews.repositories;

import java.util.ArrayList;

import folknews.entities.Utilizador;
import folknews.entities.enums.TipoUtilizador;

public class RepositorioUtilizadores {
  private ArrayList<Utilizador> arrayUtilizadores = new ArrayList<>();  // Lista de Users

  int tipoUtilizador = 0;

  public RepositorioUtilizadores() {  // Constructor
  }

  public void addAdmin(Utilizador admin) { // Regista Utilizador
    this.arrayUtilizadores.add(admin);
  }

  public void addUtilizador(Utilizador user) { // Regista Utilizador
    this.arrayUtilizadores.add(user);
  }

  public int existeEmail(Utilizador email) {
    return this.arrayUtilizadores.indexOf(email);
  }

  public Utilizador getUtilizadorPorEmail(int pos) {
    // System.out.println("REPOSITORY USER ENCONTRADO" + this.arrayUtilizadores.get(pos));
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
