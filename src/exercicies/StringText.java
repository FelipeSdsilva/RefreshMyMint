package exercicies;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.Product;

public class StringText {

	Product p1 = new Product(5290, "Computer", 2100.0);
	Product p2 = new Product(5598, "Office desk", 650.50);
	Person per = new Person("Maria", 30, 1.70, 'f');
	double measure = 53.234567;

	String mensage = """
			Products;
			%s, which price is $ %.2f
			%s, which price is $ %.2f

			Record: %d years old. code %d and gender: %c

			Measue whit eight decimal places: %.8f
			Rouded (three decimal places): %.3f
			""";

	public void fixedExercicieString() {
		System.out.printf(mensage, p1.getName(), p1.getPrice(), p2.getName(), p2.getPrice(), per.getAge(), p1.getCode(),
				per.getGender(), measure, measure);
		Locale.setDefault(Locale.US);
		System.out.println("US decimal point:" + String.format("%.3f", measure));
	}

	public static void resolvProblemWithOrientationObject() {

		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();

		String msg = """
				Enter the product data:\n
				""";
		String msg2 = """
				Product data: """ + p1.toString() + """
				""";
		String msg3 = """
				Update data: """ + p1.toString() + """
				""";

		
		System.out.print(msg + "Name: ");
		p1.setName(sc.nextLine());
		System.out.print("Price: ");
		p1.setPrice(sc.nextDouble());
		System.out.print("Quantity in stock: ");
		int qtd = sc.nextInt();
		p1.addStock(qtd);
		
		msg2 = """
				Product data: """ + p1.toString() + """
				""";
		System.out.println(msg2);

		System.out.print("Enter the number of product to be added in stock: ");
		qtd = sc.nextInt();
		p1.addStock(qtd);
		msg3 = """
				Update data: """ + p1.toString() + """
				""";

		System.out.println(msg3);

		System.out.print("Enter the number of product to be remove in stock: ");
		qtd = sc.nextInt();
		p1.removeStock(qtd);
		msg3 = """
				Update data: """ + p1.toString() + """
				""";

		System.out.println(msg3);

		sc.close();
	}

}
