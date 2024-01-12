
public class MetString {
	public static void main(String[] args) {
		
		String original = "Formatar case e trim";
		
		String lowOri = original.toLowerCase(); //Que nem em outras linguagens e para deixar tudo no mínusculo, nada de novo
		System.out.println(lowOri);
		
		String upOri = original.toUpperCase(); 
		System.out.println(upOri);
		
		String trimOri = original.trim(); //Exclui os espaços
		System.out.println(trimOri);
		
		String subOri = original.substring(9,13); //Recorta a string, primeiro parametro e o Index e o ultimo ate onde vai ser cortado
		System.out.println(subOri);
		
		String repOri = original.replace("F", "X"); //Troca o primeiro caracter pelo segundo parametro, tambem funciona com mais caracteres
		System.out.println(repOri);
		
		int indexOri = original.indexOf("F"); //Retorna um número com o Index, tambem tem o LastIndexOf, que retorna o ultimo caracter mas começa pelo final da lista
		System.out.println(indexOri);
		
		String[] splitOri = original.split(" "); //Separa as palavras por um separador que e usado como parametro e depois e so acessar o que foi cortado pelo nome da variavel seguido de um [] com o numero em questão
		System.out.println(splitOri[0]);
	}
}
