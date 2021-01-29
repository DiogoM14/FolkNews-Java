package folknews.repositories;

import java.io.Serializable;
import java.util.ArrayList;

import folknews.entities.Utilizador;

public class RepositorioUtilizadores implements Serializable {
/**
	 *
	 */
	private static final long serialVersionUID = 1L;
private ArrayList<Utilizador> arrayUtilizadores = new ArrayList<>();  // Lista de Users

  public RepositorioUtilizadores() {  // Constructor
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

  public void actualizaUtilizador(int pos, Utilizador utilizador) {
    this.arrayUtilizadores.set(pos, utilizador);
  }

  public void removeUtilizador(int pos) {
    this.arrayUtilizadores.remove(pos);
  }

  // Receber Lista de todos os Users registados
  @Override
  public String toString() {
    return "{" +
      " Todos os Utilizadores ='" + arrayUtilizadores + "'" +
      "}";
  }
}
