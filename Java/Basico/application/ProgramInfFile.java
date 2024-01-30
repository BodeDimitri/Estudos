package application;

import java.io.File;
import java.util.Scanner;

public class ProgramInfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre o diretorio");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName()); //Varios funções para conseguir informação dos arquivos
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
	}

}
