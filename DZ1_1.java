
package EPAM.lesson1;

import java.util.Scanner;

public class DZ1_1 {
public static void abc (double a,double b,double c) {
    double z = (((a-3)*b/2)+c);
    System.out.println("Выражение при а="+ a + ", b=" + b+ ", с="+c+ " составляет: " +z);
}
    public static void main(String[] args) {
        System.out.println("Определм значение значение выражения ((a-3)*b/2+c)");
        Scanner x = new Scanner (System.in);
        System.out.print("Введите число а ");
        double a = x.nextDouble();
        System.out.print("Введите число b ");
        double b = x.nextDouble();
        System.out.print("Введите число c ");
        double c = x.nextDouble();
        abc(a,b,c);
    }
}
