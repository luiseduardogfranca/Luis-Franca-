package polimorfismo.questao3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Float> numeros = new ArrayList<Float>();

//		tipos de operecoes
		Adicao soma  = new Adicao();
		Subtracao subtracao = new Subtracao();
		Multiplicacao mult = new Multiplicacao();
		Divisao divisao = new Divisao();
		
		float numero;
		
		do {
			numero = in.nextFloat();
			
			if(numero != 0) {
				numeros.add(numero);
			}
			
		}while(numero != 0);
		
		if (numeros.size() == 2) {
			System.out.println("Soma: " + soma.calcular(numeros.get(0), numeros.get(1)));
			System.out.println("Subtração: " + subtracao.calcular(numeros.get(0), numeros.get(1)));
			System.out.println("Multiplicação: " + mult.calcular(numeros.get(0), numeros.get(1)));
			System.out.println("Divisão: " + divisao.calcular(numeros.get(0), numeros.get(1)));

		
		}else {
			System.out.println("Soma: " + soma.calcular(numeros));
			System.out.println("Subtração: " + subtracao.calcular(numeros));
			System.out.println("Multiplicação: " + mult.calcular(numeros));
			System.out.println("Divisão: " + divisao.calcular(numeros));

		}
	}

}
