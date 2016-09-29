package seção8;

import java.util.Random;

public class Ex06 {
	public static void main(String[] args) {
		int M[] = new int [10];
		int N[] = new int [10];
		M = MatrizAleatoria();
		N =MatrizAleatoria();
		
		System.out.print("M[10] = ");
		ImprimeVetor(M);
		System.out.print("\nN[10] = ");
		ImprimeVetor(N);
		System.out.print("\nO[10] = ");
		
		ImprimeVetor(SomaDuasMatrizes(M, N));
		
	}
	public static int[] MatrizAleatoria(){
		Random random = new Random();
		int M[] = new int [10];
		for (int i = 0; i < M.length; i++) {
			M[i] = random.nextInt(10) + 10; 
		}
		return M;
	}
	 public static void ImprimeVetor(int M[]){
			for (int i = 0; i < M.length; i++) {
				while(M.length - i > 1){
					System.out.print(M[i] + ", ");
					i++;
				}
				System.out.println(M[i] + ".");
			}
		}
	 public static int[] SomaDuasMatrizes(int[] M,int [] N){
		 int [] O = new int [10];
		 for (int i = 0; i < O.length; i++) {
				O[i] = M[i] + N[i];
			}
		 return O;
	 }
	 
}
