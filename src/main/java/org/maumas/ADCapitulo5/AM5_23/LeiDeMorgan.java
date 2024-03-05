package org.maumas.ADCapitulo5.AM5_23;

public class LeiDeMorgan {

    public static void main(String[] args) {
        // leis de morgan
        // !(condição1 && condição2) -> (!condição1 || !condição2)

        int x = 10;
        int y = 15;

        if (!(x < 5) && !(y >= 7)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (!((x < 5) || (y >= 7))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
