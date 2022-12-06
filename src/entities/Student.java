package entities;

public class Student {
	
	private String name;
	private Double[] avaliantion = new Double[3];
	
	public Student() {
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
		Double som = 0.0;
		for(int i = 0; i < avaliantion.length ; i++) {
			som += avaliantion[i];
		}
		if(som >= 60.00) {
			System.out.println("Final GRADE = " + String.format("%.2f", som)+"\nPASS");
			
		}else {
			System.out.println("Final GRADE = " + String.format("%.2f", som)+"\nFAILED");
			som = 60.00 - som;
			System.out.println("MISSING "+String.format("%.2f", som)+" POINTS");
		}
	}
	
}
