package heranca.questao1;

public class Main {
	public static void main (String[] args) {
		
		IngressoVip obj1 = new IngressoVip();
		Ingresso obj2 = new Ingresso(); 
		
		obj1.setValor(10);
		obj1.setValorAdicional(2);
		
		obj2.setValor(9);
		
		System.out.println(obj2);
		System.out.println(obj1);
	}
}
