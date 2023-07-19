package ejerc005;

public class Lienzo {
	
	private final int posicionX;
	private final int posicionY;
	
	public Lienzo() {
		super();
		this.posicionX = 1000000;
		this.posicionY = 1000000;
	}

	@Override
	public String toString() {
		return "Lienzo [posicionX=" + posicionX + ", posicionY=" + posicionY + "]";
	}
	
}
