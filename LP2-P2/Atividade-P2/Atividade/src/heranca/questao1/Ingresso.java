package heranca.questao1;

public class Ingresso {
	private float valor; 
	
	public float getValor() {
		return valor; 
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Valor do ingresso: R$" + getValor();
	}
}
