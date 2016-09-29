package seção8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	

	private static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int M[] = new int [5];
		for (int i = 0; i < M.length; i++) {
			System.out.print("Digite um número: ");
			M[i] = entrada.nextInt();
			if(i >= 1){
				for (int j = 0; j < i; j++) {
					if(M[i] == M[j]){
						System.out.print("Número repetido, digite outro: ");
						M[i] = entrada.nextInt();
						j--;
					}
				}
			}
		}
		Arrays.sort(M);
		ImprimeVetor(M); 
	}
	public static void ImprimeVetor(int M[]){
		System.out.print("M[] = ");
		for (int i = 0; i < M.length; i++) {
			while(M.length - i > 1){
				System.out.print(M[i] + ", ");
				i++;
			}
			System.out.println(M[i] + ".");
		}
	}
}
