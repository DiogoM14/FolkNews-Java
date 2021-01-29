package folknews.services;

import folknews.repositories.Armazenar;
import folknews.repositories.RepositorioUtilizadores;

public class LerFicheiroUtilizadores {
  private LerFicheiroUtilizadores() {}

  //Lê informação do ficheiro e carrega no repositório de Utilizadores
  public static RepositorioUtilizadores ler() {
    RepositorioUtilizadores repo = new RepositorioUtilizadores();
    
    repo = Armazenar.lerDados("Utilizadores.arq");
    return repo;
  }
}
