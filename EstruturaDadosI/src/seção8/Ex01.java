package seção8;
/*
 * Fazer um programa que exibe uma janela para o usuï¿½rio
fornecer um nï¿½mero, o programa deverï¿½ exibir esta
janela enquanto o usuï¿½rio nï¿½o pressionar Cancel ou
fechar a janela. Os nï¿½meros deverï¿½o ser armazenados
em um array. Ao final, o programa deverï¿½ imprimir os
nï¿½meros em ordem crescente.
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
	