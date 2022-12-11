package application;

import java.util.Locale;

import controllers.InitialController;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	
		InitialController.menuInitial();
	}

}
