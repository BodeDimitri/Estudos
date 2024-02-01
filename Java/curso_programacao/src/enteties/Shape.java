package enteties;

import enteties.enums.Color;

public abstract class Shape {
	public Color color;
	
	public Shape() {
		
	}

	public Shape(Color color) {
		super();
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area(); //Por se tratar de um metodo abstrato você obviamente não coloca nada dentro
	
}
