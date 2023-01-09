package controllers;

import exercises.ListExercise;
import views.MenuView;

import java.util.Scanner;

public class ListController {


    public static void ListExerciceMenu() {

        MenuView view = new MenuView();
        Scanner in = new Scanner(System.in);
        ListExercise list = new ListExercise();
        int n;

        System.out.print(view.menuList);
        n = in.nextInt();

        switch (n) {
            case 1 -> list.exercise01();
            case 0 -> InitialController.menuInitial();
        }
    }
}
