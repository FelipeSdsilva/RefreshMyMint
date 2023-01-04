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
            case 01: {
                ArrayController.menuExercicesArray();
                break;
            }
            case 02: {
                ConditionalStructureController.menuExercicesConditional();
                break;
            }
            case 03: {
                ForController.menuExercicesFor();
                break;
            }
            case 04: {
                OrientObjectExcControll.menuExerOrientationObject();
                break;
            }
            case 05: {
                SequentialStrutureController.menuExercicesSequential();
                break;
            }
            case 06: {
                WhileController.menuExercicesWhile();
                break;
            }
            case 07: {
                ListController.ListExerciceMenu();
                break;
            }
            case 00: {
                System.out.println(view.screenEnd);
                break;
            }
            default: {
                InitialController.menuInitial();
            }
        }

        in.close();
    }
}