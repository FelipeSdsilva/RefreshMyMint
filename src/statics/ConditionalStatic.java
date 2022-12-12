package statics;

import views.StringText;

public class ConditionalStatic {

	public static void areMultiples(int a, int b) {

		if (a % b == 0) {
			System.out.println("Are multiples ");
		} else {
			System.out.println("Not are multiples ");
		}
	}

	public static void biggerDistance(double a, double b, double c) {

		StringText msg = new StringText();

		if (a > b && a > c) {
			System.out.println(String.format(msg.mensage[21], a));
		} else if (b > c) {
			System.out.println(String.format(msg.mensage[21], b));
		} else {
			System.out.println(String.format(msg.mensage[21], c));
		}
	}

	public static void changeVerification(double money, double totalValue) {

		if (money > totalValue) {
			System.out.println(String.format("Change: %.2f", money - totalValue));
		} else {
			System.out.println(String.format("Cash insufficient. FOUL %.2f REALS", totalValue - money));
		}
	}

	public static double convertTemperatureCelciusAndFahrenheit(char escFahOrCel, double temp) {

		if (escFahOrCel == 'C' || escFahOrCel == ' ') {
			return temp = (temp * 9 / 5) + 32;
		} else if (escFahOrCel == 'F') {
			return temp = (temp - 32) * 5 / 9;
		}
		return Double.NaN;
	}

	public static void increasySalary(double salary) {

		StringText msg = new StringText();
		double newSalary;

		if (salary <= 1000.00) {

			newSalary = salary * 1.20;

			System.out.println(msg.employee[5] + String.format("%.2f", newSalary) + "\n" + msg.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + msg.employee[7] + "20%");
		} else if (salary > 1000.00 && salary <= 3000.00) {

			newSalary = salary * 1.15;

			System.out.println(msg.employee[5] + String.format("%.2f", newSalary) + "\n" + msg.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + msg.employee[7] + "15%");
		} else if (salary > 3000.00 && salary <= 8000.00) {

			newSalary = salary * 1.10;

			System.out.println(msg.employee[5] + String.format("%.2f", newSalary) + "\n" + msg.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + msg.employee[7] + "10%");

		} else {

			newSalary = salary * 1.05;

			System.out.println(msg.employee[5] + String.format("%.2f", newSalary) + "\n" + msg.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + msg.employee[7] + "5%");

		}
	}

	public static void planCartesian(double x, double y) {
		
		if (x >= 1 && y >= 1) {
			System.out.println("Q1");
		} else if (x <= -1 && y >= 1) {
			System.out.println("Q2");
		} else if (x <= -1 && y <= -1) {
			System.out.println("Q3");
		} else if (x >= 1 && y <= -1) {
			System.out.println("Q4");
		} else if (x == 0 && y == 0) {
			System.out.println("Origin");
		} else if (y == 0 && x >= 1) {
			System.out.println("Axle X");
		}else {
			System.out.println("Axle y");
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

	public static void smallerBetweeThreeNumbers(int a, int b, int c) {

		StringText msg = new StringText();

		if (a < b && a < c) {
			System.out.println(msg.mensage[20] + a);
		} else if (b < c && b < a) {
			System.out.println(msg.mensage[20] + b);
		} else {
			System.out.println(msg.mensage[20] + c);
		}
	}

	public static void totalOrderPriceSnackBar(int codProd, int qtd) {

		if (codProd == 1) {
			System.out.printf("%.2f%n", 5.00 * qtd);
		} else if (codProd == 2) {
			System.out.printf("%.2f%n", 3.50 * qtd);
		} else if (codProd == 3) {
			System.out.printf("%.2f%n", 4.80 * qtd);
		} else if (codProd == 4) {
			System.out.printf("%.2f%n", 8.90 * qtd);
		} else {
			System.out.printf("%.2f%n", 7.32 * qtd);
		}
	}

	public static double valueContOfTellOperator(int min) {

		double value = 50.00;

		if (min <= 100) {
			return value;
		}
		return value += (min - 100) * 2.00;
	}

}
