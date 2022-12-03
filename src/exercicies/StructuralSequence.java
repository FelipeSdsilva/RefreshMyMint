package exercicies;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class StructuralSequence {

	Scanner in = new Scanner(System.in);

	public void terrainArea() {

		/*
		 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do
		 * terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor
		 * da Ã¡rea do terreno, bem como o valor do preÃ§o do terreno, ambos com duas
		 * casas decimais, conforme exemplo.
		 */

		Locale.setDefault(Locale.US);

		System.out.print("Write the width of terrain: ");
		double width = in.nextDouble();
		System.out.print("Write the length of terrain: ");
		double lenth = in.nextDouble();
		System.out.print("Write  the value for m²: ");
		double value = in.nextDouble();

		System.out.println("Area of terrain = " + String.format("%.2f", width * lenth));
		System.out.println("The price of terrain = " + String.format("%.2f", (width * lenth) * value));

	}

	public void rectangleMeasure() {

		/*
		 * Fazer um programa para ler as medidas da base e altura de um retÃ¢ngulo. Em
		 * seguida, mostrar o valor da Ã¡rea, perÃ­metro e diagonal deste retÃ¢ngulo, com
		 * quatro casas decimais, conforme exemplos.
		 */

		Locale.setDefault(Locale.US);

		System.out.print("Base of recrangle: ");
		double b = in.nextDouble();
		System.out.print("Height of rectangle: ");
		double h = in.nextDouble();
		System.out.println("Area = " + String.format("%.4f", b * h));
		double p = b + h;
		System.out.println("Perimeter = " + String.format("%.4f", p * 2));
		double d = Math.pow(b, 2) + Math.pow(h, 2);
		System.out.println("Diagonal = " + String.format("%.4f", Math.sqrt(d)));
	}

	public void avarageAge() {

		Locale.setDefault(Locale.US);
		/*
		 * Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar
		 * uma mensagem com os nomes e a idade mÃ©dia entre essas pessoas, com uma casa
		 * decimal, conforme exemplo.
		 */

		String name;
		int age;
		double avarege = 0.0;
		Person[] p = new Person[2];

		for (int i = 0; i < 2; i++) {

			System.out.println("Date of " + i + 1 + "Person: ");
			System.out.print("Name: ");
			name = in.nextLine();

			System.out.print("Age: ");
			age = in.nextInt();
			in.nextLine();

			p[i] = new Person(name, age);

			avarege += (double) p[i].getAge();

		}

		avarege /= 2;

		System.out.println("A age avarege " + p[0].getName() + " and " + p[1].getName() + " is the "
				+ String.format("%.1f", avarege) + " years old");
	}

	public void sumBetweenTwoNumbers() {

		/*
		 * Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na
		 * tela o valor da soma destes nÃºmeros.
		 */

		int x, y, sum;

		System.out.print("Write a value of x: ");
		x = in.nextInt();
		System.out.print("Write a value of y: ");
		y = in.nextInt();
		sum = x + y;
		System.out.println("Sum = " + sum);
	}

	public void getChange() {

		Locale.setDefault(Locale.US);
		/*
		 * Fazer um programa para calcular o troco no processo de pagamento de um
		 * produto de uma mercearia. O programa deve ler o preÃ§o unitÃ¡rio do produto, a
		 * quantidade de unidades compradas deste produto, e o valor em dinheiro dado
		 * pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
		 * mostrar o valor do troco a ser devolvido ao cliente.
		 */

		double price, change, money;
		int qtd;

		System.out.print("Enter with unit price of product: ");
		price = in.nextDouble();
		System.out.print("Enter the quantity purchased: ");
		qtd = in.nextInt();
		System.out.print("Money received: ");
		money = in.nextDouble();
		change = money - (price * qtd);
		System.out.println("Change: " + String.format("%.2f", change));

	}

	public void circleRadius() {

		Locale.setDefault(Locale.US);
		/*
		 * Fazer um programa para ler o valor "r" do raio de um cÃ­rculo, e depois
		 * mostrar o valor da Ã¡rea do cÃ­rculo com trÃªs casas decimais. A fÃ³rmula da Ã¡rea
		 * do cÃ­rculo Ã© a seguinte: ð�‘Žð�‘Ÿð�‘’ð�‘Ž = ð�œ‹. ð�‘Ÿ à¬¶ . VocÃª pode usar o valor de ð�œ‹
		 * fornecido pela biblioteca da sua linguagem de programaÃ§Ã£o, ou entÃ£o, se
		 * preferir, use diretamente o valor 3.14159.
		 */

		System.out.print("Enter the value circle radius: ");
		double circleRadius = in.nextDouble();
		double area = Math.PI * Math.pow(circleRadius, 2);
		System.out.println("AREA = " + String.format("%.3f", area));

	}

	public void payment() {

		/*
		 * Fazer um programa para ler o nome de um(a) funcionÃ¡rio(a), o valor que ele(a)
		 * recebe por hora, e a quantidade de horas trabalhadas por ele(a). Ao final,
		 * mostrar o valor do pagamento do funcionÃ¡rio com uma mensagem explicativa,
		 * conforme exemplo.
		 */

		String name;
		double valuePerHour, hoursJobs;

		System.out.print("Name: ");
		name = in.nextLine();
		System.out.print("Value per hours: ");
		valuePerHour = in.nextDouble();
		System.out.print("Working hours: ");
		hoursJobs = in.nextDouble();

		System.out.println("The payment for " + name + "is " + String.format("%.2f", (valuePerHour * hoursJobs)));

	}

	public void consumption() {

		Locale.setDefault(Locale.US);
		/*
		 * Fazer um programa para ler a distÃ¢ncia total (em km) percorrida por um carro,
		 * bem como o total de combustÃ­vel gasto por este carro ao percorrer tal
		 * distÃ¢ncia. Seu programa deve mostrar o consumo mÃ©dio do carro, com trÃªs casas
		 * decimais.
		 */

		int km;
		double fuel;

		System.out.print("Enter the distance travelled(Km): ");
		km = in.nextInt();
		System.out.print("Fuel spent: ");
		fuel = in.nextDouble();
		System.out.println("Average consumption: " + String.format("%.3f", km / fuel));
	}

	public void measures() {

		Locale.setDefault(Locale.US);
		/*
		 * Fazer um programa para ler trÃªs medidas A, B e C. Em seguida, calcular e
		 * mostrar (imprimir os dados com quatro casas decimais): a) a Ã¡rea do quadrado
		 * que tem lado A b) a Ã¡rea do triÃ¢ngulo retÃ¢ngulo que base A e altura B c) a
		 * Ã¡rea do trapÃ©zio que tem bases A e B, e altura C
		 */
		double a, b, c;
		double tri, trap, sqrt;

		System.out.print("Enter the measure A: ");
		a = in.nextDouble();
		System.out.print("Enter the measure B: ");
		b = in.nextDouble();
		System.out.print("Enter the measure C: ");
		c = in.nextDouble();

		tri = (a * b) / 2;
		trap = (a + b) * c / 2;
		sqrt = a * a;

		System.out.printf("\nQUADRADO: %.4f" + "\nTRIANGULO: %.4f" + "\nTRAPEZIO: %.4f", sqrt, tri, trap);

	}

	public void duration() {

		Locale.setDefault(Locale.US);
		/*
		 * Fazer um programa para ler uma duraÃ§Ã£o de tempo em segundos, daÃ­ imprimir na
		 * tela esta duraÃ§Ã£o no formato horas:minutos:segundos.
		 */

		int duration, hours, minutes, seconds, rest;

		System.out.print("Write duration in seconds: ");
		duration = in.nextInt();

		hours = duration / 3600;
		rest = duration % 3600;

		minutes = rest / 60;
		seconds = rest % 60;

		System.out.println(hours + ":" + minutes + ":" + seconds);

	}
}
