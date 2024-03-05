package org.maumas.AFCapitulo7.exercicios.AA7_10;

public class ComissaoVendas {


    public static void main(String[] args) {

        int[] vendasSemanais = {3000, 2809, 1000, 4322, 8832};

        int[] ints = quantidadeIntervalos(vendasSemanais);


        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    private static int[] quantidadeIntervalos(int[] vendasSemanais) {

        int[] intervalos = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < vendasSemanais.length; i++) {
            adicionaIntervalos(200 + (vendasSemanais[i] * 0.09), intervalos);
        }
        return intervalos;
    }

    private static int[] adicionaIntervalos(double v, int[] intervalos) {


        if (v > 200 && v < 299) {
            intervalos[0]++;
        } else if (v < 399) {
            intervalos[1]++;
        } else if (v < 499) {
            intervalos[2]++;
        } else if (v < 599) {
            intervalos[3]++;
        } else if (v < 699) {
            intervalos[4]++;
        } else if (v < 799) {
            intervalos[5]++;
        } else if (v < 899) {
            intervalos[6]++;
        } else if (v < 999) {
            intervalos[7]++;
        } else {
            intervalos[8]++;
        }

        return intervalos;

    }

}
