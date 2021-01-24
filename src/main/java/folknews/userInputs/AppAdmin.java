package folknews.userInputs;

import java.util.Scanner;

import folknews.App;
import folknews.repositories.Armazenar;
import folknews.repositories.RepositorioUtilizadores;
import folknews.views.MenuAdmin;

public class AppAdmin {
  private AppAdmin() {}

  public static void execWorkspaceAdmin(RepositorioUtilizadores repositorio) {
    Scanner scanner = new Scanner(System.in);

    MenuAdmin.execMenuAdmin();
    
    int opcao = -1;
    
    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 0:
        // App.execApp(repositorio);
        break;
        case 1:
        break;
        case 2:
        break;
        case 4:
        break;
        case 5:
        System.out.println(repositorio.toString());
        MenuAdmin.execMenuAdmin();
        break;
        case 6:
        Armazenar.Write(repositorio);
        MenuAdmin.execMenuAdmin();
        break;
        default:
        System.out.println("Opção inválida.");
      }
    } while (opcao != -1);
    scanner.close();
  }
}
