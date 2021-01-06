package folknews.entities;
// Cada autor é caraterizado por nome, profissão, data de nascimento e o tema de escrita preferencial. 
public class Utilizador {
  private String nome;
  private String email;
  private String password;
  private String Profissao;
  private String DataNascimento;
  private String TemaPreferencial;

  public Utilizador(String nome, String email, String password, String Profissao, String DataNascimento, String TemaPreferencial) {
    this.nome = nome;
    this.email = email;
    this.password = password;
    this.Profissao = Profissao;
    this.DataNascimento = DataNascimento;
    this.TemaPreferencial = TemaPreferencial;
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
    return this.Profissao;
  }

  public void setProfissao(String Profissao) {
    this.Profissao = Profissao;
  }

  public String getDataNascimento() {
    return this.DataNascimento;
  }

  public void setDataNascimento(String DataNascimento) {
    this.DataNascimento = DataNascimento;
  }

  public String getTemaPreferencial() {
    return this.TemaPreferencial;
  }

  public void setTemaPreferencial(String TemaPreferencial) {
    this.TemaPreferencial = TemaPreferencial;
  }

  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", email='" + getEmail() + "'" +
      ", password='" + getPassword() + "'" +
      ", Profissao='" + getProfissao() + "'" +
      ", DataNascimento='" + getDataNascimento() + "'" +
      ", TemaPreferencial='" + getTemaPreferencial() + "'" +
      "}";
  }

}
