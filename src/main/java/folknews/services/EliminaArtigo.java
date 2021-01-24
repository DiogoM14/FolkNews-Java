package folknews.services;

import java.util.Scanner;

import folknews.entities.Artigo;
import folknews.repositories.RepositorioArtigos;
import folknews.views.MenuEditor;

public class EliminaArtigo {
  Scanner scanner = new Scanner(System.in);
  
  public void execEliminarArtigo(RepositorioArtigos repositorio, String email) {
    String titulo;
    int pos = 0;

    Artigo a1 = new Artigo();

    System.out.print("Introduza o título do Artigo a remover -> ");
    titulo = scanner.next();
    a1.setTitulo(titulo);
    a1.setAutor(email);
    pos = repositorio.existeArtigo(a1);
    // System.out.println("OUTPUT REPOSITORY" + pos);
    
    if (pos != -1) { // Se E-mail registado
      repositorio.removeArtigo(pos);
      System.out.println("Eliminado com sucesso!");
    } else {
      System.out.println("Artigo não encontrado!");
    }

    MenuEditor.execMenuEditor();
  }
}
