package util;

import java.util.function.Consumer;

import entities.Product2;

public class PriceUpdateConsumer implements Consumer<Product2> {

	@Override
	public void accept(Product2 p) {
		p.setPrice(p.getPrice() * 1.1);
		
	}

}
