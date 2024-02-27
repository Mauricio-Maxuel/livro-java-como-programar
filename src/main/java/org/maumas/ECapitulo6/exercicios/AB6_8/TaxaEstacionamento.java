package org.maumas.ECapitulo6.exercicios.AB6_8;

public class TaxaEstacionamento {

    private final static int HOURS_3 = 3;
    private final static int MAXIMUM_HOURS = 24;
    private static double TOTAL_AMMOUNT = 0;
    private static final double MINIMUM_RATE = 2.00;
    private static final double HOUR_RATE = 0.50;

    public static void main(String[] args) {
        int cliente = 12;
        int cliente1 = 3;
        int cliente2 = 24;

        System.out.println("cliente 1:");
        System.out.println(calculateCharges(cliente));

        System.out.println("cliente 2:");
        System.out.println(calculateCharges(cliente1));

        System.out.println("cliente 3:");
        System.out.println(calculateCharges(cliente2));
        System.out.println();

        System.out.println(TOTAL_AMMOUNT);
    }

    public static double calculateCharges(int hours) {
        double clientAmmount = MINIMUM_RATE;

        if (hours > HOURS_3 && hours < MAXIMUM_HOURS) {
            clientAmmount += HOUR_RATE * hours;
        }

        if (hours == MAXIMUM_HOURS) {
            clientAmmount = 10.0;
        }

        TOTAL_AMMOUNT += clientAmmount;
        return clientAmmount;
    }
}
