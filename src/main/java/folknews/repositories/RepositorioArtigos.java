package folknews.repositories;

import java.io.Serializable;
import java.util.ArrayList;

import folknews.entities.Artigo;

public class RepositorioArtigos implements Serializable {
  /**
	 *
	 */
	private static final long serialVersionUID = 1L;
private ArrayList<Artigo> arrayArtigos = new ArrayList<>();  // Lista de Users

  public RepositorioArtigos() {  // Constructor
  }

  public void addArtigo(Artigo artigo) { // Regista Utilizador
    this.arrayArtigos.add(artigo);
  }

  public int existeArtigo(Artigo titulo) {
    // System.out.println(titulo);
    return this.arrayArtigos.indexOf(titulo);
  }

  public Artigo getArtigo(int pos) {
    return this.arrayArtigos.get(pos);
  }

  public void actualizaArtigo(int pos, Artigo artigo) {
    this.arrayArtigos.set(pos, artigo);
  }
  
  public void removeArtigo(int pos) {
    this.arrayArtigos.remove(pos);
  }
  
  // Receber Lista de todos os Users registados
  @Override
  public String toString() {
    return "{" +
      " Todos os Artigos ='" + arrayArtigos + "'" +
      "}";
  }
}
