package org.maumas.ZFazendoADiferencaExercicios.capitulo5.exercicios5_11_more.AF5_16;

import java.util.Scanner;

public class GraficosDeBarras {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] graficos = new int[5];
        System.out.println("Insira 5 numeros de 1 a 30");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("insira o " + (i + 1) + "° número");
            graficos[i] = scanner.nextInt();
        }

        System.out.println("os graficos são:");

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= graficos[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
