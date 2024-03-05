package org.maumas.AECapitulo6.exercicios.AW6_29;


import java.security.SecureRandom;
import java.util.Scanner;

public class CaraCoroa {

    public enum Coin {
        HEADS, TAILS
    }

    private static int numberHeads = 0;
    private static int numberTails = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int escolha = 1;

        while (escolha != 0) {
            Coin flip = flip();

            System.out.println("O lado foi:" + flip.name());

            System.out.println("Toss coin -> 1 | exit -> 0");

            escolha = scanner.nextInt();
        }
        System.out.println("o total para cada um foi: Heads - " + numberHeads + " Tails - " + numberTails);
    }

    public static Coin flip() {
        SecureRandom secureRandom = new SecureRandom();
        int i = secureRandom.nextInt(2);

        Coin coin;

        if (i == 0) {
            coin = Coin.HEADS;
            numberHeads++;
        } else {
            coin = Coin.TAILS;
            numberTails++;
        }

        return coin;
    }


}
