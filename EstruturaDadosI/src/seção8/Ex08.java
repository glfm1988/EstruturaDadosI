package seção8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex08 {
	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		System.out.print("Digite o número de dezenas deseja jogar: ");
		int dezenas = entrada.nextInt();
		if(dezenas >= 6 && dezenas <= 12){
			GeraDezenas(dezenas);
		}else{
			System.out.println("Dezenas insuficientes !");
		}
	}
	
		public static void GeraDezenas(int dezenas){
			Random random = new Random();
			int M[] = new int [dezenas];
			for (int i = 0; i < M.length; i++) {
				M[i] = random.nextInt(61);
				if(i >= 1){
					for (int j = 0; j < i; j++) {
						if(M[i] == M[j]){
							M[i] = random.nextInt(61);
							j--;
						}
					}
				}
			}
			
			Arrays.sort(M);
			System.out.print("Dezenas Sugeridas = ");
			for (int i = 0; i < M.length; i++) {
				if(M.length - i != 1){
					System.out.print(M[i] +",");
				}else{
					System.out.print(M[i] + ".");			
				}
			
			}
		}
}
