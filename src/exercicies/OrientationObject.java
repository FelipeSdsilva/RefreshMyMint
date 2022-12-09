package exercicies;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.Employee;
import entities.Person;
import entities.Product;
import entities.Rectangle;
import entities.Student;
import views.StringText;

public class OrientationObject {

	Scanner sc = new Scanner(System.in);

	StringText msg = new StringText();

	public void fixedExercicieString() {

		Product p1 = new Product(5290, "Computer", 2100.0);
		Product p2 = new Product(5598, "Office desk", 650.50);
		Person per = new Person("Maria", 30, 1.70, 'f');

		double measure = 53.234567;
		System.out.printf(msg.mensage[0], p1.getName(), p1.getPrice(), p2.getName(), p2.getPrice(), per.getAge(),
				p1.getCode(), per.getGender(), measure, measure);
		Locale.setDefault(Locale.US);
		System.out.println("US decimal point:" + String.format("%.3f", measure));
	}

	public void resolvProblemWithOrientationObject() {

		Product p1 = new Product();

		System.out.print(msg.product[0] + "Name: ");
		p1.setName(sc.nextLine());
		System.out.print("Price: ");
		p1.setPrice(sc.nextDouble());
		System.out.print("Quantity in stock: ");
		int qtd = sc.nextInt();
		p1.addStock(qtd);

		System.out.println(msg.product[1] + p1);

		System.out.print(msg.product[3]);
		qtd = sc.nextInt();
		p1.addStock(qtd);

		System.out.println(msg.product[2] + p1);

		System.out.print(msg.product[4]);
		qtd = sc.nextInt();
		p1.removeStock(qtd);

		System.out.println(msg.product[2] + p1);

		sc.close();
	}

	public void rectangleExercicie() {
		Rectangle rec = new Rectangle();

		System.out.print(msg.rectangle);
		rec.setHeight(sc.nextDouble());
		rec.setWidth(sc.nextDouble());

		System.out.println(rec);
	}

	public void employeeExercicie() {

		Employee emp = new Employee();
		System.out.print("Name: ");
		emp.setName(sc.nextLine());
		System.out.print("Gross salary: ");
		emp.setSalary(sc.nextDouble());
		System.out.print("Tax: ");
		emp.setTax(sc.nextDouble());

		System.out.println(emp);

		System.out.print(msg.employee[4]);
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);

		System.out.println(emp);

	}

	public void estudentExercicie() {
		Student std = new Student();

		std.setName(sc.nextLine());

		Double[] aval = new Double[3];
		for (int i = 0; i < aval.length; i++) {
			aval[i] = sc.nextDouble();
		}

		std.setAvaliantion(aval);

		std.finalNote();
	}

	public void accountExercicie() {
		Account acc = new Account();
		char confDeposit;
		double value;

		System.out.print(msg.account[0]);
		acc.setNumberAcc(sc.nextInt());
		sc.nextLine();

		System.out.print(msg.account[1]);
		acc.setNameHolder(sc.nextLine());

		System.out.print(msg.account[2]);
		confDeposit = sc.next().charAt(0);

		if (confDeposit == 'Y' || confDeposit == 'y') {
			System.out.print(msg.account[3]);
			value = sc.nextDouble();
			acc.deposit(value);
		}

		System.out.println(msg.account[4] + "\n" + acc + "\n");

		System.out.print(msg.account[5]);
		value = sc.nextDouble();
		acc.deposit(value);

		System.out.println(msg.account[6] + "\n" + acc + "\n");

		System.out.print(msg.account[7]);
		value = sc.nextDouble();
		acc.withdraw(value);

		System.out.println(msg.account[6] + "\n" + acc);
	}

}