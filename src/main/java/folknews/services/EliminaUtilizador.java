package folknews.services;

import java.util.Scanner;

import folknews.entities.Utilizador;
import folknews.repositories.RepositorioUtilizadores;
import folknews.views.MenuEditor;

public class EliminaUtilizador {
  static Scanner scanner = new Scanner(System.in);
  
  public static void execEliminarUtilizador(RepositorioUtilizadores repositorio) {
    String email;
    int pos = 0;

    Utilizador u1 = new Utilizador();

    System.out.print("Introduza o e-mail do Utilizador a remover -> ");
    email = scanner.next();
    u1.setEmail(email);
    pos = repositorio.existeEmail(u1);
    
    if (pos != -1) { // Se E-mail registado
      repositorio.removeUtilizador(pos);
      System.out.println("Eliminado com sucesso!");
    } else {
      System.out.println("Utilizador não encontrado!");
    }

    MenuEditor.execMenuEditor();
  }
}
