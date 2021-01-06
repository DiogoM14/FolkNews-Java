package folknews;

import java.util.Scanner;

import folknews.repositories.RepositorioUtilizadores;
import folknews.services.RegistarUtilizador;
import folknews.views.Menu;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        RegistarUtilizador registar = new RegistarUtilizador();
        RepositorioUtilizadores repositorio = new RepositorioUtilizadores();
        
        Menu.execMenu();
        
        int opcao = 0;

        do {
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("LOGIN");
                    break;
                case 2:
                    registar.execRegisto(repositorio);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
