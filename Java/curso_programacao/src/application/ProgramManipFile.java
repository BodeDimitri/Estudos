package application;

import java.io.File;
import java.util.Scanner;

public class ProgramManipFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre um diretorio: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath); //Seleciona o diretorio
		
		File[] folders = path.listFiles(File::isDirectory); //Cria uma array para listar os arquivos no diretorio
		
		
		System.out.println("Pastas: ");
		for(File folder : folders) { //Le o Array ja criado
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\Pastacriada").mkdir(); //Mesmo comando que o linux, usado para criar um diretorio
		System.out.println("Diretorio criado com sucesso:  " + sucess);
		
		sc.close();
	}

}
