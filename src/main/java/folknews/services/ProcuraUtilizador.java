package folknews.services;

import java.util.Scanner;

import folknews.entities.Utilizador;
import folknews.repositories.RepositorioUtilizadores;

public class ProcuraUtilizador {
  Scanner scanner = new Scanner(System.in);

  public int execProcura(RepositorioUtilizadores repositorio) {
    String email;
    int pos;
    
    Utilizador u1 = new Utilizador();

    System.out.println("\n");
    System.out.print("E-mail a procurar -> ");
    email = scanner.next();
    u1.setEmail(email);
    pos = repositorio.existeEmail(u1);

    if(pos != -1) { // Se email existe
      repositorio.getUtilizadorPorEmail(pos);
      System.out.println(u1.toString());
      return(pos);
    } else {
      System.out.println("Este e-mail não existe.");
      return(-1);
    }
  }
}
