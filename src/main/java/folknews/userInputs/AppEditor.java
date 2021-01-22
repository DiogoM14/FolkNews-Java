package folknews.userInputs;

import java.util.Scanner;

import folknews.App;
import folknews.repositories.RepositorioArtigos;
import folknews.services.CriarArtigo;
import folknews.views.MenuEditor;

public class AppEditor {
  private AppEditor() {}

  public static void execWorkspace(String email) {
    Scanner scanner = new Scanner(System.in);

    RepositorioArtigos repositorio = new RepositorioArtigos();
    CriarArtigo cria = new CriarArtigo();

    MenuEditor.execMenuEditor();
    
    int opcao = -1;
    
    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 0:
        App.main(null);
        break;
        case 1:
        cria.execRegistaArtigo(repositorio, email);
        break;
        case 2:
        // AppLeitor.execWorkspaceLeitor(repositorio);
        break;
        default:
        System.out.println("Opção inválida.");
      }
    } while (opcao != -1);
    scanner.close();
  }
}
