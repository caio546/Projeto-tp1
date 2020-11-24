package projeto;

import java.util.Date;

public class Comentario {
  // Atributos
  private String tituloDoComentario;
  private String textoDoComentario;
  private Date dataDoComentario;
  private int quantidadeDeCurtidas;
  
  // Método Construtor
  public Comentario(String tituloDoComentario, String textoDoComentario, Date dataDoComentario, int quantidadeDeCurtidas) {
    this.tituloDoComentario = tituloDoComentario;
    this.textoDoComentario = textoDoComentario;
    this.dataDoComentario = dataDoComentario;
    this.quantidadeDeCurtidas = quantidadeDeCurtidas;
  }

  // Métodos Getters e Setters
  public String getTituloDoComentario() {
    return tituloDoComentario;
  }

  public void setTituloDoComentario(String tituloDoComentario) {
    this.tituloDoComentario = tituloDoComentario;
  }

  public String getTextoDoComentario() {
    return textoDoComentario;
  }

  public void setTextoDoComentario(String textoDoComentario) {
    this.textoDoComentario = textoDoComentario;
  }

  public Date getDataDoComentario() {
    return dataDoComentario;
  }

  public void setDataDoComentario(Date dataDoComentario) {
    this.dataDoComentario = dataDoComentario;
  }

  public int getQuantidadeDeCurtidas() {
    return quantidadeDeCurtidas;
  }

  public void setQuantidadeDeCurtidas(int quantidadeDeCurtidas) {
    this.quantidadeDeCurtidas = quantidadeDeCurtidas;
  }
  
  // Métodos
  
  // Método responsável por adicionar um novo comentário
  public void adicionarComentario() {
    
  }
  
  // Método responsável por excluit um comentário
  public void excluirComentario() {
    
  }
  
  // Método responsável por curtir um comentário
  public void curtirComentario() {
    
  }
  
  // Método responsável por descurtir um comentário
  public void descurtirComentario() {
    
  }
}
