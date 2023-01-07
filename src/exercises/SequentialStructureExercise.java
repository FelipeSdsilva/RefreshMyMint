package exercises;

import java.util.Scanner;

import entities.Employee;
import entities.Person;
import entities.Product;
import statics.MultiplicationStatic;
import views.MensagensObjects;
import views.StringText;

public class SequentialStructureExercice {

	Scanner in = new Scanner(System.in);
	StringText msg = new StringText();
	MensagensObjects ms =  new MensagensObjects();


	public void exercice01() {

		double width, lenth, value;

		System.out.print(msg.terrain[0]);
		width = in.nextDouble();
		System.out.print(msg.terrain[1]);
		lenth = in.nextDouble();
		System.out.print(msg.terrain[2]);
		value = in.nextDouble();

		System.out.println(msg.terrain[4] + String.format("%.2f", width * lenth) + "\n" + msg.terrain[3]
				+ String.format("%.2f", (width * lenth) * value));
	}

	public void exercice02() {

		double b, h, p, d;

		System.out.print(msg.rectangle[1]);
		b = in.nextDouble();
		System.out.print(msg.rectangle[2]);
		h = in.nextDouble();
		p = b + h;
		d = Math.pow(b, 2) + Math.pow(h, 2);
		System.out.println(msg.rectangle[3] + String.format("%.4f", b * h) + "\n" + msg.rectangle[4]
				+ String.format("%.4f", p * 2) + "\n" + msg.rectangle[5] + String.format("%.4f", Math.sqrt(d)));
	}

	public void exercice03() {
		
		String name;
		double avarege = 0.0;
		Person[] person = new Person[2];
		int age;
		
		for (int i = 0; i < 2; i++) {

			System.out.print(ms.person[1] + (i + 1) + ms.person[13] + ms.person[8] + "\n" + ms.person[3]);
			name = in.nextLine();

			System.out.print(ms.person[4]);
			age = in.nextInt();
			in.nextLine();

			person[i] = new Person(name, age);
			avarege += (double) person[i].getAge();
		}

		avarege /= 2;

		System.out.println(ms.person[9] + person[0].getName() + ms.person[11] + person[1].getName() + ms.person[10]
				+ String.format("%.1f", avarege) + ms.person[12]);
	}

	public void exercice04() {
		
		int x, y, sum;
		
		System.out.print(msg.xAndY[0]);
		x = in.nextInt();
		System.out.print(msg.xAndY[1]);
		y = in.nextInt();
		sum = x + y;
		System.out.println(msg.xAndY[2] + sum);
	}

	public void exercice05() {

		double money, change;
		Product product = new Product();

		System.out.print(ms.product[5]);
		product.setPrice(in.nextDouble());
		System.out.print(ms.product[6]);
		product.addStock(in.nextInt());
		System.out.print(ms.product[7]);
		money = in.nextDouble();
		change = money - (product.getPrice() * product.getQuantity());
		System.out.println(ms.product[8] + String.format("%.2f", change));
	}

	public void exercice06() {

		double area, value;

		System.out.print(msg.circle[0]);
		value = in.nextDouble();
		area = Math.PI * Math.pow(value, 2);
		System.out.println(msg.rectangle[3] + String.format("%.3f", area));
	}

	public void exercice07() {
		
		Employee emp = new Employee();
		
		System.out.print(ms.person[3]);
		emp.setName(in.nextLine());
		System.out.print(ms.employee[0]);
		emp.setValuePerHour(in.nextDouble());
		System.out.print(ms.employee[1]);
		emp.setHoursJobs(in.nextInt());

		System.out.println(ms.employee[2] + emp.getName() + ms.employee[3]
				+ String.format("%.2f", (emp.getValuePerHour() * emp.getHoursJobs())));
	}

	public void exercice08() {

		int x;
		double value;

		System.out.print(msg.mensage[1]);
		x = in.nextInt();
		System.out.print(msg.mensage[2]);
		value = in.nextDouble();
		System.out.println(msg.mensage[3] + String.format("%.3f", x / value));
	}

	public void exercice09() {

		double a, b, c, tri, trap, sqrt;

		System.out.print(msg.mensage[4]);
		a = in.nextDouble();
		System.out.print(msg.mensage[5]);
		b = in.nextDouble();
		System.out.print(msg.mensage[6]);
		c = in.nextDouble();

		tri = (a * b) / 2;
		trap = (a + b) * c / 2;
		sqrt = a * a;

		System.out.printf(msg.mensage[7], sqrt, tri, trap);
	}

	public void exercice10() {

		int duration, hours, minutes, seconds, rest;

		System.out.print(msg.mensage[8]);
		duration = in.nextInt();

		hours = duration / 3600;
		rest = duration % 3600;

		minutes = rest / 60;
		seconds = rest % 60;

		System.out.println(hours + ":" + minutes + ":" + seconds);

	}

	public void exercice11() {

		StringText msg = new StringText();

		System.out.print(msg.statics[0]);
		double priceDoll = in.nextDouble();
		System.out.print(msg.statics[1]);
		double money = in.nextDouble();

		System.out.println(msg.statics[2] + String.format("%.2f", MultiplicationStatic.converterDollar(priceDoll, money)));

	}
}
