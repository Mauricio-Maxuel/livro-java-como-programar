package org.maumas.ADCapitulo5.exercicios5_3;

public class Exercicio5_3_C {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 20) {

            System.out.print(i);

            if (i % 5 == 0) {
                System.out.println('\t');
            }
            i++;
        }

    }

}
