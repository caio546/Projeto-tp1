package projeto;

public class Avaliacao {
  // Atributos
  private int quantidadeDeEstrelas;
  private int dataDaAvaliacao;
  private String descricao;
  private boolean qualidade;
  
  // Método construtor
  public Avaliacao(int quantidadeDeEstrelas, int dataDaAvaliacao, String descricao, boolean qualidade) {
    this.quantidadeDeEstrelas = quantidadeDeEstrelas;
    this.dataDaAvaliacao = dataDaAvaliacao;
    this.descricao = descricao;
    this.qualidade = qualidade;
  }
  
  // Métodos Getters e Setters
  public int getQuantidadeDeEstrelas() {
    return quantidadeDeEstrelas;
  }

  public void setQuantidadeDeEstrelas(int quantidadeDeEstrelas) {
    this.quantidadeDeEstrelas = quantidadeDeEstrelas;
  }

  public int getDataDaAvaliacao() {
    return dataDaAvaliacao;
  }

  public void setDataDaAvaliacao(int dataDaAvaliacao) {
    this.dataDaAvaliacao = dataDaAvaliacao;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public boolean isQualidade() {
    return qualidade;
  }

  public void setQualidade(boolean qualidade) {
    this.qualidade = qualidade;
  }
  
  // Métodos
  
  // Método responsável por realizar uma avaliação
  public void realizarAvaliacao() {
    
  }
  
  // Método responsável por excluir uma avaliação
  public void excluirAvaliacao() {
    
  }
  
  // Método responsável por editar uma avaliação
  public void editarAvaliacao() {
    
  }
  
  // Método responsável por exibir uma avaliação
  public void verAvaliacao() {
    
  }
}
