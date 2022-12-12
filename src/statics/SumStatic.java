package statics;

import views.StringText;

public class SumStatic {

	public static int sumBetweeTwoNumbersInteger(int a, int b) {
		return a + b;
	}

	public static double sumTwoNumbersDoub(double a, double b) {
		return a + b;
	}

	public static void initalAndEndHorTheGame(int initH, int endH) {
		StringText msg = new StringText();

		System.out.println(msg.mensage[32] + sumBetweeTwoNumbersInteger((24 - initH), endH) + msg.mensage[33]);
	}

}
