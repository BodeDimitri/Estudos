package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Teacher;

public class ProgramSet4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Teacher> a = new HashSet<>();

		
		System.out.println("How many students for course A?");
		int AlunosA = sc.nextInt();
		
		for(int i = 0; i < AlunosA; i++) {
			
			int alunoCod = sc.nextInt();
			
			a.add(new Teacher(alunoCod));
		}
		
		System.out.println("How many students for course B?");
		int AlunosB = sc.nextInt();
		
		for(int i = 0; i < AlunosB; i++) {
			
			int alunoCod = sc.nextInt();
			
			a.add(new Teacher(alunoCod));
		}
		
		System.out.println("How many students for course C?");
		int AlunosC = sc.nextInt();
		
		for(int i = 0; i < AlunosC; i++) {
			
			int alunoCod = sc.nextInt();
			
			a.add(new Teacher(alunoCod));
		}
		
		
		System.out.println("Total students: " +  a.size());
		
		sc.close();

	}

}
