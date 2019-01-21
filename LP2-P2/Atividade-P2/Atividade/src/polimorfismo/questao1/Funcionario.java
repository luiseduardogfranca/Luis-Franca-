package polimorfismo.questao1;

public class Funcionario {
	private String nome; 
	private String cpf; 
	private String email; 
	private String registro; 
	private String dataNascimento; 
	private String funcao; 
	private String senha; 
	
	public void realizarLogin(int registro, String senha) {
		System.out.println("Login efetuado com registro");
	}
	
	public void realizarLogin(String email, String senha) {
		System.out.println("Login efetuado com e-mail");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
