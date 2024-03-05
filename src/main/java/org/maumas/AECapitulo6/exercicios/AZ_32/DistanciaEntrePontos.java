package org.maumas.AECapitulo6.exercicios.AZ_32;

public class DistanciaEntrePontos {

    public static void main(String[] args) {
        System.out.println(distance(2, 5, 6, 1));
    }

    static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
