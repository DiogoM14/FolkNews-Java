package folknews.views;

public class Menu {
  private Menu() {}

  public static void execMenu() {
    System.out.println("\n");
    System.out.println("\tBem-Vindo ao FolkNews!");
    System.out.println("0. Sair");
    System.out.println("1. Entrar");
    System.out.println("2. Registar");
    System.out.println("3. Guardar Artigos");
    System.out.println("4. Guardar Utilizadores");
    System.out.println("5. Carregar Ficheiro de Artigos");
    System.out.println("6. Carregar Ficheiro de Utilizadores");
    System.out.print("Opcao: ");
  }
}
