package controllers;

import exercices.ListExercice;
import views.MenuView;

import java.util.Scanner;

public class ListController {


    public static void ListExerciceMenu() {

        MenuView view = new MenuView();
        Scanner in = new Scanner(System.in);
        ListExercice list = new ListExercice();
        int n;

        System.out.print(view.menuList);
        n = in.nextInt();

        switch (n) {
            case 01: {
                list.exercice01();
                break;
            }
            case 00: {
                InitialController.menuInitial();
            }
        }
    }
}
