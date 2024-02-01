package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramBuffWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lines = new String[]  {"A", "B", "C"};
		
		String path = "c::\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { //se acrescentar o parametro true ele não recria o arquivo e so adiciona a linha
			for (String line : lines) {
				bw.write(line); //Iterando as linhas e escrevendo uma por linha
				bw.newLine(); //Para dar espaçamento de uma linha
			}
		} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
