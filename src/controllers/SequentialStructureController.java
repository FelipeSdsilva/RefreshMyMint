package controllers;

import exercices.SequentialStructureExercice;
import views.MenuView;

import java.util.Scanner;

public class SequentialStructureController {

    public static void menuExerciseSequential() {

        SequentialStructureExercice ss = new SequentialStructureExercice();
        Scanner in = new Scanner(System.in);
        MenuView view = new MenuView();
        int n;

        System.out.print(view.menuSeq);
        n = in.nextInt();

        switch (n) {
            case 1 -> ss.exercice01();
            case 2 -> ss.exercice02();
            case 3 -> ss.exercice03();
            case 4 -> ss.exercice04();
            case 5 -> ss.exercice05();
            case 6 -> ss.exercice06();
            case 7 -> ss.exercice07();
            case 8 -> ss.exercice08();
            case 9 -> ss.exercice09();
            case 10 -> ss.exercice10();
            default -> InitialController.menuInitial();
        }

        in.close();
    }
}
