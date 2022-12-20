package statics;

public class MultiplicationStatic {

	public static double converterDollar(double priceDollar, double money) {
		return priceDollar * money;
	}

	public static double formOfBaskara(double a, double b, double c) {
		double delta = (Math.pow(b, 2)) - 4 * a * c;
		return delta;
	}

	public static double positiveValueBaskara(double a, double b, double delta) {
		double positRes = (-b + Math.sqrt(delta)) / (2 * a);
		return positRes;
	}

	public static double negativeValueBaskara(double a, double b, double delta) {
		double positRes = (-b - Math.sqrt(delta)) / (2 * a);
		return positRes;
	}
	
	public static double percentageOfvalue(double percTotal, double value ) {
		return (value * 100) / percTotal;
	}
}
