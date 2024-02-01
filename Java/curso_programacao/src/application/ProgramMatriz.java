package application;

import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = 0, col = 0;
		
		
		col = sc.nextInt(); //coluna
		row = sc.nextInt(); //fileira
		int [][] matriz = new int[col][row]; 
		
        for (int i = 0; i < matriz.length; i++) { //Usa o length da matriz
            for (int j = 0; j < matriz[i].length; j++) { //Usa o length da matriz se baseando onde esta o I
                matriz[i][j] = sc.nextInt(); //Com esses fors ele vai começar de 0,0 e seguindo em frente
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            	System.out.printf(matriz[i][j] + " ");
            }
            System.out.println(""); //Para ter o espaço entre as linhas
        }
        
        System.out.println("Qual número vai ser encontrado? ");
        int numeroEncontrar = sc.nextInt();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            	if(matriz[i][j] == numeroEncontrar) {
            		System.out.println("Posição: " + (i + "," +  j)); //coluna e fileira
            		if(i > 0) { //Sempre retornava um número negativo, então se for menor que zero executa
            			System.out.println("Superior:" + (i - 1 + "," + j));//Superior;
            		} else {
	            		System.out.println("Superior:" );//Superior
            		}
            		if(i < matriz.length - 1) { 
                		System.out.println("Inferior: " + (i + 1 + "," + j));//Inferior
            		} else {
            			System.out.println("Inferior: ");
            		}
            		if(j > 0) {
                		System.out.println("Esquerda: " + (i + "," + (j - 1)));//Esquerda
            		} else {
                		System.out.println("Esquerda: ");
            		}
            		if(j < matriz.length - 1) {
                		System.out.println("Direita: " + (i + "," + (j + 1)));//Direita
            		} else {
            			System.out.println("Direita: ");
            		}
            		
            	}
            }
        }
        
		sc.close();
	}

}
