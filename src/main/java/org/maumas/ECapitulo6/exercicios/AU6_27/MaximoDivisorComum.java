package org.maumas.ECapitulo6.exercicios.AU6_27;

public class MaximoDivisorComum {

    public static void main(String[] args) {


        System.out.println(mdc(1234, 12));


    }

    private static int mdc(int a, int b) {


        if (b == 0) {
            return b;
        }

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        return a;
    }
}
