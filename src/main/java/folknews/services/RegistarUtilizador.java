package folknews.services;

import java.util.Scanner;

import folknews.entities.Utilizador;
import folknews.entities.enums.TipoUtilizador;
import folknews.repositories.RepositorioUtilizadores;
import folknews.views.Menu;

public class RegistarUtilizador {
  static Scanner scanner = new Scanner(System.in);
  
  public static void execRegisto(RepositorioUtilizadores repositorio) {
    String nome, email, password, profissao, dataNascimento, temaPreferencial;
    int tipoUtilizador, pos = 0;

    Utilizador u1 = new Utilizador(); // Instância o objeto da class utilizador

    // Formulário -------------------------------------------------------
    System.out.println("\n");
    System.out.println("Prima alguma tecla para continuar... ");
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
    System.out.print("Tipo de Registo (1 = EDITOR, 2 = LEITOR) -> ");
    tipoUtilizador = scanner.nextInt();
    // ----------------------------------------------------------------

     while (tipoUtilizador != 1 && tipoUtilizador != 2) {
      System.out.print("Escolha o tipo de Registo entre 1 ou 2 (1 = EDITOR, 2 = LEITOR) -> ");
      tipoUtilizador = scanner.nextInt();
    }

    if (tipoUtilizador == 1) {
      TipoUtilizador userTypeEnum = TipoUtilizador.valueOf("EDITOR");
      u1 = new Utilizador(nome, email.toLowerCase(), password, profissao, dataNascimento, temaPreferencial, userTypeEnum);
      pos = repositorio.existeEmail(u1);
    } else if (tipoUtilizador == 2) {
      TipoUtilizador userTypeEnum = TipoUtilizador.valueOf("LEITOR");
      u1 = new Utilizador(nome, email.toLowerCase(), password, profissao, dataNascimento, temaPreferencial, userTypeEnum);
      pos = repositorio.existeEmail(u1);
    }
    // ----------------------------------------------------------------

    if(pos != -1) { // Se E-mail registado
      System.out.println("E-mail já registado.");

    } else {
      repositorio.addUtilizador(u1);
      // System.out.println(repositorio.toString());

    }
  }
}
