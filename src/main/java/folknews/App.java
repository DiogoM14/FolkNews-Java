package folknews;

import java.util.ArrayList;
import java.util.Scanner;

import folknews.repositories.RepositorioArtigos;
import folknews.repositories.RepositorioUtilizadores;
import folknews.services.InicializaAdmin;
import folknews.services.LoginUtilizador;
import folknews.services.RegistarUtilizador;
import folknews.userInputs.AppAdmin;
import folknews.views.Menu;

public class App {
    public static void main( String[] args ) {
        
        RepositorioUtilizadores repositorio = new RepositorioUtilizadores();


        InicializaAdmin.execIniciaAdmin(repositorio);
        
        // AppAdmin.execWorkspaceAdmin(repositorio);

        execApp(repositorio);
    }
    public static void execApp(RepositorioUtilizadores repositorio) {
        Scanner scanner = new Scanner(System.in);

        LoginUtilizador login = new LoginUtilizador();
        RegistarUtilizador registar = new RegistarUtilizador();

        Menu.execMenu();
        
        int opcao = 0;
        
        do {
            opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                break;
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
