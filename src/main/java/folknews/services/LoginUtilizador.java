package folknews.services;

import java.util.Scanner;

import folknews.entities.Utilizador;
import folknews.repositories.RepositorioUtilizadores;
import folknews.views.Menu;

public class LoginUtilizador {
  Scanner scanner = new Scanner(System.in);
  
  public void execLogin(RepositorioUtilizadores repositorio) {
    String email, password;
    int pos;
    
    Utilizador u1 = new Utilizador();
    Utilizador u2 = new Utilizador();
    
    System.out.print("E-mail -> ");
    email = scanner.next();
    u1.setEmail(email);
    System.out.print("Password -> ");
    password = scanner.next();
    pos = repositorio.existeEmail(u1);
    u1.setPassword(password);
    
    if(pos != -1) {
      u2 = repositorio.getUtilizadorPorEmail(pos);

      if(u1.getPassword() != null && u1.getPassword().equals(u2.getPassword())) {
        System.out.println("Entrou no Sistema!");
      }
      Menu.execMenu();

    } else {
      System.out.println("Este e-mail não existe.");
      Menu.execMenu();
    }
  }
}
