package folknews.repositories;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;


public class Armazenar {
  private Armazenar() {}
  
  public static boolean Write(RepositorioUtilizadores repositorio){
    try {
      FileWriter arq = new FileWriter("Utilizadores.arq");
      PrintWriter gravarArq = new PrintWriter(arq);
      gravarArq.println(repositorio);
      gravarArq.close();
      System.out.println("Utilizadores guardados com sucesso!");
      return true;
    } catch(IOException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }
  
  public static RepositorioUtilizadores lerDados(String caminho){
    try (FileInputStream fs = new FileInputStream(caminho);
        ObjectInputStream os = new ObjectInputStream(fs)) {

      RepositorioUtilizadores novaRepoUtilizadores = new RepositorioUtilizadores();
      
      novaRepoUtilizadores = (RepositorioUtilizadores)os.readObject(); //referencia a estrutura que se quer armazenar

      System.out.println("Dados Salvos com Sucesso!");
      os.close();
      return novaRepoUtilizadores;
    } catch (Exception ex) {
      System.out.println(ex.toString());
      return null;
    }
  }   
}
