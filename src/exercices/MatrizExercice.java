package exercices;

import java.util.Scanner;

public class MatrizExercice {

    Scanner in = new Scanner(System.in);

    public void exercice01() {

        int m, n, x = 0;

        System.out.print("Write the value lines: ");
        n = in.nextInt();

        System.out.print("Write the value columns: ");
        m = in.nextInt();

        Integer[][] array = new Integer[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = in.nextInt();
            }
        }

        System.out.print("Enter with value of x: ");
        x = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");

                    if (j > 0) {
                        System.out.println("Left: " + array[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + array[i-1][j]);
                    }
                    if (j < array[i].length-1) {
                        System.out.println("Right: " + array[i][j+1]);
                    }
                    if (i < array.length-1) {
                        System.out.println("Down: " + array[i+1][j]);
                    }

                }
            }
        }
    }
}
