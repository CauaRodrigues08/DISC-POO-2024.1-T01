package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
	int nLados, nDiagonais;
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite a quantidade de lados do polígono: ");
	nLados = sc.nextInt();
	nDiagonais = nLados * (nLados - 3)/2;
	System.out.println("O polígono possui " + nDiagonais + " diagonais");
	sc.close();
	
	}

}
