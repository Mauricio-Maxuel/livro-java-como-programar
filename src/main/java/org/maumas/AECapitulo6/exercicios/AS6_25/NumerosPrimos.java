package org.maumas.AECapitulo6.exercicios.AS6_25;

public class NumerosPrimos {

    public static int numbers = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }

        System.out.println("qtd verificacoes " + numbers);
    }

    public static boolean isPrimo(int number) {

        int times = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (times == 3) {
                break;
            }

            if (number % i == 0) {
                times++;
            }
        }


        return !(number == 0 || number == 1) && times != 2;
    }

}
