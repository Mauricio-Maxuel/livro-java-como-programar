package org.maumas.ECapitulo6.exercicios.AI6_18;

import java.util.Scanner;

public class QuadradoAsteriscos {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o atributo side do quadrado:");

        squareOfAsterisks(scanner.nextInt());
    }

    public static void squareOfAsterisks(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
