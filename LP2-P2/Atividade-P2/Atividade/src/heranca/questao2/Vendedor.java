package heranca.questao2;

public class Vendedor extends Empregado {
	public Vendedor(String nome, float salario, float percentual) {
		super();
		setNome(nome);
		setPercentualComissao(percentual);
		setSalario(salario);
	}
	
	private float percentualComissao; 
		
	public float getPercentualComissao() {
		return percentualComissao;
	}
	
	public void setPercentualComissao(float percentual) {
		this.percentualComissao = percentual; 
	}
	
	public float calcularSalario() {
		float salario = getSalario();
		salario += salario * (percentualComissao / 100);
		
		return salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + 
				"\nSalário: R$" + getSalario()  + 
				"\nSalário c/ comissão: R$" + calcularSalario();
	}
}
