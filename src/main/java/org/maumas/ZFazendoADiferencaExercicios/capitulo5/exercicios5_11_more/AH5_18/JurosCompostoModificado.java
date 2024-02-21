package org.maumas.ZFazendoADiferencaExercicios.capitulo5.exercicios5_11_more.AH5_18;

public class JurosCompostoModificado {

    public static void main(String[] args) {

        // todo entender melhor

        //        a = p (1 + r)n
        int principal = 1000;

        for (int anos = 1; anos <= 20; anos++) {
            for (int juros = 5; juros < 10; juros++) {
                double amount = principal * Math.pow(1 + (juros * 0.01), anos);

                System.out.println("total com " + juros + "% de juros durante " + anos + " " + (anos == 1 ? "ano" : "anos") + " " + amount);
            }
            System.out.println();
        }
    }

}
