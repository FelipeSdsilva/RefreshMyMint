package controllers;

import exercises.OrientationObjectExercise;
import views.MenuView;

import java.util.Scanner;

public class OrientObjectExcControl {

    public static void menuExeOrientationObject() {

        OrientationObjectExercise or = new OrientationObjectExercise();
        Scanner in = new Scanner(System.in);
        MenuView view = new MenuView();
        int n;

        System.out.print(view.menuOriObj);
        n = in.nextInt();

        switch (n) {
            case 1 -> or.fixedExerciseString();
            case 2 -> or.resolveProblemWithOrientationObject();
            case 3 -> or.rectangleExercise();
            case 4 -> OrientationObjectExercise.triangleExercise();
            case 5 -> or.employeeExercise();
            case 6 -> or.studentExercise();
            case 7 -> or.accountExercise();
            case 8 -> or.contractsOfEmployees();
            case 9 -> or.Order();
            default -> InitialController.menuInitial();
        }

        in.close();
    }
}
