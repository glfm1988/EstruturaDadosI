package seção8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader leitor = new BufferedReader(in);
		try {
		System.out.print("Digite a quantidade de dados que quer inserir: ");
		
			int k = Integer.parseInt(leitor.readLine());
			String x;
			String [] M = new String[k];
			
			for (int i = 0; i < M.length; i++) {
				System.out.print("Informe o valor a ser inserido: ");
				x = leitor.readLine();
				M[i] = x;
			}
			Arrays.sort(M);
			ImprimeVetor(M);
		} catch (NumberFormatException | IOException e) {
		}
	
	
	}
	public static void ImprimeVetor(String M[]){
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
