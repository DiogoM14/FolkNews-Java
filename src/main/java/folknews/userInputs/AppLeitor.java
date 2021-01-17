package folknews.userInputs;

import java.util.Scanner;

import folknews.repositories.RepositorioArtigos;
import folknews.views.MenuLeitor;

public class AppLeitor {
  public static void execWorkspaceLeitor() {
    Scanner scanner = new Scanner(System.in);

    RepositorioArtigos repositorio = new RepositorioArtigos();

    MenuLeitor.execMenuLeitor();
    
    int opcao = 0;
    
    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 0:
        break;
        case 1:
        System.out.println(repositorio.toString());
        break;
        default:
        System.out.println("Opção inválida.");
      }
    } while (opcao != 0);
    scanner.close();
  }
}
