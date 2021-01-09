package folknews.entities;

import java.util.Objects;

public class Artigo {
  private String titulo;
  private String resumo;
  private String corpoArtigo;
  private String dataPub;
  private String imagem;
  private String autor;
  private String url;
  private String dataFimPub;

  public Artigo() {
  }

  public Artigo(String titulo, String resumo, String corpoArtigo, String dataPub, String imagem, String autor, String url, String dataFimPub) {
    this.titulo = titulo;
    this.resumo = resumo;
    this.corpoArtigo = corpoArtigo;
    this.dataPub = dataPub;
    this.imagem = imagem;
    this.autor = autor;
    this.url = url;
    this.dataFimPub = dataFimPub;
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

  public String getImagem() {
    return this.imagem;
  }

  public void setImagem(String imagem) {
    this.imagem = imagem;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getDataFimPub() {
    return this.dataFimPub;
  }

  public void setDataFimPub(String dataFimPub) {
    this.dataFimPub = dataFimPub;
  }

  @Override
  public String toString() {
    return "{" +
      " titulo='" + getTitulo() + "'" +
      ", resumo='" + getResumo() + "'" +
      ", corpoArtigo='" + getCorpoArtigo() + "'" +
      ", dataPub='" + getDataPub() + "'" +
      ", imagem='" + getImagem() + "'" +
      ", autor='" + getAutor() + "'" +
      ", url='" + getUrl() + "'" +
      ", dataFimPub='" + getDataFimPub() + "'" +
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
        return Objects.equals(titulo, artigo.titulo) && Objects.equals(resumo, artigo.resumo) && Objects.equals(corpoArtigo, artigo.corpoArtigo) && Objects.equals(dataPub, artigo.dataPub) && Objects.equals(imagem, artigo.imagem) && Objects.equals(autor, artigo.autor) && Objects.equals(url, artigo.url) && Objects.equals(dataFimPub, artigo.dataFimPub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titulo, resumo, corpoArtigo, dataPub, imagem, autor, url, dataFimPub);
  }
}
