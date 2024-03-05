package org.maumas.ZZFazendoADiferencaExercicios.capitulo6.A6_36;

import java.security.SecureRandom;
import java.util.Scanner;

public class InstrucaoAssistidaReduzindoFadiga {

    static Scanner scanner = new Scanner(System.in);

    public enum TipoResposta {
        NEGATIVA, POSITIVA
    }

    public static void main(String[] args) {
        System.out.println("Bem vindo ao seu assistente de aprendizado!");

        System.out.println("Vamos começar com multiplicação");

        int escolha = 1;
        while (escolha != 0) {


            int respostaCorreta = gerarPergunta();
            int respostaUsuario;
            do {
                respostaUsuario = scanner.nextInt();
                if (respostaUsuario != respostaCorreta) {
                    gerarMotivacao(TipoResposta.NEGATIVA);
                }
            } while (respostaCorreta != respostaUsuario);

            gerarMotivacao(TipoResposta.POSITIVA);

            System.out.println("Deseja continuar? sim -> 1 | não -> 0");
            escolha = scanner.nextInt();
        }
    }

    public static int gerarPergunta() {
        SecureRandom secureRandom = new SecureRandom();

        int numero1 = 1 + secureRandom.nextInt(10);
        int numero2 = 1 + secureRandom.nextInt(10);

        System.out.println("Quanto é " + numero1 + " vezes " + numero2);

        return numero1 * numero2;
    }

    public static void gerarMotivacao(TipoResposta tipoResposta) {
        SecureRandom secureRandom = new SecureRandom();
        int opcao = 1 + secureRandom.nextInt(4);

        if (tipoResposta == TipoResposta.POSITIVA) {
            switch (opcao) {

                case 1:
                    System.out.println("Muito bom!");
                    break;
                case 2:
                    System.out.println("Excelente!");
                    break;
                case 3:
                    System.out.println("Bom trabalho!");
                    break;
                case 4:
                    System.out.println("Mantenha um bom trabalho!");
                    break;
            }
        } else {
            switch (opcao) {
                case 1:
                    System.out.println("Não. Por favor, tente de novo.");
                    break;
                case 2:
                    System.out.println("Errado. Tente mais uma vez.");
                    break;
                case 3:
                    System.out.println("Não desista!");
                    break;
                case 4:
                    System.out.println("Não. Continue tentando.");
                    break;
            }
        }
    }

}
