package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enteties.Departament;
import enteties.HourContract;
import enteties.Worker;
import enteties.enums.WorkerLevel;

public class ProgramWorker {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o nome do departamento: ");
		String departamento = sc.nextLine();
		
		System.out.println("Entre as informações do usuario:");
		
		System.out.println("Nome: ");
		String workerName = sc.nextLine();
		
		System.out.println("Level: ");
		String workerLevel = sc.nextLine(); //Vai ser usado o enum
		
		System.out.println("Salário base: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamento)); //Trabalhador instanciado
		
		System.out.println("Quantos contratos o trabalhador vai ter?");
		int n = sc.nextInt(); //Quantidade de contratos
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Contrato #" + i + "informações:");
			
			System.out.println("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next()); //Sdf formata e o parse recebe o proximo input
			
			System.out.println("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.println("Duração (horas)");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours); // Contrato instanciado
			
			worker.addContract(contract);
		}
		
		System.out.println("");
		System.out.println("Entre o mês e o ano para calcular o ganho: (MM/YYYY)");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); //Integer.parseInt e usado para tornar em int a String
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartament().getName());
		System.out.println("Ganho de " + month + "/" + year + ": " + String.format("%.2f", worker.income(month, year)));
		
		sc.close();
	}

}
