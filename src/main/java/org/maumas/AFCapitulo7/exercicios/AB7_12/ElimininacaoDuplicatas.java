package org.maumas.AFCapitulo7.exercicios.AB7_12;

import java.util.Scanner;

public class ElimininacaoDuplicatas {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];
        int[] valoresUnicos = new int[5];


        for (int i = 0; i < valores.length; i++) {

            System.out.println("Insira o " + (i + 1) + "° numero de 1 a 100");

            int valor = scanner.nextInt();

            boolean isDiferente = true;

            for (int j = 0; j < valores.length; j++) {
                if (valor == valores[j]) {
                    isDiferente = false;
                }
            }

            valores[i] = valor;
            if (isDiferente) {
                System.out.println(valor);
            }
        }

        boolean isValorRepetido = false;

        for (int i = 0; i < valores.length; i++) {
            isValorRepetido = false;
            for (int j = 0; j < valores.length; j++) {
                if (i == j) {
                    continue;
                }

                if (valores[i] == valores[j]) {
                    isValorRepetido = true;
                    break;
                }
            }

            if (!isValorRepetido) {
                valoresUnicos[i] = valores[i];
            }
        }

        for (int valorUnico : valoresUnicos) {
            if (valorUnico != 0) {
                System.out.print(valorUnico + " ");
            }
        }
    }
}
