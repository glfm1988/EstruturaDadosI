/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*

*/
package seção8;


import java.util.Random;

public class Ex05 {
    public static void main(String[] args) {
    	int M[] = new int [10];
    	M = GeraMatriz();
    	ImprimeVetor(M);
    	
    	
    	System.out.println("\nA soma de todos os elementos da matriz é: " + SomaMatriz(M));
    	
    	System.out.println("A média da soma dos elementos da matriz é : " + MediaMatriz(M));
	}
    public static int [] GeraMatriz(){
    	Random random = new Random();
    	int [] M = new int [10];
    	for (int i = 0; i < M.length; i++) {
			M[i] = random.nextInt(11);
		}
    	return M;
    }
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
    public static int SomaMatriz(int M[]){
    	int somaMatriz = 0;
    	for (int i = 0; i < M.length; i++) {
			somaMatriz += M[i];
		}
    	return somaMatriz;
    }
    public static double MediaMatriz(int M[]){
    	return (double)SomaMatriz(M) / M.length;
    }
}
