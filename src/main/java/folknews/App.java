package folknews;

import java.util.Scanner;

import folknews.repositories.Armazenar;
import folknews.repositories.RepositorioUtilizadores;
import folknews.services.InicializaAdmin;
import folknews.services.LoginUtilizador;
import folknews.services.RegistarUtilizador;
import folknews.views.Menu;

public class App {
    public static void main( String[] args ) {
        
        RepositorioUtilizadores repositorio = new RepositorioUtilizadores();    // Instância classe responsavel por guardar os utilizadores

        InicializaAdmin.execIniciaAdmin(repositorio);   // Cria a conta de Admin

        execApp(repositorio);
    }

    public static void execApp(RepositorioUtilizadores repositorio) {
        Scanner scanner = new Scanner(System.in);

        LoginUtilizador login = new LoginUtilizador();  // Instância classe responsavel pelo login
        RegistarUtilizador registar = new RegistarUtilizador(); // Instância classe responsavel pelo registo

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
                Menu.execMenu();
                break;
                case 3:
                Armazenar.Write(repositorio);
                break;
                default:
                System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
