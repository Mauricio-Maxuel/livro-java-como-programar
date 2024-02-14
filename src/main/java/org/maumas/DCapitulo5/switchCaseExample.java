package org.maumas.DCapitulo5;

import java.util.Random;

public class switchCaseExample {
    public static void main(String[] args) {


        int i = new Random().nextInt(1, 11);

        switch (i) {
            case 10:
                System.out.println("Is 10 -> " + i);
                break;
            case 1:
                System.out.println("is 1 -> " + i);
                break;
            default:
                System.out.println("another -> " + i);
        }
    }
}
