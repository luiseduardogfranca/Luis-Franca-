package heranca.questao2;

public class Main {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Vendedor vendedor = new Vendedor("Luís", 1000, 5);
		
		gerente.setNome("Jubileu");
		gerente.setDepartamento("Comercial");
		gerente.setSalario(5000);
		
		System.out.println("\n\nGerente: \n" + gerente);
		System.out.println("\n\nVendedor: \n" + vendedor);
	}
}
