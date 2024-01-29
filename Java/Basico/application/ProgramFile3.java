package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "c::\\";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { //Muito melhor essa versão compacta
			
			String line = br.readLine();
			
			while (line != null) { //So vai ser nulo quando acabar as linhas
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
