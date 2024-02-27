package org.maumas.ECapitulo6.exercicios.AC6_9;

import java.util.Scanner;

public class ArredondamentoDeNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        while (escolha != 1) {

            System.out.println("Digite o numero que você quer arredondar");

            double numero = scanner.nextDouble();

            System.out.println("Número digitado: " + numero + " Número Arredondado:" + (Math.floor(numero)));

            System.out.println("0 -> continuar - 1 -> parar");
            escolha = scanner.nextInt();
        }

    }

}
