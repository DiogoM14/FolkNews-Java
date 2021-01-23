package folknews.repositories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Armazenar {
  public static boolean Write(RepositorioUtilizadores repositorio){
    try {
      FileWriter arq = new FileWriter("Utilizadores.txt");
      PrintWriter gravarArq = new PrintWriter(arq);
      gravarArq.println(repositorio);
      gravarArq.close();
      System.out.println("GRAVOU");
      return true;
    } catch(IOException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }
  
  // public static String Read(String Caminho){
  //   String conteudo = "";
  //   try {
  //     FileReader arq = new FileReader(Caminho);
  //     BufferedReader lerArq = new BufferedReader(arq);
  //     String linha="";
  //     try {
  //       linha = lerArq.readLine();
  //       while(linha!=null){
  //         conteudo += linha+"\n";
  //         linha = lerArq.readLine();
  //       }
  //       arq.close();
  //       return conteudo;
  //     } catch (IOException ex) {
  //       System.out.println("Erro: Não foi possível ler o arquivo!");
  //       return "";
  //     }
  //   } catch (FileNotFoundException ex) {
  //     System.out.println("Erro: Arquivo não encontrado!");
  //     return "";
  //   }
  // }
}
