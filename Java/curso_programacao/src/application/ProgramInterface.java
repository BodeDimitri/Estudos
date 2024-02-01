package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import enteties.EmployeeInterface;

public class ProgramInterface {
	
	public static void main(String[] args) {
		
		List<EmployeeInterface> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String eployeecsv = br.readLine();
			
			while (eployeecsv != null) {
				String[] fields = eployeecsv.split(","); //Lembra que o split vai dividir com base no que foi passado
				list.add(new EmployeeInterface(fields[0], Double.parseDouble(fields[1])));
				eployeecsv = br.readLine();
			}
			Collections.sort(list);
			for (EmployeeInterface emp : list) {
				
				System.out.println(emp.getName());
			}
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
		}
	}
}