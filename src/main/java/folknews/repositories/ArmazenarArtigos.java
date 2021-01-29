package folknews.repositories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ArmazenarArtigos {
  private ArmazenarArtigos() {}
  
  public static int Write(RepositorioArtigos repo ){
    try (FileOutputStream fs = new FileOutputStream("Artigos.arq");
    ObjectOutputStream os = new ObjectOutputStream(fs)) {
      
      
      os.writeObject(repo); //referencia a estrutura que se quer armazenar
      os.close( );
      System.out.println("Artigos Guardados com Sucesso!");
      return 0;
    }catch(Exception ex){
      return -1;     
    }
  }  
  
  public static RepositorioArtigos lerDados(String caminho){
    try (FileInputStream fs = new FileInputStream(caminho);
    ObjectInputStream os = new ObjectInputStream(fs)) {
      
      RepositorioArtigos novaRepoArtigos = new RepositorioArtigos();
      
      novaRepoArtigos = (RepositorioArtigos)os.readObject(); //referencia a estrutura que se quer armazenar
      
      System.out.println("Artigos Carregados com Sucesso!");
      os.close( );
      return novaRepoArtigos;
    } catch (Exception ex) {
      System.out.println(ex.toString());
      return null;
    }
  }   
}
