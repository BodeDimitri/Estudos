package enteties;

public class triangle {
		
	public double a;
	public double b;
	public double c;
	
	public double areaCalc() { //Nesse caso não e necessario colocar as variaveis como parametro, tudo que era necessario para calcular ja esta na classe
		double p = (a + b + c) / 2.0; //Formula matemática
		return Math.sqrt(p * (p-a) * (p-a) * (p-c));
	}

}
