package org.maumas.AFCapitulo7.exercicios.AH7_28;

import java.security.SecureRandom;

public class CorridaTartarugaLebreTest {
    public static void main(String[] args) {
        int[] raceTrack = new int[70];

        Turtle turtle = new Turtle();
        Habbit habbit = new Habbit();


        System.out.println("BANG !!!!!\n E LÁ VÃO ELES !!!!!");
        while (habbit.getPosicao() <= 70 && turtle.getPosicao() <= 70) {
            turtle.obterAcao();
            habbit.obterAcao();
            showTrack(raceTrack, habbit.getPosicao(), turtle.getPosicao());
        }
    }

    static void showTrack(int[] raceTrack, int habbit, int turtle) {
        for (int i = 0; i < raceTrack.length; i++) {
            if (habbit == turtle && habbit == i) {
                System.out.print("AI!!");
            } else if (i == habbit) {
                System.out.print("H");
            } else if (i == turtle) {
                System.out.print("T");
            } else {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();
    }

}
