package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float peso, pesoMaior, pesoMenor;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu peso: ");
		peso = sc.nextFloat();
		pesoMaior = peso + peso*15/100;
		pesoMenor = peso - peso*20/100;
		System.out.println("Caso engordasse 15%, o peso seria " + pesoMaior);
		System.out.println("Caso emagrecesse 20%, o peso seria " + pesoMenor);
		sc.close();
	}

}
