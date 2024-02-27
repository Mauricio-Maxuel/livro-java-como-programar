package org.maumas.ECapitulo6.exercicios.AN6_20;

import java.util.Scanner;

public class AreaCirculo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o raio do circulo:");

        double raio = scanner.nextDouble();
        System.out.println("O circulo tem a seguinte area:" + circleArea(raio));

    }

    public static double circleArea(double raio) {
        return Math.PI * (raio * raio);
    }

}
