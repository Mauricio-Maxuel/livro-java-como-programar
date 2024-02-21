package org.maumas.ZFazendoADiferencaExercicios.capitulo5.exercicios5_11_more.AE5_15;

public class ImpressaoTriangulos {

    public static void main(String[] args) {
        trianguloA();
        System.out.println();
        trianguloB();
        System.out.println();
        trianguloC();
        System.out.println();
        trianguloD();
    }

    public static void trianguloA() {
        System.out.println("A)");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void trianguloB() {
        System.out.println("B)");
        for (int i = 1; i <= 10; i++) {

            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void trianguloC() {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }


    public static void trianguloD() {
        System.out.println("D)");

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
