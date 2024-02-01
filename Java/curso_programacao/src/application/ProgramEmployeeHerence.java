package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enteties.EmployeeHerence;
import enteties.OutsourcedEmployee;

public class ProgramEmployeeHerence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeHerence> list = new ArrayList<>();
		
		System.out.println("Insira a quantidade de funcionarios");
		int nFuncionarios = sc.nextInt();
		
		for (int i = 0; i<= nFuncionarios; i++) {
			System.out.println("Funcionario #" + i + ": ");
			System.out.println("Tercerizado? (S/N)");
			char ch = sc.next().charAt(0);
			
			System.out.println("Nome: ");
			String name = sc.nextLine();
			
			System.out.println("Horas:  ");
			int hours = sc.nextInt();
			
			System.out.println("Valor por hora: ");
			double valuePerHour = sc.nextInt();
			
			if(ch == 'S') {
				System.out.println("Valor adicional: ");
				double additionalCharge = sc.nextDouble();
				EmployeeHerence emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge); 
				list.add(emp);
			} else {
				EmployeeHerence emp = new EmployeeHerence(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		
		System.out.println("Pagamentos: ");
		for(EmployeeHerence c : list) {
			System.out.println(c.getName() + " - $" + String.format("%.2f" ,c.payment()));
		}
		
		sc.close();
		
	}

}
