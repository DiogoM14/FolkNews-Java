package folknews.userInputs;

import java.util.Scanner;

import folknews.App;
import folknews.repositories.ArmazenarArtigos;
import folknews.repositories.RepositorioArtigos;
import folknews.repositories.RepositorioUtilizadores;
import folknews.services.AlteraArtigo;
import folknews.services.CriarArtigo;
import folknews.services.EliminaArtigo;
import folknews.views.MenuEditor;

public class AppEditor {
  private AppEditor() {}

  public static void execWorkspace(String email, RepositorioUtilizadores repo, RepositorioArtigos repositorioArtigos) {
    Scanner scanner = new Scanner(System.in);

    CriarArtigo cria = new CriarArtigo();
    EliminaArtigo elimina = new EliminaArtigo();

    MenuEditor.execMenuEditor();
    
    int opcao = -1;
    
    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 0:
        App.execApp(repo, repositorioArtigos);
        break;
        case 1:
        cria.execRegistaArtigo(repositorioArtigos, email);
        break;
        case 2:
        AlteraArtigo.execAlteraArtigo(repositorioArtigos, email);
        MenuEditor.execMenuEditor();
        break;
        case 3:
        elimina.execEliminarArtigo(repositorioArtigos, email);
        break;
        case 4:
        System.out.println(repositorioArtigos.toString());
        MenuEditor.execMenuEditor();
        break;
        case 5:
        ArmazenarArtigos.Write(repositorioArtigos);
        MenuEditor.execMenuEditor();
        break;
        default:
        System.out.println("Opção inválida.");
      }
    } while (opcao != -1);
    scanner.close();
  }
}
