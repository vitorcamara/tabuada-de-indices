package com.vitorcamara.projetos;

import java.util.Scanner;

public class TabuadaDeIndices {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int multi = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o numero da posicao " + i + ":");
			vetorA[i] = scan.nextInt();

		}

		System.out.println("====TABUADA====");

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("==== TABUADA DE " + vetorA[i] + " ====");

			for (int j = 1; j <= 10; j++) {
				multi = vetorA[i] * j;

				System.out.println(vetorA[i] + " x " + j + " = " + multi);

			}

			System.out.println();
		}

	}
}
