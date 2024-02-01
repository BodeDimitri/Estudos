package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramGenerics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>(); //Integer e um Object, mas a lista de Integer não e uma lista de object
		@SuppressWarnings("unused")
		List<?> myObjs2 = new ArrayList<Object>();// <?> subtipo de qualquer tipo de lista
		
		myObjs2 = myNumbers;
	}

}
