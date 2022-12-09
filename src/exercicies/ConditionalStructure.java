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

	}

	public void exercice3() {

	}

	public void exercice4() {

	}

	public void exercice5() {

	}

	public void exercice6() {

	}

	public void exercice7() {

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
