package application;

import controllers.InitialController;

import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        InitialController.menuInitial();
    }
}
