package application;

import java.util.Scanner;

public class ProgramMatrizSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int negativeNumbers = 0;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for(int i = 0; n > i; i++) { // 0, 0, 0 // 1, 1, 1
			for(int j = 0; n > j; j++) { // 0, 1, 2 //0, 1, 2
				matriz[i][j] = sc.nextInt(); //Digitar o número das arrays bidimensionais
			}
		}
		
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            	System.out.printf(matriz[i][j] + " "); //Aqui elas estão sendo printadas
            }
            System.out.println(""); //Para ter o espaço entre as linhas
        }
        
        System.out.println("Diagonal:");
        
        for(int i = 0; i < n; i++) {
        	System.out.print((matriz[i][i]) + " ");
        }
        System.out.println();
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
            	if(matriz[i][j] < 0) {
            		negativeNumbers++;
            	}
            }
        }
		System.out.println("Números negativos: " + negativeNumbers);
		sc.close();
	}

}
