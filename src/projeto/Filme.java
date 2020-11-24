package projeto;

import java.util.Date;

public class Filme {
  // Atributos
  private String nome;
  private String descricao;
  private Date dataDeLancamento;
  private int numeroDeVisualizacoes;
  private String genero;

  // Método Construtor
  public Filme(String nome, String descricao, Date dataDeLancamento, int numeroDeVisualizacoes, String genero) {
    this.nome = nome;
    this.descricao = descricao;
    this.dataDeLancamento = dataDeLancamento;
    this.numeroDeVisualizacoes = numeroDeVisualizacoes;
    this.genero = genero;
  }

  // Métodos Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Date getDataDeLancamento() {
    return dataDeLancamento;
  }

  public void setDataDeLancamento(Date dataDeLancamento) {
    this.dataDeLancamento = dataDeLancamento;
  }

  public int getNumeroDeVisualizacoes() {
    return numeroDeVisualizacoes;
  }

  public void setNumeroDeVisualizacoes(int numeroDeVisualizacoes) {
    this.numeroDeVisualizacoes = numeroDeVisualizacoes;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }
  
  // Métodos
  
  // Método responsável por adicionar um filme
  public void adicionarFilme() {
    
  }
  
  // Método responsável por remover um filme
  public void removerFilme() {
    
  }
  
  // Método responsável por editar um filme
  public void editarFilme() {
    
  }
  
  // Método responsável por exibir um filme
  public void mostrarFilme() {
    
  }
}
