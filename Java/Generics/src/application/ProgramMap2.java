package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class ProgramMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file full path: ");
		
		Map<String, Integer> candidates = new TreeMap<>(); 
		
		String path = sc.nextLine();
		
		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
			
			String line = bf.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				
				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);
				
				if (candidates.containsKey(name)) { 
					int votesnow = candidates.get(name); // vai começar com zero e vai sendo somada
					candidates.put(name, votes + votesnow);
				} else {
					candidates.put(name, votes);
				}
				
				//candidates.put(fields[0], Double.valueOf(fields[1]));
				line = bf.readLine();
			}
			for(String key : candidates.keySet()) { //KeySet retorna um set com as chaves do map
				System.out.println(key + ": " + candidates.get(key)); //get retorna baseado na chave que foi passada
			}
			
		} catch (IOException e){
			System.out.println(e);
		}
		
		
		sc.close();
	}

}
