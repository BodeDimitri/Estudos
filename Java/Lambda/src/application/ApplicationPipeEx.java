package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class ApplicationPipeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter full file path:");
		String path = sc.nextLine();
		
		System.out.println("Enter salary: ");
		double avg = sc.nextDouble();
		
		System.out.println("Email of people whose salary is more than" + avg);
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			List<String> salarys = list.stream()
					.filter(p -> p.getSalary() >= avg)
					.map(p -> p.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			double avgsalary = list.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			salarys.forEach(System.out::println);
			System.out.println("Sum of salary of people whose name starts with 'M':" + avgsalary);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		sc.close();
	}

}
