package util;

import java.util.function.Function;

import entities.Product3;

public class UperCaseFunction implements Function<Product3, String > {//Function recebe dois parametros

	@Override
	public String apply(Product3 p) {
		return p.getProduct().toUpperCase();
	} 

}
