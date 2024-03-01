package org.maumas.ZFazendoADiferencaExercicios.capitulo6.A6_35;

import java.security.SecureRandom;
import java.util.Scanner;

public class InstrucaoAssistida {

    static Scanner scanner = new Scanner(System.in);


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
                    System.out.println("Não. Por favor, tente de novo.");
                }
            } while (respostaCorreta != respostaUsuario);

            System.out.println("Muito bem!");

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

}
