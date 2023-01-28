package dz_test;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите величину стороны а: ");
        int a = scanner.nextInt();

        System.out.println("Укажите величину стороны b: ");
        int b = scanner.nextInt();

        System.out.println("Укажите величину стороны с: ");
        int c = scanner.nextInt();

        int p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Площадь треугольника равна = " + s);
    }


}
