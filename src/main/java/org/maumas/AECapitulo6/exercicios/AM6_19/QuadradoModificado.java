package org.maumas.AECapitulo6.exercicios.AM6_19;

import java.util.Scanner;

public class QuadradoModificado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o atributo side do quadrado:");
        int side = scanner.nextInt();

        System.out.println("Agora insira o caracter que você quer que apareça");

        char caracter = scanner.next().charAt(0);

        squareOfAsterisks(side, caracter);
    }

    public static void squareOfAsterisks(int side, char fillCharacter) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }

}
