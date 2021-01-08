package folknews.services;

import java.util.Scanner;

import folknews.entities.Utilizador;
import folknews.repositories.RepositorioUtilizadores;
import folknews.views.Menu;

public class RegistarUtilizador {
  Scanner scanner = new Scanner(System.in);
  
  public void execRegisto(RepositorioUtilizadores repositorio) {
    String nome, email, password, profissao, dataNascimento, temaPreferencial;
    Utilizador u1 = new Utilizador(); // Instância o objeto da class utilizador

    // Formulário -------------------------------------------------------
    scanner.nextLine();
    System.out.print("Nome e Apelido -> ");
    nome = scanner.nextLine();
    System.out.print("E-mail -> ");
    email = scanner.nextLine();
    System.out.print("Palavra-Passe -> ");  
    password = scanner.nextLine();
    System.out.print("Profissão -> ");
    profissao = scanner.nextLine();
    System.out.print("Data de Nascimento -> ");
    dataNascimento = scanner.nextLine();
    System.out.print("Tema Preferêncial -> ");
    temaPreferencial = scanner.nextLine();
    // ----------------------------------------------------------------

    u1 = new Utilizador(nome, email, password, profissao, dataNascimento, temaPreferencial);

    
    repositorio.addUtilizador(u1);
    System.out.println(repositorio.toString());
    Menu.execMenu();
  }
}
