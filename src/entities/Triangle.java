package entities;

public class Triangle {

	private double width;
	private double hight;
	private double base;

	private double area;

	public Triangle() {
	}

	public Triangle(double width, double hight, double base) {
		this.width = width;
		this.hight = hight;
		this.base = base;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double measuresOfTriangle(double a, double b, double c) {
		double p = (a + b + c) / 2;
		double measure = Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
		return area = measure;
	}

	public static void theBiggeArea(Triangle a, Triangle b) {
		if (a.getArea() > b.getArea()) {
			System.out.println("Large area: X " + String.format("%.4f", a.getArea()));
		} else {
			System.out.println("Large area: Y " + String.format("%.4f", b.getArea()));
		}
	}

	@Override
	public String toString() {
		return "Triangle [ area=" + String.format("%.4f", getArea()) + "]";
	}
}
