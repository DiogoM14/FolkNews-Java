package folknews.services;

import java.util.Scanner;

import folknews.entities.Artigo;
import folknews.repositories.RepositorioArtigos;
import folknews.repositories.RepositorioUtilizadores;
import folknews.views.MenuEditor;

public class CriarArtigo extends RepositorioUtilizadores {
  Scanner scanner = new Scanner(System.in);
  
  public void execRegistaArtigo(RepositorioArtigos repositorio) {
    String titulo, resumo, corpoArtigo, dataPub, imagem, autor, url, dataFimPub;

    Artigo a1 = new Artigo();
    RepositorioUtilizadores u1 = new RepositorioUtilizadores();

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
    System.out.print("Imagem -> ");
    imagem = scanner.nextLine();
    System.out.print("Autor -> ");
    autor = scanner.nextLine();
    System.out.print("Link externo -> ");
    url = scanner.nextLine();
    System.out.print("Data de fim de Publicação -> ");
    dataFimPub = scanner.nextLine();
    // ----------------------------------------------------------------

    a1 = new Artigo(titulo, resumo, corpoArtigo, dataPub, imagem, autor, url, dataFimPub);
    repositorio.addArtigo(a1);
    System.out.println(repositorio.toString());
    MenuEditor.execMenuEditor();
  }
}
