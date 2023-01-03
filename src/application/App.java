package application;

import exercices.ListExercice;

import java.util.Locale;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		ListExercice list = new ListExercice();

		list.exercice01();
		//InitialController.menuInitial();
	}
}
