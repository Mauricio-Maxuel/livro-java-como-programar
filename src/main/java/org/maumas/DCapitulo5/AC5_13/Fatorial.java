package org.maumas.DCapitulo5.AC5_13;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Fatorial de 1 a 20");

        for (int i = 1; i <= 20; i++) {

            System.out.println("Fatorial de " + i);
            long total = 1;

            for (int j = i; j >= 1; j--) {
                total *= j;
            }
            System.out.println("é " + total);
            System.out.println();
        }
    }
}
