package org.maumas.AECapitulo6.exercicios.AY6_31;

import java.security.SecureRandom;
import java.util.Scanner;

public class AdivinheAModificaoNumero {

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
        int tentativas = 0;

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
            tentativas++;
        } while (chose != number);

        exibeResultado(tentativas);
    }


    public static void exibeResultado(int tentativas) {
        if (tentativas > 10) {
            System.out.println("Você deve ser capaz de fazer melhor");
        } else if (tentativas == 10) {
            System.out.println("Aha! Você sabe o segredo!");
        } else {
            System.out.println("Você sabe o segredo ou tem muita sorte!");
        }
    }

}
