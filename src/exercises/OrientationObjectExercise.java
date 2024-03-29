package exercises;

import controllers.OrientObjectExcControl;
import entities.*;
import entities.enums.OrderStatus;
import entities.enums.WorkLevel;
import statics.ConditionalStatic;
import views.MensagensObjects;
import views.StringText;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
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
        t1.setHeight(sc.nextDouble());
        t1.setBase(sc.nextDouble());
        t1.measuresOfTriangle();

        System.out.println(msg.xAndY[6]);

        t2.setWidth(sc.nextDouble());
        t2.setHeight(sc.nextDouble());
        t2.setBase(sc.nextDouble());
        t2.measuresOfTriangle();

        System.out.println(t1);
        System.out.println(t2);

        Triangle.theBiggeArea(t1, t2);

        OrientObjectExcControl.menuExeOrientationObject();
        sc.close();
    }

    public void employeeExercise() {

        System.out.print("This exercise is  \n- 1)Fixed employee \n or \n- 2)Outsource employee? ");
        int esco = sc.nextInt();
        if (esco == 1) {
            sc.nextLine();

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
        } else {

            List<Employee> employees = new ArrayList<>();

            System.out.print("Enter the number of employees: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                sc.nextLine();

                System.out.print("Employee #" + (i + 1) + " data: \nOutsourced (y/n)? ");
                char out = sc.next().charAt(0);

                Employee employee = ConditionalStatic.typeOfEmployee(out);
                employees.add(employee);

            }

            System.out.println("\nPAYMENTS: ");
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
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

    public void orderTheStore() {
        String name, email, birthDate, status, productNam;
        int n, qtd;
        Double price;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDateTime date = LocalDateTime.now();
        LocalDate birthDateFmt;

        System.out.print("Enter client data: \nName: ");
        name = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        birthDate = sc.nextLine();
        birthDateFmt = LocalDate.parse(birthDate, fmt);

        Client client = new Client(name, email, birthDateFmt);

        System.out.print("Enter order data: \nStatus: ");
        status = sc.nextLine();

        Order order = new Order(1L, date, OrderStatus.valueOf(status));

        System.out.print("How many items to this order? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.print("Enter #" + (i + 1) + " item data: \nProduct name: ");
            productNam = sc.nextLine();
            System.out.print("Product price: ");
            price = sc.nextDouble();
            System.out.print("Quantity: ");
            qtd = sc.nextInt();

            OrderItem item = new OrderItem(qtd, price, new Product(productNam, price));
            order.addItems(item);
        }
        System.out.print(order + "\n" + client + "\n");
        for (OrderItem item : order.getItems()) {
            System.out.println(item);
        }
        System.out.print("\nTotal price: $" + String.format("%.2f", order.totalValue()) + "\n");

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
        char liked, conti, commentcont;
        String title, content, comment;
        int likes = 0;

        List<Post> posts = new ArrayList<>();

        LocalDateTime date = LocalDateTime.now();

        System.out.print("Welcome te my Social Network!\nDo you liked of include new post(y/n)? ");
        conti = sc.next().charAt(0);

        while (conti != 'n') {
            sc.nextLine();

            System.out.print("What title your post? ");
            title = sc.nextLine();
            System.out.print("Write the content? ");
            content = sc.nextLine();


            System.out.println("Do you liked this post (yes = y/ no = n)? ");
            liked = sc.next().charAt(0);
            sc.nextLine();
            if (liked == 'y') {
                likes++;
            }

            Post post = new Post(date, title, content, likes);
            posts.add(post);

            System.out.print("Do you want to comment on the post(y/n)? ");
            commentcont = sc.next().charAt(0);

            while (commentcont != 'n') {
                if (commentcont == 'y') {

                    sc.nextLine();
                    System.out.print("Write your comment: ");
                    comment = sc.nextLine();

                    post.addComments(new Comment(comment));
                }

                System.out.print("Do you want add new comment (y/n)? ");
                commentcont = sc.next().charAt(0);
            }

            System.out.print("Do you want add new post(y/n)? ");
            conti = sc.next().charAt(0);
        }

        for (Post post : posts) {
            System.out.println(post);
        }

        OrientObjectExcControl.menuExeOrientationObject();
    }

    public void tagForProduct() {
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of product: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.print("Common, used or imported (c/u/i)? ");
            char typeOfProduct = sc.next().charAt(0);

            products.add(ConditionalStatic.tagTypeOfProduct(typeOfProduct));
        }

        System.out.println("\nPRICE TAGS: ");

        for (Product prod : products) {
            System.out.println(prod.priceTag());
        }

        OrientObjectExcControl.menuExeOrientationObject();
    }

    public void abstractExercise() {
        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.print("Shape #" + (i + 1) + " data: \nRectangle or Circle (r/c)? ");
            char type = sc.next().charAt(0);

            shapes.add(ConditionalStatic.typeOfShape(type));
        }

        System.out.println("\nSHAPES AREAS: ");

        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.area());
        }

    }

    public void methodAbstractExercise() {

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.print("Tax payer #" + (i + 1) + " data: \nIndividual or Company(i/c)? ");
            char taxType = sc.next().charAt(0);

            taxPayers.add(ConditionalStatic.typeTaxPayer(taxType));

        }

        System.out.println("\nTAXES PAID: ");

        for (TaxPayer payer : taxPayers) {
            System.out.println(payer.getName() + ": $" + String.format("%.2f", payer.tax()));
        }

        Double sum = 0.0;

        for (TaxPayer payer : taxPayers) {
            sum += payer.tax();
        }

        System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", sum));
    }
}