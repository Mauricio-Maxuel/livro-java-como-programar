package org.maumas.AFCapitulo7.exercicios.AE7_19;

import java.util.Scanner;

public class SistemaReservaAerea {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean[] passagens = new boolean[10];

        System.out.println("Bem vindo a airlines south!");

        for (int i = 0; i < passagens.length; i++) {

            System.out.println("Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica");

            int escolha = scanner.nextInt();

            existeAssento(passagens, escolha, false);

        }

        System.out.println("Voo cheio!!");

    }

    private static void existeAssento(boolean[] passagens, int escolha, boolean isRealocacao) {
        int assentoDisponivel = -1;
        boolean temAssento = false;

        if (escolha == 1) {

            System.out.println("Você escolheu a primeira classe, verificando disponibilidade...");

            for (int i = 0; i < passagens.length / 2; i++) {
                if (!passagens[i]) {
                    assentoDisponivel = i;
                    temAssento = true;
                    break;
                }
            }

            verificandoAssentos(passagens, isRealocacao, temAssento, assentoDisponivel, escolha);

        } else {

            System.out.println("Você escolheu a classe Econômica, verificando disponibilidade...");

            for (int i = passagens.length / 2; i < passagens.length; i++) {
                if (!passagens[i]) {
                    assentoDisponivel = i;
                    temAssento = true;
                    break;
                }
            }

            verificandoAssentos(passagens, isRealocacao, temAssento, assentoDisponivel, escolha);
        }
    }

    private static void verificandoAssentos(boolean[] passagens, boolean isRealocacao, boolean temAssento, int assentoDisponivel, int escolha) {
        if (temAssento) {
            System.out.println("Seu assento será o de número: " + (assentoDisponivel + 1));
            passagens[assentoDisponivel] = true;
        } else {

            if (isRealocacao) {
                System.out.println("Desculpe, não encontramos assentos, aguarde até o proximo voo");
                return;
            }

            System.out.println("Não encontramos assento nessa classe, deseja viajar de " + (escolha == 1 ? "primeira Classe" : "Classe econômica") + "? | sim -> 1 || não -> 2");

            int escolha1 = scanner.nextInt();

            if (escolha1 == 1) {
                existeAssento(passagens, 2, true);
            } else {
                System.out.println("O próximo voo parte em 3 horas");
            }
        }
    }
}
