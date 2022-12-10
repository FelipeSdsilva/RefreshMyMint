package exercicies;

public class StaticFixation {

	public static double converterDollar(double priceDollar, double money) {
		return priceDollar * money;
	}

	public static double diameterOfRectangle(double base, double higth) {
		return Math.pow(base, 2) + Math.pow(higth, 2);
	}

	public static int sumBetweeTwoNumbersInteger(int a, int b) {
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

	public static void smallerBetweeThreeNumbers(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println("smaller number: " + a);
		} else if (b < c && b < a) {
			System.out.println("smaller number: " + b);
		} else {
			System.out.println("smaller number: " + c);
		}
	}

	public static void biggerDistance(double a, double b, double c) {
		if (a > b && a > c) {
			System.out.println(String.format("Bigger Distance = %.2f", a) + a);
		} else if (b > c) {
			System.out.println(String.format("Bigger Distance = %.2f", b));
		} else {
			System.out.println(String.format("Bigger Distance = %.2f", c));
		}
	}

	public static double valueContOfTellOperator(int min) {
		double value = 50.00;
		if (min <= 100) {
			return value;
		}
		return value += (min - 100) * 2.00;
	}

	public static void changeVerification(double money, double totalValue) {
		if (money > totalValue) {
			System.out.println(String.format("Change: %.2f", money - totalValue));
		} else {
			System.out.println(String.format("Cash insufficient. FOUL %.2f REALS", totalValue - money));
		}
	}

	public static void quantityOfGlucose(double avgGlu) {
		if (avgGlu <= 100.0) {
			System.out.println("Classification: Normal");
		} else if (avgGlu > 100.00 && avgGlu <= 140.0) {
			System.out.println("Classification: Higth");
		} else if (avgGlu > 140.0) {
			System.out.println("Classification: Diabetes");
		}
	}

}
