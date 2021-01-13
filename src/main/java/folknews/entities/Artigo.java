package folknews.entities;

import java.util.Objects;

public class Artigo {
  private String autor;
  private String titulo;
  private String resumo;
  private String corpoArtigo;
  private String dataPub;
  
  public Artigo() {
  }

  public Artigo(String autor, String titulo, String resumo, String corpoArtigo, String dataPub) {
    this.autor = autor;
    this.titulo = titulo;
    this.resumo = resumo;
    this.corpoArtigo = corpoArtigo;
    this.dataPub = dataPub;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getResumo() {
    return this.resumo;
  }

  public void setResumo(String resumo) {
    this.resumo = resumo;
  }

  public String getCorpoArtigo() {
    return this.corpoArtigo;
  }

  public void setCorpoArtigo(String corpoArtigo) {
    this.corpoArtigo = corpoArtigo;
  }

  public String getDataPub() {
    return this.dataPub;
  }

  public void setDataPub(String dataPub) {
    this.dataPub = dataPub;
  }

  @Override
  public String toString() {
    return "{" +
      " autor='" + getAutor() + "'" +
      ", titulo='" + getTitulo() + "'" +
      ", resumo='" + getResumo() + "'" +
      ", corpoArtigo='" + getCorpoArtigo() + "'" +
      ", dataPub='" + getDataPub() + "'" +
      "}";
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Artigo)) {
            return false;
        }
        Artigo artigo = (Artigo) o;
        return Objects.equals(autor, artigo.autor) && Objects.equals(titulo, artigo.titulo) && Objects.equals(resumo, artigo.resumo) && Objects.equals(corpoArtigo, artigo.corpoArtigo) && Objects.equals(dataPub, artigo.dataPub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autor, titulo, resumo, corpoArtigo, dataPub);
  }
}