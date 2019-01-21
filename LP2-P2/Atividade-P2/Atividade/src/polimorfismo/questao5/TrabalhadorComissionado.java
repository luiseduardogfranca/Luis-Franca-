package polimorfismo.questao5;

public class TrabalhadorComissionado extends Empregado{
	
	private double salario; 
	private double comissao; 
	private double qtdVendas; 
	
	public TrabalhadorComissionado(String nome, String cpf, String rg, double salario, double comissao, double qtd) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setSalario(salario);
		setComissao(comissao);
		setQtdVendas(qtd);
	}
	
	@Override
	public double calcularGanho() {
		return salario +  (comissao * qtdVendas);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(double qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
	
	

}
