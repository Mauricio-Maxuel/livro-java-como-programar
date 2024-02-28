package org.maumas.ECapitulo6.exercicios.AO6_21;

public class SeparandoDigitos {

    public static void main(String[] args) {
        System.out.println(getQuotient(6, 3));
        System.out.println(getRest(8, 3));

        displayDigits(1000);

    }

    private static int getQuotient(int a, int b) {
        return a / b;
    }

    private static int getRest(int a, int b) {
        return a % b;
    }

    private static void displayDigits(int a) {
        String s = String.valueOf(a);

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }




}
