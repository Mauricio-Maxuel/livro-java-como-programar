package org.maumas.ADCapitulo5.AO5_25;

import java.util.Scanner;

public class LosangoAlterado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas que seu losango deverá ter");

        int linhas = scanner.nextInt();

        losango(linhas);
    }


    public static void losango(int linhas) {

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < linhas - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int i = linhas - 2; i >= 0; i--) {

            for (int j = 0; j < linhas - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
