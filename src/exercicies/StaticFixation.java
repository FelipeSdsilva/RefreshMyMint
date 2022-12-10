package exercicies;

public class StaticFixation {

	public static double converterDollar(double priceDollar, double money) {
		return priceDollar * money;
	}

	public static double parameterOfRectangle(double base, double higth) {
		return base + higth;
	}

	public static double diameterOfRectangle(double base, double higth) {
		return Math.pow(base, 2) + Math.pow(higth, 2);
	}

	public static int sumInterTwoNumbers(int a, int b) {
		return a + b;
	}

	public static double sumTwoNumbersDoub(double a, double b) {
		return a + b;
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
}
