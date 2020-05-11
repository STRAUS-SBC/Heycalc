package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner vib = new Scanner(System.in);
        System.out.println("Выберите 1)sin или 2)cos");
        int k = vib.nextInt();
        switch (k) {
            case (1):
                System.out.println("sin x = n");

                Scanner nch1 = new Scanner(System.in);
                System.out.println("Введите n");
                int n = nch1.nextInt();

                switch (n) {

                    case (1):
                        System.out.println("x = П/2 + 2Пk");
                        break;
                    case (0):
                        System.out.println("x = Пk");
                        break;
                    case (-1):
                        System.out.println("-П/2 + 2Пk");
                        break;
                    default:
                        System.out.println("x = (-1)^k * arcsin " + n + " + Пk");
                        break;

                }
            case (2):
                System.out.println("cos x = n");

                Scanner nch2 = new Scanner(System.in);
                System.out.println("Введите n");
                int m = nch2.nextInt();

                switch (m) {
                    case (1):
                        System.out.println("x = 2Пk");
                        break;
                    case (0):
                        System.out.println("x = П/2 + Пk");
                        break;
                    case (-1):
                        System.out.println("x = П + 2Пk");
                    default:
                        System.out.println("x = +-arccos " + m + " + 2Пk");
                        break;
                }

        }

    }
}
