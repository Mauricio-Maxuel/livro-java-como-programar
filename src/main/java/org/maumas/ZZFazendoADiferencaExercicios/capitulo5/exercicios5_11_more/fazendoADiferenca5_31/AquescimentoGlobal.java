package org.maumas.ZZFazendoADiferencaExercicios.capitulo5.exercicios5_11_more.fazendoADiferenca5_31;

import java.util.Scanner;

public class AquescimentoGlobal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pergunta[] questionario = Pergunta.populaPerguntas();


        System.out.println("Vamos Começar com o questionario");


        int quantidadeAcertos = 0;

        for (int i = 0; i < questionario.length; i++) {

            Pergunta pergunta = questionario[i];


            System.out.println("Pergunta numero:" + (i + 1));
            System.out.print(questionario[i].getContexto());
            System.out.println();

            for (int j = 0; j < pergunta.getPerguntas().length; j++) {
                String opcao = pergunta.getPerguntas()[j];
                System.out.println((j + 1) + " : " + opcao);
            }

            System.out.println("Marque sua resposta:");

            int escolha = scanner.nextInt();

            if ((escolha - 1) == pergunta.getRespostaCorreta()) {
                quantidadeAcertos++;
            }
        }

        if (quantidadeAcertos == 5) {
            System.out.println("Excelente");
        } else if (quantidadeAcertos == 4) {
            System.out.println("Muito bom");
        } else if (quantidadeAcertos <= 3) {
            System.out.println("É o momento de aprimorar seu conhecimento sobre o aquecimento global");
        }
    }

}
