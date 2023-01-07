package application;

import exercices.OrientationObjectExercice;

import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        OrientationObjectExercice or = new OrientationObjectExercice();

        or.Order();

        //InitialController.menuInitial();
    }
}
