package folknews.repositories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Armazenar {
  private Armazenar() {}
     public static int Write(RepositorioUtilizadores repo ){
        try (FileOutputStream fs = new FileOutputStream("Utilizadores.arq");
            ObjectOutputStream os = new ObjectOutputStream(fs)) {
            

            os.writeObject(repo); //referencia a estrutura que se quer armazenar
            os.close( );
            System.out.println("Utilizadores Guardados com Sucesso!");
            return 0;
        }catch(Exception ex){
            return -1;     
        }
    }  


  public static RepositorioUtilizadores lerDados(String caminho){
    try (FileInputStream fs = new FileInputStream(caminho);
        ObjectInputStream os = new ObjectInputStream(fs)) {

      RepositorioUtilizadores novaRepoUtilizadores = new RepositorioUtilizadores();

      novaRepoUtilizadores = (RepositorioUtilizadores)os.readObject(); //referencia a estrutura que se quer armazenar

      System.out.println("Utilizadores Carregados com Sucesso!");
      os.close( );
      return novaRepoUtilizadores;
    } catch (Exception ex) {
      System.out.println(ex.toString());
      return null;
    }
  }   
}
