/**
 * 
 * @author Juan Antonio Marco
 * @version 1.2
 *
 */
public class Rectangulo_JAM extends FiguraGeometrica_JAM {
	private double l1;
	private double l2;
	/**
	 * 
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_JAM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}


	@Override
	/**
	 * Calcula el area del rectangulo
	 * @return area
	 * 
	 */
	public double area() {
		return l1 * l2;
	}
	
	@Override
	/**
	 * Calcula el perimetro del rectangulo
	 * @return perimetro
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
