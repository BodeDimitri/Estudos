package application;

public class ProgramBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Boxing
		int x =20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		// Unboxing
		int y = (int) obj; //Fazendo o casting para converter
		
		System.out.println(y);
		
		//Wrapper class // Wrapper class podem ter valores nulos e usam dos recursos de OO
		
		int z = 9;
		
		Integer obg = z; // Wrapper class de int, não e preciso fazer o casting
		
		int zy = obg;
		
		System.out.println(zy);
	}

}
