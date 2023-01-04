package exercices;

import controllers.ListController;
import entities.Employee;
import views.MensagensObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExercice {

    Scanner in = new Scanner(System.in);
    MensagensObjects ms = new MensagensObjects();

    public void exercice01() {

        List<Employee> employees = new ArrayList<>();
        int n;
        long id, idEncrease;
        String name;
        double salary, percent;

        System.out.print(ms.employee[9]);
        n = in.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print(ms.employee[10] + (i + 1) + ": \n" + ms.employee[12]);
            id = in.nextLong();
            in.nextLine();

            System.out.print(ms.person[3]);
            name = in.nextLine();

            System.out.print(ms.employee[11]);
            salary = in.nextDouble();

            employees.add(new Employee(id, name, salary));
        }


        System.out.print("\n" + ms.employee[13]);
        idEncrease = in.nextLong();

        List<Employee> employees1 = employees.stream().filter(employee -> employee.getId() == idEncrease).toList();

        if (!(employees1.isEmpty())) {
            for (Employee emp : employees1) {
                System.out.print(ms.employee[14]);
                percent = in.nextDouble();
                emp.increaseSalary(percent);

            }
        } else {
            System.out.println(ms.employee[16]);
        }

        System.out.println("\n" + ms.employee[15]);
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        ListController.ListExerciceMenu();

    }
}
