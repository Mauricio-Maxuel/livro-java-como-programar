package org.maumas.ZZFazendoADiferencaExercicios.capitulo6.A6_38;

import java.security.SecureRandom;
import java.util.Scanner;

public class InstrucaoAuxiliadaGameficada {

    static Scanner scanner = new Scanner(System.in);

    public enum TipoResposta {
        NEGATIVA, POSITIVA
    }

    static int quantidadeTotalRespostas = 0;
    static int quantidadeRespostasCorretas = 0;


    public static void main(String[] args) {
        System.out.println("Bem vindo ao seu assistente de aprendizado!");

        System.out.println("Vamos começar com multiplicação");

        while (quantidadeTotalRespostas == 0) {
            System.out.println("Escolha um nível de dificuldade de 1 a 5");
            int nivel = scanner.nextInt();

            while (quantidadeTotalRespostas <= 10) {

                int respostaCorreta = gerarPergunta(nivel);
                int respostaUsuario;

                do {
                    respostaUsuario = scanner.nextInt();
                    if (respostaUsuario != respostaCorreta) {
                        gerarMotivacao(TipoResposta.NEGATIVA);
                    }
                    if (respostaUsuario == respostaCorreta) {
                        gerarMotivacao(TipoResposta.POSITIVA);
                    }
                } while (respostaCorreta != respostaUsuario && quantidadeTotalRespostas <= 10);
            }

            System.out.println();
            trataPorcentagemAcertos();
        }
    }

    private static void trataPorcentagemAcertos() {
        double porcentagemCorretas = quantidadeTotalRespostas * quantidadeRespostasCorretas;

        if (porcentagemCorretas < 75) {
            System.out.println("peça ajuda extra ao seu professor.");
        } else {
            System.out.println("Parabéns, você está pronto para avançar para o próximo nível!");
        }

        quantidadeRespostasCorretas = 0;
        quantidadeTotalRespostas = 0;
    }

    public static int gerarPergunta(int nivel) {
        SecureRandom secureRandom = new SecureRandom();

        int dezena = 1;

        for (int i = 1; i < nivel; i++) {
            dezena *= 10;
        }

        int inicial = dezena;

        int total = 0;
        while (dezena != 0) {
            total += dezena * 9;
            dezena /= 10;
        }

        int numero1 = inicial + secureRandom.nextInt(total);
        int numero2 = inicial + secureRandom.nextInt(total);

        System.out.println("Quanto é " + numero1 + " vezes " + numero2);

        return numero1 * numero2;
    }

    public static void gerarMotivacao(TipoResposta tipoResposta) {
        quantidadeTotalRespostas++;
        SecureRandom secureRandom = new SecureRandom();
        int opcao = 1 + secureRandom.nextInt(4);

        if (tipoResposta == TipoResposta.POSITIVA) {

            quantidadeRespostasCorretas++;

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
