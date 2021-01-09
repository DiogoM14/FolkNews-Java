package folknews;

import java.util.Scanner;

import folknews.views.MenuEditor;

public class AppEditor {
  // private AppEditor() {}

  public static void execWorkspace() {
    Scanner scanner = new Scanner(System.in);

    MenuEditor.execMenuEditor();
    
    int opcao = 0;
    
    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 1:
        System.out.println("FOI!");
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
