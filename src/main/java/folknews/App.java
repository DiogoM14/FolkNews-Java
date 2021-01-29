package folknews;

import java.util.Scanner;

import folknews.repositories.Armazenar;
import folknews.repositories.ArmazenarArtigos;
import folknews.repositories.RepositorioArtigos;
import folknews.repositories.RepositorioUtilizadores;
import folknews.services.InicializaAdmin;
import folknews.services.LoginUtilizador;
import folknews.services.RegistarUtilizador;
import folknews.views.Menu;

public class App {
    public static void main( String[] args ) {
        
        RepositorioUtilizadores repositorio = new RepositorioUtilizadores();    // Instância classe responsavel por guardar os utilizadores
        RepositorioArtigos repositorioArtigos = new RepositorioArtigos();


        InicializaAdmin.execIniciaAdmin(repositorio);   // Cria a conta de Admin

        execApp(repositorio, repositorioArtigos);
    }

    public static void execApp(RepositorioUtilizadores repositorio, RepositorioArtigos repositorioArtigos) {
        Scanner scanner = new Scanner(System.in);

        LoginUtilizador login = new LoginUtilizador();  // Instância classe responsavel pelo login

        Menu.execMenu();
        
        int opcao = 0;
        
        do {
            opcao = scanner.nextInt();  
            switch (opcao) {
                case 0:
                break;
                case 1:
                login.execLogin(repositorio, repositorioArtigos);
                break;
                case 2:
                RegistarUtilizador.execRegisto(repositorio);
                Menu.execMenu();
                break;
                case 3:
                ArmazenarArtigos.Write(repositorioArtigos);
                Menu.execMenu();
                break;
                case 4:
                Armazenar.Write(repositorio);
                Menu.execMenu();
                break;
                case 5:
                repositorioArtigos = ArmazenarArtigos.lerDados("Artigos.arq");
                Menu.execMenu();
                break;
                case 6:
                repositorio = Armazenar.lerDados("Utilizadores.arq");
                System.out.print(repositorio);
                Menu.execMenu();
                break;
                default:
                System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
