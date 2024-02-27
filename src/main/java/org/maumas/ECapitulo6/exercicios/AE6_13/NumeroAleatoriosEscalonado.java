package org.maumas.ECapitulo6.exercicios.AE6_13;

import java.security.SecureRandom;

public class NumeroAleatoriosEscalonado {

    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

//a) 2, 4, 6, 8, 10.
        System.out.println(2 + 2 * secureRandom.nextInt(5));
//b) 3, 5, 7, 9, 11.
        System.out.println(3 + 2 * secureRandom.nextInt(5));
//c) 6, 10, 14, 18, 22.
        System.out.println(6 + 4 * secureRandom.nextInt(5));
    }

}
