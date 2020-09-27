package ExRetangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			double largura;
			double comprimento;
			
			Retangulo retanguloA = new Retangulo(0, 0);
			retangulo1.calcArea(0, 0);
			retangulo1.calcPerimetro(0, 0);
			
			System.out.println("informe o comprimento do retângulo ");
			comprimento = input.nextDouble();

			System.out.println("informe a largura do retângulo ");
			largura = input.nextDouble();
			
			Retangulo retanguloB = new Retangulo(comprimento,largura);
			retanguloB.calcArea(largura, comprimento);
			retanguloB.calcPerimetro(largura, comprimento);
		}
		
		
		

	}

}