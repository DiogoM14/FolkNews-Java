package folknews.entities;

import java.io.Serializable;
import java.util.Objects;

import folknews.entities.enums.TipoUtilizador;

public class Utilizador implements Serializable {
  /**
	 *
	 */
	private static final long serialVersionUID = 1L;
private String nome;
  private String email;
  private String password;
  private String profissao;
  private String dataNascimento;
  private String temaPreferencial;
  private TipoUtilizador tipoUtilizador;

  public Utilizador() {}

  public Utilizador(String nome, String email, String password, String profissao, String dataNascimento, String temaPreferencial, TipoUtilizador tipoUtilizador) {
    this.nome = nome;
    this.email = email;
    this.password = password;
    this.profissao = profissao;
    this.dataNascimento = dataNascimento;
    this.temaPreferencial = temaPreferencial;
    this.tipoUtilizador = tipoUtilizador;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getProfissao() {
    return this.profissao;
  }

  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  public String getDataNascimento() {
    return this.dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getTemaPreferencial() {
    return this.temaPreferencial;
  }

  public void setTemaPreferencial(String temaPreferencial) {
    this.temaPreferencial = temaPreferencial;
  }

  public TipoUtilizador getTipoUtilizador() {
    return this.tipoUtilizador;
  }

  public void setTipoUtilizador(TipoUtilizador tipoUtilizador) {
    this.tipoUtilizador = tipoUtilizador;
  }

  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", email='" + getEmail() + "'" +
      ", password='" + getPassword() + "'" +
      ", profissao='" + getProfissao() + "'" +
      ", dataNascimento='" + getDataNascimento() + "'" +
      ", temaPreferencial='" + getTemaPreferencial() + "'" +
      ", tipoUtilizador='" + getTipoUtilizador() + "'" +
      "}";
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Utilizador)) {
            return false;
        }
        Utilizador utilizador = (Utilizador) o;
        return Objects.equals(email, utilizador.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email);
  }
}
