package ejerc005;

import java.awt.Color;

public class Figuras {
	protected int posX;
	protected int posY;
	protected Color color;
//	protected String color;
	
	public Figuras(int posX, int posY, Color color) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Figuras [posX=" + posX + ", posY=" + posY + ", color=" + color + "]";
	}
}
