package seção8;
import java.util.Scanner;
public class Ex07 {
	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.print("Digite o número de linhas: ");
		int i = entrada.nextInt();
		System.out.print("Digite o número de colunas: ");
		int j = entrada.nextInt();
		GeraMatriz(i,j);
	
	}
	public static void GeraMatriz(int i, int j){
	int [][] M = new int [i][j];
		
		for (int k = 0; k < M.length; k++) {
			for (int k2 = 0; k2 < M[k].length; k2++) {
				if(k % 2 == 0 && k2 % 2 == 0){
					M[k][k2] = 0;
				}else if(k % 2 != 0 && k2 % 2 != 0){
					M[k][k2] = 1;
				}else{
					M[k][k2] = 2;
				}
			}
		}
		System.out.println();
		System.out.print("M[][] = ");
		System.out.println();
		for (int k = 0; k < M.length; k++) {
			for (int k2 = 0; k2 < M[k].length; k2++) {
				System.out.print(M[k][k2] + "\t");
				}
			System.out.println();
		}
	}
}
