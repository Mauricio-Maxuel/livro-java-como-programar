package org.maumas.AECapitulo6.exercicios.AX6_30;

import java.security.SecureRandom;
import java.util.Scanner;

public class AdivinheNumero {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int escolha = 1;

        while (escolha != 0) {

            System.out.println("vamos começar!");

            gaming();

            System.out.println("Deseja tentar novamente?");
            System.out.println("0 -> não | 1 -> sim");
            escolha = scanner.nextInt();
        }

    }

    public static void gaming() {
        System.out.println("Tente adivinhar o número");
        SecureRandom secureRandom = new SecureRandom();

        int number = secureRandom.nextInt(1000);
        int chose;
        do {
            chose = scanner.nextInt();

            if (chose > number) {
                System.out.println("Muito Alto, tente novamente");
            } else if (chose < number) {
                System.out.println("Muito Baixo, tente novamente");
            }

        } while (chose != number);
        System.out.println("Parabéns, você adivinhou o número!!!");
    }


}
