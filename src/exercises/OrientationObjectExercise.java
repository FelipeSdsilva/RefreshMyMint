package exercises;

import controllers.OrientObjectExcControl;
import entities.*;
import entities.enums.WorkLevel;
import views.MensagensObjects;
import views.StringText;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class OrientationObjectExercise {

    Scanner sc = new Scanner(System.in);
    MensagensObjects ms = new MensagensObjects();
    StringText msg = new StringText();

    public void fixedExerciseString() {

        Product p1 = new Product(5290, "Computer", 2100.0);
        Product p2 = new Product(5598, "Office desk", 650.50);
        Person per = new Person("Maria", 30, 1.70, 'f');

        double measure = 53.234567;
        System.out.printf(ms.product[6], p1.getName(), p1.getPrice(), p2.getName(), p2.getPrice(), per.getAge(),
                p1.getCode(), per.getGender(), measure, measure);
        Locale.setDefault(Locale.US);
        System.out.println("US decimal point:" + String.format("%.3f", measure));

        OrientObjectExcControl.menuExeOrientationObject();
    }

    public void resolveProblemWithOrientationObject() {

        Product p1 = new Product();

        System.out.print(ms.product[0] + "Name: ");
        p1.setName(sc.nextLine());
        System.out.print("Price: ");
        p1.setPrice(sc.nextDouble());
        System.out.print("Quantity in stock: ");
        int qtd = sc.nextInt();
        p1.addStock(qtd);

        System.out.println(ms.product[1] + p1);

        System.out.print(ms.product[3]);
        qtd = sc.nextInt();
        p1.addStock(qtd);

        System.out.println(ms.product[2] + p1);

        System.out.print(ms.product[4]);
        qtd = sc.nextInt();
        p1.removeStock(qtd);

        System.out.println(ms.product[2] + p1);

        OrientObjectExcControl.menuExeOrientationObject();
    }

    public void rectangleExercise() {
        Rectangle rec = new Rectangle();

        System.out.print(msg.rectangle[0]);
        rec.setHeight(sc.nextDouble());
        rec.setWidth(sc.nextDouble());

        System.out.println(rec);

        OrientObjectExcControl.menuExeOrientationObject();
    }

    public static void triangleExercise() {

        Triangle t1 = new Triangle(), t2 = new Triangle();

        StringText msg = new StringText();
        Scanner sc = new Scanner(System.in);

        System.out.println(msg.xAndY[5]);

        t1.setWidth(sc.nextDouble());
        t1.setHight(sc.nextDouble());
        t1.setBase(sc.nextDouble());
        t1.measuresOfTriangle();

        System.out.println(msg.xAndY[6]);

        t2.setWidth(sc.nextDouble());
        t2.setHight(sc.nextDouble());
        t2.setBase(sc.nextDouble());
        t2.measuresOfTriangle();

        System.out.println(t1);
        System.out.println(t2);

        Triangle.theBiggeArea(t1, t2);

        OrientObjectExcControl.menuExeOrientationObject();
        sc.close();
    }

    public void employeeExercise() {

        Employee emp = new Employee();
        System.out.print("Name: ");
        emp.setName(sc.nextLine());
        System.out.print("Gross salary: ");
        emp.setSalary(sc.nextDouble());
        System.out.print("Tax: ");
        emp.setTax(sc.nextDouble());

        System.out.println(emp);

        System.out.print(ms.employee[4]);
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println(emp);

        OrientObjectExcControl.menuExeOrientationObject();
    }

    public void studentExercise() {
        Student std = new Student();

        std.setName(sc.nextLine());

        Double[] aval = new Double[3];
        for (int i = 0; i < aval.length; i++) {
            aval[i] = sc.nextDouble();
        }

        std.setAvaliantion(aval);

        std.finalNote();

        OrientObjectExcControl.menuExeOrientationObject();
    }

    public void accountExercise() {
        Account acc = new Account();
        char confDeposit;
        double value;

        System.out.print(ms.account[0]);
        acc.setNumberAcc(sc.nextInt());
        sc.nextLine();

        System.out.print(ms.account[1]);
        acc.setNameHolder(sc.nextLine());

        System.out.print(ms.account[2]);
        confDeposit = sc.next().charAt(0);

        if (confDeposit == 'Y' || confDeposit == 'y') {
            System.out.print(ms.account[3]);
            value = sc.nextDouble();
            acc.deposit(value);
        }

        System.out.println(ms.account[4] + "\n" + acc + "\n");

        System.out.print(ms.account[5]);
        value = sc.nextDouble();
        acc.deposit(value);

        System.out.println(ms.account[6] + "\n" + acc + "\n");

        System.out.print(ms.account[7]);
        value = sc.nextDouble();
        acc.withdraw(value);

        System.out.println(ms.account[6] + "\n" + acc);

        OrientObjectExcControl.menuExeOrientationObject();
    }

    public void Order() {

        System.out.println("Welcome to store! ");
        char cont;


        do {


            System.out.print("Do you when continue? (y= yes/ n= no)");
            cont = sc.next().charAt(0);
        } while (cont != 'n');

        OrientObjectExcControl.menuExeOrientationObject();
    }

    public void contractsOfEmployees() {
        int n, hours, year, month;
        String nameDep, name, level, date;
        double baseSalary, valuePerHour;

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Enter department's name: ");
        nameDep = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Level: ");
        level = sc.nextLine();
        System.out.print("Base salary: ");
        baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkLevel.valueOf(level), baseSalary, new Department(nameDep));

        System.out.print("How many contracts to this worker? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            sc.nextLine();

            System.out.print("Date (DD/MM/YYYY): ");
            date = sc.nextLine();
            System.out.print("Value per hour: ");
            valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            hours = sc.nextInt();

            worker.addContract(new HourContract(LocalDate.parse(date, fmt1), valuePerHour, hours));
        }

        sc.nextLine();
        System.out.print("Enter the month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
        month = Integer.parseInt(monthAndYear.substring(0, 2));
        year = Integer.parseInt(monthAndYear.substring(3));


        System.out.println(worker + "\nIncome for " + monthAndYear + ": "
                + String.format("%.2f", worker.income(month, year)));

        OrientObjectExcControl.menuExeOrientationObject();
    }

    public void socialNetwork() {
        char liked, conti;
        String title, content, comment;
        int likes = 0, deslike = 0;

        LocalDateTime date = LocalDateTime.now();

        System.out.print("Welcome te my Social Network!\nDo you liked of include new post(y/n)? ");
        do {
            conti = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("What title your post? ");
            title = sc.nextLine();
            System.out.print("Write the content? ");
            content = sc.nextLine();
            Post post = new Post(date, title, content, 0);

            System.out.println(post);

            System.out.println("Do you liked this post (yes = y/ no = n)? ");
            liked = sc.next().charAt(0);
            sc.nextLine();
            if (liked == 'y') {
                likes++;
            } else {
                deslike++;
            }

        } while (conti != 'n');
    }

}