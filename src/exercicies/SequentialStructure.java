package exercicies;

import java.util.Scanner;

import entities.Employee;
import entities.Person;
import entities.Product;
import views.StringText;

public class SequentialStructure {

	Scanner in = new Scanner(System.in);
	StringText msg = new StringText();

	String name;

	int age, x, y, sum, duration, hours, minutes, seconds, rest;

	double area, width, lenth, value, a, c, b, h, p, d, avarege = 0.0, change, money, tri, trap, sqrt;

	Person[] person = new Person[2];
	Product product = new Product();
	Employee emp = new Employee();

	public void exercice1() {
		System.out.print(msg.terrain[0]);
		width = in.nextDouble();
		System.out.print(msg.terrain[1]);
		lenth = in.nextDouble();
		System.out.print(msg.terrain[2]);
		value = in.nextDouble();

		System.out.println(msg.terrain[4] + String.format("%.2f", width * lenth) + "\n" + msg.terrain[3]
				+ String.format("%.2f", (width * lenth) * value));
	}

	public void exercice2() {
		System.out.print(msg.rectangle[1]);
		b = in.nextDouble();
		System.out.print(msg.rectangle[2]);
		h = in.nextDouble();
		p = b + h;
		d = Math.pow(b, 2) + Math.pow(h, 2);
		System.out.println(msg.rectangle[3] + String.format("%.4f", b * h) + "\n" + msg.rectangle[4]
				+ String.format("%.4f", p * 2) + "\n" + msg.rectangle[5] + String.format("%.4f", Math.sqrt(d)));
	}

	public void exercice3() {
		for (int i = 0; i < 2; i++) {

			System.out.print(msg.person[1] + (i + 1) + msg.person[13] + msg.person[8] + "\n" + msg.person[3]);
			name = in.nextLine();

			System.out.print(msg.person[4]);
			age = in.nextInt();
			in.nextLine();

			person[i] = new Person(name, age);
			avarege += (double) person[i].getAge();
		}

		avarege /= 2;

		System.out.println(msg.person[9] + person[0].getName() + msg.person[11] + person[1].getName() + msg.person[10]
				+ String.format("%.1f", avarege) + msg.person[12]);
	}

	public void exercice4() {
		System.out.print(msg.xAndY[0]);
		x = in.nextInt();
		System.out.print(msg.xAndY[1]);
		y = in.nextInt();
		sum = x + y;
		System.out.println(msg.xAndY[2] + sum);
	}

	public void exercice5() {
		System.out.print(msg.product[5]);
		product.setPrice(in.nextDouble());
		System.out.print(msg.product[6]);
		product.addStock(in.nextInt());
		System.out.print(msg.product[7]);
		money = in.nextDouble();
		change = money - (product.getPrice() * product.getQuantity());
		System.out.println(msg.product[8] + String.format("%.2f", change));
	}

	public void exercice6() {
		System.out.print(msg.circle[0]);
		value = in.nextDouble();
		area = Math.PI * Math.pow(value, 2);
		System.out.println(msg.rectangle[3] + String.format("%.3f", area));
	}

	public void exercice7() {
		System.out.print(msg.person[3]);
		emp.setName(in.nextLine());
		System.out.print(msg.employee[0]);
		emp.setValuePerHour(in.nextDouble());
		System.out.print(msg.employee[1]);
		emp.setHoursJobs(in.nextInt());

		System.out.println(msg.employee[2] + emp.getName() + msg.employee[3]
				+ String.format("%.2f", (emp.getValuePerHour() * emp.getHoursJobs())));
	}

	public void exercice8() {
		System.out.print(msg.mensage[1]);
		x = in.nextInt();
		System.out.print(msg.mensage[2]);
		value = in.nextDouble();
		System.out.println(msg.mensage[3] + String.format("%.3f", x / value));
	}

	public void exercice9() {
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
		System.out.print(msg.mensage[8]);
		duration = in.nextInt();

		hours = duration / 3600;
		rest = duration % 3600;

		minutes = rest / 60;
		seconds = rest % 60;

		System.out.println(hours + ":" + minutes + ":" + seconds);

	}
}
