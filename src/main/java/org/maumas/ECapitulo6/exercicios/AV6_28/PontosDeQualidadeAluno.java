package org.maumas.ECapitulo6.exercicios.AV6_28;

public class PontosDeQualidadeAluno {

    public static void main(String[] args) {

        System.out.println(qualityPoints(10));

    }

    public static int qualityPoints(int average) {

        int quality;
        if (average < 60) {
            quality = 0;
        } else if (average < 70) {
            quality = 1;
        } else if (average < 80) {
            quality = 2;
        } else if (average < 90) {
            quality = 3;
        } else {
            quality = 4;
        }

        return quality;
    }

}
