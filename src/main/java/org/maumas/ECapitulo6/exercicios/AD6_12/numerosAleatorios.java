package org.maumas.ECapitulo6.exercicios.AD6_12;

import java.security.SecureRandom;

public class numerosAleatorios {
    public static void main(String[] args) {


        SecureRandom secureRandom = new SecureRandom();


//a) 1 <= n <= 2.
        System.out.println(1 + secureRandom.nextInt(2));

//b) 1 <= n <= 100.
        System.out.println(1 + secureRandom.nextInt(100));
//c) 0 <= n <= 9.
        System.out.println(secureRandom.nextInt(9));
//d) 1000 <= n <= 1112.
        System.out.println(1000 + secureRandom.nextInt(1112));
//e) –1 <= n <= 1.
        System.out.println(-1 + secureRandom.nextInt(3));
//f) –3 <= n <= 11.
        System.out.println(-3 + secureRandom.nextInt(14));

    }
}
