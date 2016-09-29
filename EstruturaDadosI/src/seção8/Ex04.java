package seção8;

public class Ex04 {
	public static void main(String[] args) {
		char N[][] = new char [5][3];
		
        N = GeraMatriz();    
		ImprimeVetor(N);
		ImprimeTransposta(N);
		
	}
	public static char [][] GeraMatriz(){
		char N[][] = new char [5][3];
		char c = 'A';
		for (char[] N1 : N) {
            for (int j = 0; j < N1.length; j++) {
                N1[j] = c++;
            }
        }
		return N;
	}
	public static void ImprimeVetor(char M[][]){
		System.out.println("N[5][3] = ");
		for(char i [] : M){
			for(char j : i){
				System.out.print(j + "\t");
			}
			System.out.print("\n");
		}
	}
	public static void ImprimeTransposta(char N[][]){
		char M[][] = new char[3][5];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = N[j][i];
			}
		}
		System.out.println();
		System.out.println("N^-1[3][5] =");
		for(char i [] : M){
			for(char j : i){
				System.out.print(j + "\t");
			}
			System.out.print("\n");
		}
		System.out.println();
	}
}
