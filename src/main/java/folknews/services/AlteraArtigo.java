package folknews.services;

import java.util.Scanner;

import folknews.entities.Artigo;
import folknews.repositories.RepositorioArtigos;

public class AlteraArtigo {
  private AlteraArtigo() {}

  static Scanner scanner = new Scanner(System.in);
  public static void execAlteraArtigo(RepositorioArtigos repositorio, String email) {
    String titulo, resumo, corpoArtigo, dataPub;
    int pos = 0;

    Artigo a1 = new Artigo();
    Artigo a2 = new Artigo();

    System.out.print("Introduza o título do Artigo a alterar -> ");
    titulo = scanner.next();
    a1.setTitulo(titulo);
    a1.setAutor(email);
    pos = repositorio.existeArtigo(a1);
    
    if (pos != -1) { // Se E-mail registado
      System.out.print("Introduza novo título -> ");
      titulo = repositorio.getArtigo(pos).getTitulo();
      titulo = scanner.next();
      System.out.print("Introduza novo resumo -> ");
      resumo = scanner.next();
      System.out.print("Introduza novo Corpo de Artigo -> ");
      corpoArtigo = scanner.next();
      System.out.print("Introduza nova Data de Publicação -> ");
      dataPub = scanner.next();

      a2.setAutor(email);
      a2.setTitulo(titulo);
      a2.setResumo(resumo);
      a2.setCorpoArtigo(corpoArtigo);
      a2.setDataPub(dataPub);
      repositorio.actualizaArtigo(pos, a2);
      System.out.println("Artigo alterado com sucesso!");
    } else {
      System.out.println("Artigo não encontrado!");
    }
  }
}
