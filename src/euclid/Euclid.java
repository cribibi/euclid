package euclid;

import java.util.Scanner;

public class Euclid {
    public static int cmmdc(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = (a - b); //merge si cu scadere si cu impartire, impartire  mai rapid, vom lua modulo a%b
            } else if (a < b) {
                b = (b - a);
            }
        }
        return a;
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);
        System.out.println("Type the first number, a: ");
        int a = tastatura.nextInt();
        System.out.println("Type the second number, b: ");
        int b = tastatura.nextInt();

        if ((a != 0) && (b != 0)) {
            System.out.println("Cel mai mare divizor comun: " + cmmdc(a, b));
        } else {
            System.out.println("At least one of the numbers is 0");
        }

        System.out.println("Type n: ");
        int n = tastatura.nextInt();
        System.out.println("------------------------");
        System.out.printf(n + "!=" + factorial(n));

    }
}


