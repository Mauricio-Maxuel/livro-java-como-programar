package org.maumas.ECapitulo6.exercicios.AF6_14;

public class Exponenciacao {

    public static void main(String[] args) {
        System.out.println(integerPower(3, 5));
    }

    private static int integerPower(int base, int exponent) {

        int result = base;
        for (int i = 1; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

}
