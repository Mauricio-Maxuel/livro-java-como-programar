package org.maumas.AFCapitulo7.exercicios.AC7_14;

public class ListaComprimentoVariavel {

    public static void main(String[] args) {
        System.out.println(product(2, 2, 2));
    }

    static int product(int... fatores) {

        int total = 1;
        for (int fator : fatores) {
            total *= fator;
        }

        return total;
    }

}
