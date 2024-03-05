package org.maumas.ADCapitulo5.AI5_21;

public class TriangulosPitagoricos {

    public static void main(String[] args) {

        int side1 = 5;
        int side2 = 12;
        int hypotenuse = 12 ;
        isPitagorico(side1, side2, hypotenuse);

    }

    private static void isPitagorico(int side1, int side2, int hypotenuse) {
        if ((side1 * side1) + (side2 * side2) == (hypotenuse * hypotenuse)) {
            System.out.println("is");
        }else {
            System.out.println("no");
        }
    }

}
