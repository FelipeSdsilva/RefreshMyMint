package entities;

public class Student {
	
	private String name;
	private Double[] avaliantion = new Double[2];
	
	public Student() {
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

	public void setAvaliantion(Double[] avaliantion) {
		this.avaliantion = avaliantion;
	}

	public Double[] getAvaliantion() {
		return avaliantion;
	}
	
	public void finalNote() {
		Double sum = 0.0;
		for(int i = 0; i < avaliantion.length ; i++) {
			sum += avaliantion[i];
		}
		if(sum >= 60.00) {
			System.out.println("Final GRADE = " + String.format("%.2f", sum)+"\nPASS");
			
		}else {
			System.out.println("Final GRADE = " + String.format("%.2f", sum)+"\nFAILED");
			sum = 60.00 - sum;
			System.out.println("MISSING "+String.format("%.2f", sum)+" POINTS");
		}
	}
	
	public double finalNoteDivision() {
		Double sum = 0.0;
		for(int i = 0; i < avaliantion.length ; i++) {
			sum += avaliantion[i];
		}
		return sum / 2;
	}
	
}
