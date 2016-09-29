package se��o8;
/*
 * Fazer um programa que exibe uma janela para o usu�rio
fornecer um n�mero, o programa dever� exibir esta
janela enquanto o usu�rio n�o pressionar Cancel ou
fechar a janela. Os n�meros dever�o ser armazenados
em um array. Ao final, o programa dever� imprimir os
n�meros em ordem crescente.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader leitor = new BufferedReader(in);
		try {
		System.out.print("Digite a quantidade de dados que quer inserir: ");
		
			int k = Integer.parseInt(leitor.readLine());
			int x;
			int [] M = new int[k];
			
			for (int i = 0; i < M.length; i++) {
				System.out.print("Informe o valor a ser inserido: ");
				x = Integer.parseInt(leitor.readLine());
				M[i] = x;
			}
			//Arrays.sort(M);
			ImprimeVetor(M);
		} catch (NumberFormatException | IOException e) {
		}
	
	
	}
				/*METODOS*/
	public static void ImprimeVetor(int M[]){
		System.out.print("V[] = ");
		for (int i = 0; i < M.length; i++) {
			while(M.length - i > 1){
				System.out.print(M[i] + ", ");
				i++;
			}
			System.out.println(M[i] + ".");
		}
	}
}
	