package projeto;

public class Usuario {
  // Atributos
  private String nome;
  private String nomeDeUsuario;
  private String email;
  private long cpf;
  
  // Método construtor
  public Usuario(String nome, String nomeDeUsuario, String email, long cpf) {
    this.nome = nome;
    this.nomeDeUsuario = nomeDeUsuario;
    this.email = email;
    this.cpf = cpf;
  }

  // Métodos Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNomeDeUsuario() {
    return nomeDeUsuario;
  }

  public void setNomeDeUsuario(String nomeDeUsuario) {
    this.nomeDeUsuario = nomeDeUsuario;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getCpf() {
    return cpf;
  }

  public void setCpf(long cpf) {
    this.cpf = cpf;
  }
  
  // Métodos
  
  // Método responsável por marcar um filme como visto
  public void marcarComoVisto() {
    
  }
  
  // Método responsável por desmarcar um filme como visto
  public void desmarcarComoVisto() {
    
  }
  
  // Método responsável por curtir um filme
  public void curtirFilme() {
    
  }
  
  // Método responsável por descurtir um filme
  public void descurtirFilme() {
    
  }
}
