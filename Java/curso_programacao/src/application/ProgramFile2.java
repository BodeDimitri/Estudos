package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "c::\\";
		FileReader fr = null; //Instanciados
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr); //Sim, um e usado como parametro pelo outro
			
			String line = br.readLine();
			
			while (line != null) { //So vai ser nulo quando acabar as linhas
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (br != null) {
				br.close();
			}
			if (fr != null) {
				fr.close();
			}
		}
	}
}
