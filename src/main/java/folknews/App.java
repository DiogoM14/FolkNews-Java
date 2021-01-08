package folknews;

import java.util.Scanner;

import folknews.repositories.RepositorioUtilizadores;
import folknews.services.LoginUtilizador;
import folknews.services.RegistarUtilizador;
import folknews.views.Menu;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        RepositorioUtilizadores repositorio = new RepositorioUtilizadores();
        LoginUtilizador login = new LoginUtilizador();
        RegistarUtilizador registar = new RegistarUtilizador();
        
        Menu.execMenu();
        
        int opcao = 0;

        do {
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    login.execLogin(repositorio);
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
