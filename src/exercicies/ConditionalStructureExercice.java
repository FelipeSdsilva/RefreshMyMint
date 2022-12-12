package exercicies;

import java.util.Scanner;

import statics.ConditionalStatic;
import statics.MultiplecationStatic;
import statics.SumStatic;
import views.StringText;

public class ConditionalStructureExercice {

	Scanner in = new Scanner(System.in);
	StringText msg = new StringText();

	public void exercice01() {
		Double av1, av2, sum;

		System.out.print(msg.student[0]);
		av1 = in.nextDouble();
		System.out.print(msg.student[1]);
		av2 = in.nextDouble();

		sum = SumStatic.sumTwoNumbersDoub(av1, av2);

		String resp = (sum < 60) ? msg.student[3] : "";

		System.out.println(msg.student[2] + sum + "\n" + resp);
	}

	public void exercice02() {

		double a, b, c, delt, x1, x2;

		System.out.print(msg.mensage[9]);
		a = in.nextDouble();
		System.out.print(msg.mensage[10]);
		b = in.nextDouble();
		System.out.print(msg.mensage[11]);
		c = in.nextDouble();

		delt = MultiplecationStatic.formOfBaskara(a, b, c);

		x1 = MultiplecationStatic.positiveValueBaskara(a, b, delt);
		x2 = MultiplecationStatic.negativeValueBaskara(a, b, delt);

		String result = !(x1 != Double.NaN && x2 != Double.NaN) ? msg.mensage[12]
				: msg.xAndY[3] + String.format("%.4f", x1) + "\n" + msg.xAndY[4] + String.format("%.4f", x2);

		System.out.println(result);
	}

	public void exercice03() {

		int a, b, c;

		System.out.print(msg.mensage[13]);
		a = in.nextInt();
		System.out.print(msg.mensage[14]);
		b = in.nextInt();
		System.out.print(msg.mensage[15]);
		c = in.nextInt();
		ConditionalStatic.smallerBetweeThreeNumbers(a, b, c);
	}

	public void exercice04() {

		int min;

		System.out.print(msg.mensage[16]);
		min = in.nextInt();

		System.out.println(msg.mensage[17] + String.format("%.2f", ConditionalStatic.valueContOfTellOperator(min)));
	}

	public void exercice05() {

		double money, totalValue, price;
		int qtd;

		System.out.print(msg.product[5]);
		price = in.nextDouble();
		
		System.out.print(msg.product[6]);
		qtd = in.nextInt();
		
		System.out.print(msg.product[7]);
		money = in.nextDouble();

		totalValue = MultiplecationStatic.converterDollar(price, (double) qtd);

		ConditionalStatic.changeVerification(money, totalValue);
	}

	public void exercice06() {
		double avgGlu;
		System.out.print(msg.mensage[18]);
		avgGlu = in.nextDouble();

		ConditionalStatic.quantityOfGlucose(avgGlu);
	}

	public void exercice07() {
		double a, b, c;

		System.out.println(msg.mensage[19]);
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();

		ConditionalStatic.biggerDistance(a, b, c);
	}

	public void exercice08() {

		char scale;
		double temp;

		System.out.print(msg.mensage[28]);
		scale = in.next().charAt(0);

		String result = (scale == 'C') ? msg.mensage[26] : msg.mensage[27];

		System.out.print(result);
		temp = in.nextDouble();

		String result1 = (scale == 'C') ? msg.mensage[25] : msg.mensage[29];

		System.out.println(
				result1 + String.format("%.2f", ConditionalStatic.convertTemperatureCelciusAndFahrenheit(scale, temp)));
	}

	public void exercice09() {

		int codProd, qtd;

		System.out.print(msg.product[10]);
		codProd = in.nextInt();
		System.out.print(msg.product[6]);
		qtd = in.nextInt();

		System.out.print(msg.product[9]);
		ConditionalStatic.totalOrderPriceSnackBar(codProd, qtd);
	}

	public void exercice10() {

		int a, b;
		
		System.out.println(msg.mensage[31]);
		a = in.nextInt();
		b = in.nextInt();

		ConditionalStatic.areMultiples(a, b);
	}

	public void exercice11() {

		double salary;

		System.out.print(msg.employee[8]);
		salary = in.nextDouble();

		ConditionalStatic.increasySalary(salary);
	}

	public void exercice12() {

		int initH, endH;

		System.out.print(msg.mensage[34]);
		initH = in.nextInt();

		System.out.print(msg.mensage[35]);
		endH = in.nextInt();

		SumStatic.initalAndEndHorTheGame(initH, endH);
	}

	public void exercice13() {

		int x, y;
		
		System.out.print(msg.xAndY[0]);
		x = in.nextInt();
		
		System.out.print(msg.xAndY[1]);
		y = in.nextInt();
		
		
	}
}
