package folknews.services;

import java.util.Scanner;

import folknews.entities.Artigo;
import folknews.repositories.RepositorioArtigos;
import folknews.repositories.RepositorioUtilizadores;
import folknews.views.MenuEditor;

public class CriarArtigo extends RepositorioUtilizadores {
  Scanner scanner = new Scanner(System.in);
  
  public void execRegistaArtigo(RepositorioArtigos repositorio, String email) {
    String titulo, resumo, corpoArtigo, dataPub;

    Artigo a1 = new Artigo();

    // Formulário -------------------------------------------------------
    System.out.println("\n");
    System.out.print("Titulo do Artigo -> ");
    titulo = scanner.nextLine();
    System.out.print("Resumo do Artigo -> ");
    resumo = scanner.nextLine();
    System.out.print("Corpo do Artigo -> ");
    corpoArtigo = scanner.nextLine();
    System.out.print("Data de Publicação -> ");
    dataPub = scanner.nextLine();
    // ----------------------------------------------------------------

    a1 = new Artigo(email, titulo, resumo, corpoArtigo, dataPub);
    repositorio.addArtigo(a1);
    System.out.println(repositorio.toString());
    MenuEditor.execMenuEditor();
  }
}
