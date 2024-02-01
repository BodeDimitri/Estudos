package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("c:\\"); // Instancia o arquivo
		Scanner sc = null; //Por enqunato deixar como null
		try {
			sc = new Scanner(file); //Coloca o file como argumento de leitura
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine()); //Vai imprimir todas as linhas enquanto ele tiver
			}
			
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
