package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enteties.PessoaFisica;
import enteties.PessoaJuridica;

public class ProgramPfPj {
 //Diego, depois refatora esse código e cria uma classe abstrata para PF e PJ, vai ser mais facil usar uma classe generica no list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		List<PessoaFisica> listpf = new ArrayList<>();
		List<PessoaJuridica> listpj = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Entre o número de pagadores: ");
		int n = sc.nextInt();
		
		for(int i = 1; n >= i; i++) {
			System.out.println("Pagador #" + i);
			
			System.out.println("F ou J?");
			char pforpj = sc.next().charAt(0);
			
			if(pforpj == 'F') {
				System.out.println("Nome: ");
				String nome = sc.next();
				
				System.out.println("Renda anual: ");
				Double rendaAnual = sc.nextDouble();
				
				System.out.println("Gastos com saude: ");
				Double gastosSaude = sc.nextDouble();
				
				PessoaFisica PF = new PessoaFisica(nome, rendaAnual, gastosSaude);
				PF.checarGastosPF();
				listpf.add(PF);
			}
			if(pforpj == 'J') {
				System.out.println("Nome: ");
				String nome = sc.next();
				
				System.out.println("Renda anual: ");
				Double rendaAnual = sc.nextDouble();
				
				System.out.println("Quantidade de funcionarios: ");
				Integer numeroDFuncionarios = sc.nextInt();
				
				PessoaJuridica PJ = new PessoaJuridica(nome, rendaAnual, numeroDFuncionarios);
				PJ.checarGastosPJ();
				listpj.add(PJ);
			}
		}
		System.out.println("Taxas pagas: ");
		Double totalTaxas = 0.0;
		for(PessoaFisica pf : listpf) {
			System.out.println(pf.getNome() + " $ " + pf.getRendaAnual());
			totalTaxas += pf.getRendaAnual();
		}
		for(PessoaJuridica pj : listpj) {
			System.out.println(pj.getNome() + " $ " + pj.getRendaAnual());
			totalTaxas += pj.getRendaAnual();
		}
		
		System.out.println("");
		System.out.println("Total de taxas: $" + totalTaxas);
		
		sc.close();
	}

}
