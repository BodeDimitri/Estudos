package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ProgramEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bufumfa = 0;
		int indexCerto = 0;
		double salarioCerto = 0;
		List<Integer> id = new ArrayList<>(); 
		List<String> name = new ArrayList<>();
		List<Double> salary = new ArrayList<>(); 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos empregados vão ser registrados?");
		
		int empregados = sc.nextInt();
		
		for(int i = 0; i < empregados; i++) {
			System.out.println("Empregados #" + (i + 1));
			System.out.println("Id: ");
			id.add(sc.nextInt()); //Primeiro a lista e depois o Scanner
			System.out.println("Nome: ");
			name.add(sc.next()); 
			System.out.println("Salario: ");
			salary.add(sc.nextDouble());
		}
		
		System.out.println("Insira o Id do funcionario que vai receber mais bufumfa: ");
		int result = sc.nextInt(); //ID que vai ter seu salario alterado
		//Vai criar uma lista de nameId e vai colocar o result dentro dela
		List<Integer> nameId = id.stream().filter(x-> x.toString().startsWith(String.valueOf(result))).collect(Collectors.toList()); //ID -> Stream, filtra e encontra o result -> transforma em lista denovo 
		//
		if(nameId.contains(result)) { //Se foi encontrado o ID 
			System.out.println("Qual o novo salario?");
			bufumfa = sc.nextDouble();
			indexCerto = id.indexOf(result); //Recebe o index 
			salarioCerto = salary.get(indexCerto); //Recebe o salario correto para ser acrescido
			salary.set(indexCerto, bufumfa + salarioCerto); //Imprime o salario que foi alterado
			System.out.println("Salario atualizado para: R$" + salary.get(indexCerto));
		} else {
			System.out.println("Não existe esse funcionario");
		}
		
		System.out.println("Lista de empregados:");
		
		for(int i = 0; i < id.size(); i++) {
			System.out.println("Id:" + id.get(i) + " Nome: " + name.get(i) + " Salario:" + salary.get(i));
			
		}
		
		sc.close();
	}

}
