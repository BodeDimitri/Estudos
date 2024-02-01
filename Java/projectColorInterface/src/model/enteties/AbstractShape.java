package model.enteties;

import model.enums.Color;

public abstract class AbstractShape implements Shape { //Por estar implementado de Shape mas ser uma classe abstrata não e necessario cumpirir o contrato, so as subclasses
	
	private Color color;

	public AbstractShape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
