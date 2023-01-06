package application;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner (System.in);
        System.out.println("Welcome to store! ");
        char cont ;

        do{

            System.out.print("Do you when continue? (y= yes/ n= no)");
            cont = in.next().charAt(0);
        }while (cont != 'n');

        in.close();
        //InitialController.menuInitial();
    }
}
