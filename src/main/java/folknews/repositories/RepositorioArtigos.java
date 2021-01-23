package folknews.repositories;

import java.util.ArrayList;

import folknews.entities.Artigo;

public class RepositorioArtigos {
  private ArrayList<Artigo> arrayArtigos = new ArrayList<>();  // Lista de Users

  public RepositorioArtigos() {  // Constructor
  }

  public void addArtigo(Artigo artigo) { // Regista Utilizador
    this.arrayArtigos.add(artigo);
  }

  public int existeArtigo(Artigo titulo) {
    System.out.println(titulo);
    return this.arrayArtigos.indexOf(titulo);
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
