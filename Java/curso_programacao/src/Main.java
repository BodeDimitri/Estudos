import java.util.Locale; //Usado para mudar formatação dependendo do pais que foi selecionado
import java.util.Scanner; //Usado para input

public class Main {

	public static void main(String[] args) {
		System.out.println("Sem quebra de linha"); 
		System.out.print("Quebra de linha"); //E o print do java
		
		double x = 2.36789;
		
		System.out.printf("%.2f", x); //Usado para formatar a variavel, o número apos o ponto indica quantos números vão aparecer apos o mesmo
		Locale.setDefault(Locale.US); //Mudar o padrão para Americano, trocando o "." por uma ","
		System.out.printf("Resultado = %.2f metros%n", x); //Formatação para um texto, o % e onde vai ficar a variavel que foi especificada depois da virgula
		
		String sonia = "Sonia";
		int idadeSonia = 22;
		double rendaSonia = 4000.000;
		
		System.out.printf("Nome: %s, Idade: %d, Renda: %.3f%n", sonia, idadeSonia, rendaSonia);//%s = Texto, %d = Double, %f = Ponto Flutuante
		// ----------------------------------------------------------------------------------------------------------------------------------------------------
		//Casting
		double resultado;
		
		int a = 5;
		int b = 2;
		
		resultado = (double) a/b; //Por resultado ser uma variavel double e o resultado dessa divisão de dois inteiros for um número flutuante e necessario fazer o casting com o double
		
		System.out.println(resultado);
		
		double a1;
		int b1;
		
		a1 = 5.0;
		b1 = (int) a1; //Aqui o casting tambem e usado para não perder nenhum valor na troca para int
		
		System.out.println(b1);
		// ----------------------------------------------------------------------------------------------------------------------------------------------------
		//Input
		
		Scanner sc = new Scanner(System.in); //Objeto Scanner, não se esqueça de fechar ele com sc.close()
		String xstring;
		xstring = sc.next(); //.next() define que a proxima coisa a ser digitada vai ser capturada e salva nessa variavel //Existe tambem o nextLine() que avança para a proxima linha
		
		System.out.println(xstring); 
		
		int xint;
		xint = sc.nextInt(); //Para aceitar um valor que se trata de um número inteiro e necessario usar nextInt
		
		System.out.println(xint);
		
		double xdouble;
		xdouble = sc.nextDouble(); //Bom deu para entender o esquema ne?, essa e para double
		
		System.out.println(xdouble);
		
		char xchar;
		xchar = sc.next().charAt(0); //Capta uma String mas pega o caracter que estiver na posição zero(o primeiro no caso)
		
		System.out.println(xchar);
		
		sc.close(); // Encerra esse input
		
		// ----------------------------------------------------------------------------------------------------------------------------------------------------
		//Mat
		
		double xpow;
		xpow = Math.pow(1,2); //Resultado de 1 elevado a 2
		
		double xsqrt;
		xsqrt = Math.sqrt(4); //Recebe a raizquadrada de 4
		
		int xabs;
		xabs = Math.abs(5); //Recebe o valor absoluto de 5
		
		System.out.printf("Elevação = %.1f Raiz quadrada = %.1f Absoluto = %d", xpow, xsqrt, xabs);
		
		//Para usar BreakPoint aperta CTRL+SHIFT+B e depois usa debug pois da muitas informações importantes, depois so usar F6 para continuar o programa
		//CTRL + F2 força o encerramento do Debug
	}

}
