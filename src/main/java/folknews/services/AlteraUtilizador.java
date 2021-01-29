package folknews.services;

import java.util.Scanner;

import folknews.entities.Utilizador;
import folknews.entities.enums.TipoUtilizador;
import folknews.repositories.RepositorioUtilizadores;

public class AlteraUtilizador {
  private AlteraUtilizador() {}

  static Scanner scanner = new Scanner(System.in);
  public static void execAlteraUtilizador(RepositorioUtilizadores repositorio) {
    String nome, email, password, profissao, dataNascimento, temaPreferencial;
    int tipoUtilizador, pos = 0;

    Utilizador u1 = new Utilizador();

    System.out.print("Introduza o e-mail do Utilizador a alterar -> ");
    email = scanner.next();
    u1.setEmail(email);
    pos = repositorio.existeEmail(u1);
    
    if (pos != -1) { // Se E-mail registado
    System.out.println("\n");
    System.out.println("Prima alguma tecla para continuar... ");
    scanner.nextLine();
    System.out.print("Novo Nome e Apelido -> ");
    nome = scanner.nextLine();
    System.out.print("Novo E-mail -> ");
    email = repositorio.getUtilizadorPorEmail(pos).getEmail();
    email = scanner.nextLine();
    System.out.print("Nova Palavra-Passe -> ");  
    password = scanner.nextLine();
    System.out.print("Nova Profissão -> ");
    profissao = scanner.nextLine();
    System.out.print("Nova Data de Nascimento -> ");
    dataNascimento = scanner.nextLine();
    System.out.print("Novo Tema Preferêncial -> ");
    temaPreferencial = scanner.nextLine();
    System.out.print("Novo Tipo de Registo (1 = EDITOR, 2 = LEITOR) -> ");
    tipoUtilizador = scanner.nextInt();

    while (tipoUtilizador != 1 && tipoUtilizador != 2) {
      System.out.print("Escolha o tipo de Registo entre 1 ou 2 (1 = EDITOR, 2 = LEITOR) -> ");
      tipoUtilizador = scanner.nextInt();
    }

    if (tipoUtilizador == 1) {
      TipoUtilizador userTypeEnum = TipoUtilizador.valueOf("EDITOR");
      u1 = new Utilizador(nome, email.toLowerCase(), password, profissao, dataNascimento, temaPreferencial, userTypeEnum);
      repositorio.actualizaUtilizador(pos, u1);
    } else if (tipoUtilizador == 2) {
      TipoUtilizador userTypeEnum = TipoUtilizador.valueOf("LEITOR");
      u1 = new Utilizador(nome, email.toLowerCase(), password, profissao, dataNascimento, temaPreferencial, userTypeEnum);
      repositorio.actualizaUtilizador(pos, u1);
    }
    // ----------------------------------------------------------------
      System.out.println("Utilizador alterado com sucesso!");
    }
  }
}
