package org.maumas.ZFazendoADiferencaExercicios.capitulo5.exercicios5_11_more.AA5_11;

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros que irão ser inseridos");

        int counter = scanner.nextInt();

        int min = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.println("Digite o " + i + "° número");

            int numbers = scanner.nextInt();

            if (i == 1) {
                min = numbers;
            }

            if (numbers < min) {
                min = numbers;
            }
        }

        System.out.println("o menor número é " + min);

    }
}
