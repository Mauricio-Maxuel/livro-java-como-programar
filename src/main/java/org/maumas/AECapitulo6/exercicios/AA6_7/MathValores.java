package org.maumas.AECapitulo6.exercicios.AA6_7;

public class MathValores {


    public static void main(String[] args) {
        System.out.println(Math.abs(7.5)); // 7.5
        System.out.println(Math.floor(7.5)); //7 -> 7.0
        System.out.println(Math.abs(0.0)); //0.0
        System.out.println(Math.ceil(0.0)); //1.0 -> 0
        System.out.println(Math.abs(-6.4)); // 6.4
        System.out.println(Math.ceil(-6.4)); // -6.0
        System.out.println(Math.ceil(-Math.abs(-8 + Math.floor(-5.5)))); // -13
        // -> if the argument is already integer, the result will be equal to the argument
        // -> -14.0

    }

}
