package org.maumas.ZFazendoADiferencaExercicios.capitulo6.A6_39;

import org.maumas.ZFazendoADiferencaExercicios.capitulo6.A6_38.InstrucaoAuxiliadaGameficada;

import java.security.SecureRandom;
import java.util.Scanner;

public class InstrucaoAuxiliadaTiposProblema {

    static Scanner scanner = new Scanner(System.in);

    public enum TipoResposta {
        NEGATIVA, POSITIVA
    }

    public enum OPERADOR {
        ADICAO, SUBTRACAO, DIVISAO, MULTIPLICAO, ALEATORIO
    }

    static int quantidadeTotalRespostas = 0;
    static int quantidadeRespostasCorretas = 0;


    public static void main(String[] args) {
        System.out.println("Bem vindo ao seu assistente de aprendizado!");

        while (quantidadeTotalRespostas == 0) {
            System.out.println("Escolha um nível de dificuldade de 1 a 5");
            int nivel = scanner.nextInt();

            System.out.println("insira o tipo de operação: 1 -> adição | 2 -> subtração | 3 -> multiplicação | 4 -> divisão | 5 -> todos");
            int operador = scanner.nextInt();

            OPERADOR operadorEnum = selecionarOperador(operador);

            while (quantidadeTotalRespostas <= 10) {

                double respostaCorreta = gerarPergunta(nivel, operadorEnum);
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

    private static OPERADOR selecionarOperador(int operador) {
        return switch (operador) {
            case 1 -> OPERADOR.ADICAO;
            case 2 -> OPERADOR.SUBTRACAO;
            case 3 -> OPERADOR.MULTIPLICAO;
            case 4 -> OPERADOR.DIVISAO;
            case 5 -> OPERADOR.ALEATORIO;
            default -> null;
        };
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

    public static double gerarPergunta(int nivel, OPERADOR operador) {
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

        return comporPergunta(numero1, numero2, operador);
    }

    private static double comporPergunta(int numero1, int numero2, OPERADOR enumOperador) {
        SecureRandom secureRandom = new SecureRandom();
        int i = 1 + secureRandom.nextInt(4);

        double total = 0;
        char simbolo = 'N';

        switch (enumOperador) {
            case OPERADOR.ADICAO:
                total = numero1 + numero2;
                simbolo = '+';
                break;
            case OPERADOR.SUBTRACAO:
                total = numero1 - numero2;
                simbolo = '+';
                break;
            case OPERADOR.MULTIPLICAO:
                total = numero1 * numero2;
                simbolo = '+';
                break;
            case OPERADOR.DIVISAO:
                total = numero1 / numero2;
                simbolo = '+';
                break;
            case OPERADOR.ALEATORIO:
                comporPergunta(numero1, numero2, selecionarOperador(i));
        }

        System.out.println("Quanto é " + numero1 + " " + simbolo + " " + numero2);

        return total;
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
