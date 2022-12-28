package entities;

public class Student {

	private String name;
	private String email;
	private double av1;
	private double av2;
	private Double[] avaliantion;

	public Student() {
	}

	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Student(String name, double av1, double av2) {
		this.name = name;
		this.av1 = av1;
		this.av2 = av2;
	}

	public Student(String name, Double[] avaliantion) {
		this.name = name;
		this.avaliantion = avaliantion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAv1() {
		return av1;
	}

	public void setAv1(double av1) {
		this.av1 = av1;
	}

	public double getAv2() {
		return av2;
	}

	public void setAv2(double av2) {
		this.av2 = av2;
	}

	public void setAvaliantion(Double[] avaliantion) {
		this.avaliantion = avaliantion;
	}

	public Double[] getAvaliantion() {
		return avaliantion;
	}

	public void finalNote() {
		Double sum = 0.0;
		for (int i = 0; i < avaliantion.length; i++) {
			sum += avaliantion[i];
		}
		if (sum >= 60.00) {
			System.out.println("Final GRADE = " + String.format("%.2f", sum) + "\nPASS");

		} else {
			System.out.println("Final GRADE = " + String.format("%.2f", sum) + "\nFAILED");
			sum = 60.00 - sum;
			System.out.println("MISSING " + String.format("%.2f", sum) + " POINTS");
		}
	}

	public double finalNoteDivision() {
		Double sum = 0.0;

		sum += av1 + av2;

		return sum / 2;
	}

}
