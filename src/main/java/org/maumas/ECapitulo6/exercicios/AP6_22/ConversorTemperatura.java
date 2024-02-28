package org.maumas.ECapitulo6.exercicios.AP6_22;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao conversor de temperaturas");


        int escolha = 1;
        while (escolha != 0) {
            System.out.println("digite 1 para converter de Fahrenheit para Celsius ou 2 para o contrario:");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite a temperatura:");
                int fahrenheit = scanner.nextInt();
                System.out.println("Celsius:" + toCelsius(fahrenheit));
            } else {
                System.out.println("Digite a temperatura:");
                int celsius = scanner.nextInt();
                System.out.println("fahrenheit:" + toFahrenheit(celsius));
            }

            System.out.println("Deseja continuar: 1 -> sim | 0 -> não");
            escolha = scanner.nextInt();
        }
    }

    public static int toCelsius(int fahrenheit) {
        return (int) (5.0 / 9.0 * (fahrenheit - 32));
    }

    public static int toFahrenheit(int celsius) {
        return (int) (9.0 / 5.0 * celsius + 32);
    }


}
