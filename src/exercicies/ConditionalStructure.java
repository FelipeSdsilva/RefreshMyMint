package exercicies;

import java.util.Scanner;

import views.StringText;

public class ConditionalStructure {

	Scanner in = new Scanner(System.in);
	StringText msg = new StringText();

	public void exercice1() {
		Double av1, av2, sum;

		System.out.print(msg.student[0]);
		av1 = in.nextDouble();
		System.out.print(msg.student[1]);
		av2 = in.nextDouble();

		sum = StaticFixation.sumTwoNumbersDoub(av1, av2);

		String resp = (sum < 60) ? msg.student[3] : "";

		System.out.println(msg.student[2] + sum + "\n" + resp);
	}

	public void exercice2() {

		double a, b, c, delt, x1, x2;

		System.out.print(msg.mensage[9]);
		a = in.nextDouble();
		System.out.print(msg.mensage[10]);
		b = in.nextDouble();
		System.out.print(msg.mensage[11]);
		c = in.nextDouble();

		delt = StaticFixation.formOfBaskara(a, b, c);

		x1 = StaticFixation.positiveValueBaskara(a, b, delt);
		x2 = StaticFixation.negativeValueBaskara(a, b, delt);

		String result = !(x1 != Double.NaN && x2 != Double.NaN) ? msg.mensage[12]
				: msg.xAndY[3] + String.format("%.4f", x1) + "\n" + msg.xAndY[4] + String.format("%.4f", x2);

		System.out.println(result);
	}

	public void exercice3() {

		int a, b, c;

		System.out.print(msg.mensage[13]);
		a = in.nextInt();
		System.out.print(msg.mensage[14]);
		b = in.nextInt();
		System.out.print(msg.mensage[15]);
		c = in.nextInt();
		StaticFixation.smallerBetweeThreeNumbers(a, b, c);
	}

	public void exercice4() {

		int min;

		System.out.print(msg.mensage[16]);
		min = in.nextInt();

		System.out.println(msg.mensage[17] + String.format("%.2f", StaticFixation.valueContOfTellOperator(min)));
	}

	public void exercice5() {

		double money, totalValue, price;
		int qtd;

		System.out.print(msg.product[5]);
		price = in.nextDouble();
		System.out.print(msg.product[6]);
		qtd = in.nextInt();
		System.out.print(msg.product[7]);
		money = in.nextDouble();

		totalValue = StaticFixation.converterDollar(price, (double) qtd);

		StaticFixation.changeVerification(money, totalValue);

	}

	public void exercice6() {
		double avgGlu;
		System.out.print(msg.mensage[18]);
		avgGlu = in.nextDouble();

		StaticFixation.quantityOfGlucose(avgGlu);
	}

	public void exercice7() {
		double a, b, c;

		System.out.println(msg.mensage[19]);
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();

		StaticFixation.biggerDistance(a, b, c);
	}

	public void exercice8() {

	}

	public void exercice9() {

	}

	public void exercice10() {

	}

	public void exercice11() {

	}

	public void exercice12() {

	}

	public void exercice13() {

	}
}
