package org.maumas.AECapitulo6.exercicios.AR6_24;

public class NumeroPerfeito {


    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            isPerfect(i);
            System.out.println();
        }
    }

    private static void isPerfect(int number) {
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.print(number + " = ");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " + ");
                }
            }
        } else {
            System.out.print(number);
        }

    }

}
