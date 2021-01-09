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
    Utilizador utilizadorFiltrado = new Utilizador();
    
    System.out.println("\n");
    System.out.print("E-mail -> ");
    email = scanner.next();
    u1.setEmail(email);
    System.out.print("Password -> ");
    password = scanner.next();
    pos = repositorio.existeEmail(u1);
    u1.setPassword(password);
    
    if(pos != -1) { // Se E-mail registado
      utilizadorFiltrado = repositorio.getUtilizadorPorEmail(pos);  // Objeto com email filtrado

      if(u1.getPassword() != null && u1.getPassword().equals(utilizadorFiltrado.getPassword())) {

        switch (utilizadorFiltrado.getTipoUtilizador()) {
          case ADMIN:
            System.out.println("ADMIN");
            break;
          case EDITOR:
            System.out.println("EDITOR");
            break;
          case LEITOR:
            System.out.println("LEITOR");
            break;
          default:
            System.out.println("Erro");
        }

        System.out.println("Entrou no Sistema!");
      }
      Menu.execMenu();

    } else {
      System.out.println("Este e-mail não existe.");
      Menu.execMenu();
    }
  }
}