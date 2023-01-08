package exercises;

import controllers.ConditionalStructureController;
import statics.ConditionalStatic;
import statics.MultiplicationStatic;
import statics.SumStatic;
import views.MensagensObjects;
import views.StringText;

import java.util.Scanner;

public class ConditionalStructureExercise {

    Scanner in = new Scanner(System.in);
    StringText msg = new StringText();
    MensagensObjects ms = new MensagensObjects();

    public void exercise01() {
        Double av1, av2, sum;

        System.out.print(ms.student[0]);
        av1 = in.nextDouble();
        System.out.print(ms.student[1]);
        av2 = in.nextDouble();

        sum = SumStatic.sumTwoNumbersDoub(av1, av2);

        String resp = (sum < 60) ? ms.student[3] : "";

        System.out.println(ms.student[2] + sum + "\n" + resp);

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise02() {

        double a, b, c, delt, x1, x2;

        System.out.print(msg.mensage[9]);
        a = in.nextDouble();
        System.out.print(msg.mensage[10]);
        b = in.nextDouble();
        System.out.print(msg.mensage[11]);
        c = in.nextDouble();

        delt = MultiplicationStatic.formOfBaskara(a, b, c);

        x1 = MultiplicationStatic.positiveValueBaskara(a, b, delt);
        x2 = MultiplicationStatic.negativeValueBaskara(a, b, delt);

        String result = !(x1 != Double.NaN && x2 != Double.NaN) ? msg.mensage[12]
                : msg.xAndY[3] + String.format("%.4f", x1) + "\n" + msg.xAndY[4] + String.format("%.4f", x2);

        System.out.println(result);

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise03() {

        int a, b, c;

        System.out.print(msg.mensage[13]);
        a = in.nextInt();
        System.out.print(msg.mensage[14]);
        b = in.nextInt();
        System.out.print(msg.mensage[15]);
        c = in.nextInt();
        ConditionalStatic.smallerBetweeThreeNumbers(a, b, c);

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise04() {

        int min;

        System.out.print(msg.mensage[16]);
        min = in.nextInt();

        System.out.println(msg.mensage[17] + String.format("%.2f", ConditionalStatic.valueContOfTellOperator(min)));

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise05() {

        double money, totalValue, price;
        int qtd;

        System.out.print(ms.product[5]);
        price = in.nextDouble();

        System.out.print(ms.product[6]);
        qtd = in.nextInt();

        System.out.print(ms.product[7]);
        money = in.nextDouble();

        totalValue = MultiplicationStatic.converterDollar(price, (double) qtd);

        ConditionalStatic.changeVerification(money, totalValue);

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise06() {
        double avgGlu;
        System.out.print(msg.mensage[18]);
        avgGlu = in.nextDouble();

        ConditionalStatic.quantityOfGlucose(avgGlu);

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise07() {
        double a, b, c;

        System.out.println(msg.mensage[19]);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        ConditionalStatic.biggerDistance(a, b, c);

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise08() {

        char scale;
        double temp;

        System.out.print(msg.mensage[28]);
        scale = in.next().charAt(0);

        String result = (scale == 'C') ? msg.mensage[26] : msg.mensage[27];

        System.out.print(result);
        temp = in.nextDouble();

        String result1 = (scale == 'C') ? msg.mensage[25] : msg.mensage[29];

        System.out.println(
                result1 + String.format("%.2f", ConditionalStatic.convertTemperatureCelciusAndFahrenheit(scale, temp)));

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise09() {

        int codProd, qtd;

        System.out.print(ms.product[10]);
        codProd = in.nextInt();
        System.out.print(ms.product[6]);
        qtd = in.nextInt();

        System.out.print(ms.product[9]);
        ConditionalStatic.totalOrderPriceSnackBar(codProd, qtd);

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise10() {

        int a, b;

        System.out.println(msg.mensage[31]);
        a = in.nextInt();
        b = in.nextInt();

        ConditionalStatic.areMultiples(a, b);

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise11() {

        double salary;

        System.out.print(ms.employee[8]);
        salary = in.nextDouble();

        ConditionalStatic.increasySalary(salary);

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise12() {

        int initH, endH;

        System.out.print(msg.mensage[34]);
        initH = in.nextInt();

        System.out.print(msg.mensage[35]);
        endH = in.nextInt();

        SumStatic.initalAndEndHorTheGame(initH, endH);

        ConditionalStructureController.menuExerciseConditional();
    }

    public void exercise13() {

        double x = 0, y = 0;

        System.out.print(msg.xAndY[0]);
        x = in.nextDouble();

        System.out.print(msg.xAndY[1]);
        y = in.nextDouble();

        ConditionalStatic.planCartesian('D', x, y);

        ConditionalStructureController.menuExerciseConditional();
    }
}
