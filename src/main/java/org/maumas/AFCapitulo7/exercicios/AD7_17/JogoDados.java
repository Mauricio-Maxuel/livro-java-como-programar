package org.maumas.AFCapitulo7.exercicios.AD7_17;

import java.security.SecureRandom;

public class JogoDados {

    public static void main(String[] args) {


        int[] resultados = play();

        for (int resultado : resultados) {
            System.out.println(resultado + ",");
        }

    }

    static int[] play() {
        int[] resultados = new int[11];
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 1; i < 36_000; i++) {
            int dado1 = 1 + secureRandom.nextInt(6);
            int dado2 = 1 + secureRandom.nextInt(6);

            int soma = dado1 + dado2;
            separaResultado(resultados, soma);
        }


        return resultados;
    }

    private static void separaResultado(int[] resultados, int soma) {


        switch (soma) {
            case 2:
                resultados[0]++;
                break;
            case 3:
                resultados[1]++;
                break;
            case 4:
                resultados[2]++;
                break;
            case 5:
                resultados[3]++;
                break;
            case 6:
                resultados[4]++;
                break;
            case 7:
                resultados[5]++;
                break;
            case 8:
                resultados[6]++;
                break;
            case 9:
                resultados[7]++;
                break;
            case 10:
                resultados[8]++;
                break;
            case 11:
                resultados[9]++;
                break;
            case 12:
                resultados[10]++;
                break;
        }

    }


}
