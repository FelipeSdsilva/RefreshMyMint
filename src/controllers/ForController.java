package controllers;

import exercises.ForExercise;
import views.MenuView;

import java.util.Scanner;

public class ForController {

    public static void menuExerciseFor() {

        MenuView view = new MenuView();
        Scanner in = new Scanner(System.in);
        ForExercise exFor = new ForExercise();
        int n;

        System.out.print(view.menuFor);
        n = in.nextInt();

        switch (n) {
            case 1 -> exFor.exercise01();
            case 2 -> exFor.exercise02();
            case 3 -> exFor.exercise03();
            case 4 -> exFor.exercise04();
            case 5 -> exFor.exercise05();
            case 6 -> exFor.exercise06();
            case 7 -> exFor.exercise07();
            case 8 -> exFor.exercise08();
            case 9 -> exFor.exercise09();
            case 10 -> exFor.exercise10();
            case 11 -> exFor.exercise11();
            default -> InitialController.menuInitial();
        }

        in.close();
    }
}
