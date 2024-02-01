package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enteties.FileReaderProducts;

public class ProgramFilecsv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <FileReaderProducts> list = new ArrayList<>();
		
		System.out.println("Entre o diretorio em questão: ");
		String sourceFileStr = sc.nextLine(); //Diretorio
		
		File sourceFile = new File(sourceFileStr); //Acessa o diretorio
		String sourceFolderStr = sourceFile.getParent(); //Pega o caminho
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir(); //Cria a nova pasta
		
		System.out.println("Pasta criada: " + success);
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			String itemCsv = br.readLine(); //Le uma linha inteira
			while (itemCsv != null) { // So vai dar nulo quando o bloco de nota acabar
				
				String[] strArray = itemCsv.split(","); //Dividi por uma virgula
				
				String name = strArray[0];
				double price = Double.parseDouble(strArray[1]);
				double quantity = Double.parseDouble(strArray[2]);
				
				list.add(new FileReaderProducts(name, price, quantity));
				
				itemCsv = br.readLine(); //Obtem as linhas
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for (FileReaderProducts item : list) {
					bw.write(item.getNome() + ", " + String.format("%.2f",item.getTotal()));
					bw.newLine();
				}
				
			}catch (IOException e ) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
