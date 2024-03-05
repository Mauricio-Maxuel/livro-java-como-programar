package org.maumas.AECapitulo6.exercicios.AQ6_23;

import java.util.Scanner;

public class LocalizeOMinimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 numeros");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println("o menor valor é " + minimum3(a, b, c));

    }

    private static double minimum3(double a, double b, double c) {
        return Math.min(c, Math.min(a, b));
    }

}
