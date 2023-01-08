package controllers;

import exercises.WhileExercise;
import views.MenuView;

import java.util.Scanner;

public class WhileController {

	public static void menuExerciseWhile() {

        WhileExercise wl = new WhileExercise();
        Scanner in = new Scanner(System.in);
        MenuView view = new MenuView();
        int n;

        System.out.print(view.menuWhile);
        n = in.nextInt();

        switch (n) {
            case 1 -> wl.exercice01();
            case 2 -> wl.exercice02();
            case 3 -> wl.exercice03();
            case 4 -> wl.exercice04();
            case 5 -> wl.exercice05();
            case 6 -> wl.exercice06();
            case 7 -> wl.exercice07();
            case 8 -> wl.exercice08();
            case 9 -> wl.exercice09();
            default -> InitialController.menuInitial();
        }

        in.close();
    }
}
