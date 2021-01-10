package folknews.userInputs;

import java.util.Scanner;

import folknews.repositories.RepositorioArtigos;
import folknews.services.CriarArtigo;
import folknews.views.MenuEditor;

public class AppEditor {
  // private AppEditor() {}

  public static void execWorkspace() {
    Scanner scanner = new Scanner(System.in);

    RepositorioArtigos repositorio = new RepositorioArtigos();
    CriarArtigo cria = new CriarArtigo();

    MenuEditor.execMenuEditor();
    
    int opcao = 0;
    
    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 0:
        break;
        case 1:
        cria.execRegistaArtigo(repositorio);
        break;
        case 2:
        System.out.println("FOI!");
        break;
        default:
        System.out.println("Opção inválida.");
      }
    } while (opcao != 0);
    scanner.close();
  }
}
