package entities;

public class Account {

	private int numberAcc;
	private String nameHolder;
	private double balance;

	public Account() {
	}

	public Account(int numberAcc, String nameHolder) {
		this.numberAcc = numberAcc;
		this.nameHolder = nameHolder;
	}

	public int getNumberAcc() {
		return numberAcc;
	}

	public void setNumberAcc(int numberAcc) {
		this.numberAcc = numberAcc;
	}

	public String getNameHolder() {
		return nameHolder;
	}

	public void setNameHolder(String nameHolder) {
		this.nameHolder = nameHolder;
	}

	public double getBalance() {
		return balance;
	}
	
	
	@Override
	public String toString() {
		return "Account [" +
				numberAcc + 
				", Holder= " + 
				nameHolder + 
				", Balance=" + 
				String.format("%.2f", balance) + "]";
	}

	public double deposit(double amount) {
		return this.balance += amount;
	}

	public double withdraw(double amount) {
		return this.balance -= amount + 5;
	}

}
