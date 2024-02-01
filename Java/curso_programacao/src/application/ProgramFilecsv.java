package application;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class ProgramFilecsv {
// Fazer outra tentativa, ta bem ruim
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = null;

		
		try {
			File path = new File("C:\\Users\\diego\\OneDrive\\Área de Trabalho\\source.txt"); //File em questão
			
			System.out.println(path.getAbsolutePath()); //Primeiro pedido
			
			sc = new Scanner(path);
			while (sc.hasNextLine()) {
				String line = sc.nextLine(); //Armazena o que foi digitado
				//System.out.println(sc.nextLine()); //Ta imprimindo
				
				String[] strArray = line.split(","); //Dividi a string por ","
				for (int i = 0; i < strArray.length; i++) {
					System.out.println(strArray[i] );
					
				}
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		sc.close();
	}

}
