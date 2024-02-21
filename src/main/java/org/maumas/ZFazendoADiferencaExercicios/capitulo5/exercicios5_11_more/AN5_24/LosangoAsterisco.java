package org.maumas.ZFazendoADiferencaExercicios.capitulo5.exercicios5_11_more.AN5_24;

public class LosangoAsterisco {

    public static void main(String[] args) {

//        for (int i = 1; i <= 9; i += 2) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 7; i >= 1; i -= 2) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int tamanho = 5;

        // Parte superior do losango
        for (int i = 0; i < tamanho; i++) {
            // Imprime espaços à esquerda
            for (int j = 0; j < tamanho - i - 1; j++) {
                System.out.print(" ");
            }

            // Imprime asteriscos
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Muda para a próxima linha
            System.out.println();
        }

        // Parte inferior do losango
        for (int i = tamanho - 2; i >= 0; i--) {
            // Imprime espaços à esquerda
            for (int j = 0; j < tamanho - i - 1; j++) {
                System.out.print(" ");
            }

            // Imprime asteriscos
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Muda para a próxima linha
            System.out.println();
        }
    }

}
