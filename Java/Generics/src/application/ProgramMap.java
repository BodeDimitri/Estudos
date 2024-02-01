package application;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> cookies = new TreeMap<>(); //Map usa chave e valor, por isso duas coisas entre as <>
		
		cookies.put("username", "aa"); //.put adiciona  
		cookies.put("da", "123");
		
		cookies.remove("da"); // Apaga
		
		cookies.put("username", "aaa+"); //Caso haja repetição, apenas sera sobrescrito
		
		
		for(String key : cookies.keySet()) { //KeySet retorna um set com as chaves do map
			System.out.println(key + ": " + cookies.get(key)); //get retorna baseado na chave que foi passada
		}
	}

}
