package controllers;

import views.MenuView;

import java.util.Scanner;

public class InitialController {

    public static void menuInitial() {

        Scanner in = new Scanner(System.in);
        MenuView view = new MenuView();
        int n;

        System.out.printf(view.menuIn);
        n = in.nextInt();

        switch (n) {
            case 1 -> ArrayController.menuExerciseArray();
            case 2 -> ConditionalStructureController.menuExerciseConditional();
            case 3 -> ForController.menuExerciseFor();
            case 4 -> OrientObjectExcControl.menuExeOrientationObject();
            case 5 -> SequentialStructureController.menuExerciseSequential();
            case 6 -> WhileController.menuExerciseWhile();
            case 7 -> ListController.ListExerciceMenu();
            case 0 -> System.out.println(view.screenEnd);
            default -> InitialController.menuInitial();
        }

        in.close();
    }
}