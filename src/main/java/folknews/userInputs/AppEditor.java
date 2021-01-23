package folknews.userInputs;

import java.util.Scanner;

import folknews.App;
import folknews.repositories.RepositorioArtigos;
import folknews.services.CriarArtigo;
import folknews.services.EliminaArtigo;
import folknews.views.MenuEditor;

public class AppEditor {
  private AppEditor() {}

  public static void execWorkspace(String email) {
    Scanner scanner = new Scanner(System.in);

    RepositorioArtigos repositorio = new RepositorioArtigos();
    CriarArtigo cria = new CriarArtigo();
    EliminaArtigo elimina = new EliminaArtigo();

    MenuEditor.execMenuEditor();
    
    int opcao = -1;
    
    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 0:
        App.execApp(null);
        break;
        case 1:
        cria.execRegistaArtigo(repositorio, email);
        break;
        case 2:
        break;
        case 3:
        elimina.execEliminarArtigo(repositorio, email);
        break;
        case 4:
        System.out.println(repositorio.toString());
        MenuEditor.execMenuEditor();
        break;
        default:
        System.out.println("Opção inválida.");
      }
    } while (opcao != -1);
    scanner.close();
  }
}
