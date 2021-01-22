package folknews.services;

import folknews.entities.Utilizador;
import folknews.entities.enums.TipoUtilizador;
import folknews.repositories.RepositorioUtilizadores;

public class InicializaAdmin {
  private InicializaAdmin() {}

  public static void execIniciaAdmin(RepositorioUtilizadores repositorio) {
    Utilizador admin = new Utilizador();

    TipoUtilizador userTypeEnum = TipoUtilizador.valueOf("ADMIN");
    admin = new Utilizador("", "admin", "admin", "", "", "", userTypeEnum);
    repositorio.addUtilizador(admin);
  }
}
