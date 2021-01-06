package folknews;

import java.util.Scanner;

import folknews.entities.Utilizador;
import folknews.repositories.RepositorioUtilizadores;
import folknews.views.Menu;

public class App {
    public static void main( String[] args ) {
        // RepositorioUtilizadores r1 = new RepositorioUtilizadores();
        Scanner scanner = new Scanner(System.in);
        Menu.execMenu();

        int opcao = 0;

        do {
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("LOGIN");
                    break;
                case 2:
                    System.out.println("REGISTO");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();


        // Utilizador u1 = new Utilizador("Diogo", "diogo@gmail.com", "12345", "Dev", "10-01-2002", "Ação");
        // Utilizador u2 = new Utilizador("Diogo", "diogo@gmail.com", "12345", "Dev", "10-01-2002", "Ação");
        // r1.addUtilizador(u1);
        // r1.addUtilizador(u2);
        // System.out.println(r1.toString());
    }
}
