package controllers;

import exercices.ForExercice;
import views.MenuView;

import java.util.Scanner;

public class ForController {

    public static void menuExerciseFor() {

        MenuView view = new MenuView();
        Scanner in = new Scanner(System.in);
        ForExercice exFor = new ForExercice();
        int n;

        System.out.print(view.menuFor);
        n = in.nextInt();

        switch (n) {
            case 1 -> exFor.exercice01();
            case 2 -> exFor.exercice02();
            case 3 -> exFor.exercice03();
            case 4 -> exFor.exercice04();
            case 5 -> exFor.exercice05();
            case 6 -> exFor.exercice06();
            case 7 -> exFor.exercice07();
            case 8 -> exFor.exercice08();
            case 9 -> exFor.exercice09();
            case 10 -> exFor.exercice10();
            case 11 -> exFor.exercice11();
            default -> InitialController.menuInitial();
        }

        in.close();
    }
}
